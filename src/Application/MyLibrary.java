package Application;

import static java.time.temporal.ChronoUnit.DAYS;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;

import javax.swing.JOptionPane;

public class MyLibrary {
        /**
         * Nom de la bibliothèque
         */
        private String name;
        /**
         * Liste des livres
         */
        private ArrayList<Book> books;
        /**
         * Liste des membres
         */
        private ArrayList<Person> people;
        /**
         * Crée une bibliothèque en spécifiant son nom
         *
         * @param name Nom de la bibliothèque
         */
        public MyLibrary(String name) {
            this.name = name;
            this.books = new ArrayList<Book>();
            this.people = new ArrayList<Person>();
        }
        /**
         * Renvoie le nom de la bibliothèque*
         * @return Le nom de la bibliothèque
         */
        public String getName() {
            return name;
        }
        /**
         * Modifie le nom de la bibliothèque
         *
         * @param name Nouveau nom de la bibliothèque
         */
        public void setName(String name) {
            this.name = name;
        }
        /**
         * Renvoie la liste des livres
         *
         * @return la liste des livres
         */
        public ArrayList<Book> getBooks() {
            return books;
        }
        /**
         * Renvoie la liste des membres
         *
         * @return la liste des membres
         */
        public ArrayList<Person> getPeople() {
            return people;
        }

        //methods

        /**
         * Ajouter des livres
         * @param book
         */
        public void addBook(Book book) {
            this.books.add(book);
        }
        /**
         * Ajouter des membres
         * @param person
         */
        public void addPerson(Person person) {
                this.people.add(person);
            }
        /**
         * Afficher des livres
          * @return
         */
        public int printBooks() {
                int cpt = 0;
                Iterator<Book> it = this.getBooks().iterator();
                while(it.hasNext()) {
                    Book b = it.next();
                    System.out.println(++cpt + ": "+b.getTitle() + " - "+b.getAuthor());
                }
                return cpt;
            }
        /**
         * Afficher des membres
         * @return
         */
        public int printMembers() {
                int cpt = 0;
                Iterator<Person> itp = this.getPeople().iterator();
                while(itp.hasNext()) {
                    Person p = itp.next();
                    System.out.println(++cpt + ": " + p.getName());
                }
                return cpt;
            }
        /**
         * Trouver un membre au moyen de son nom.
         * @param name nom de la personne à chercher
         * @return
         */
        public Boolean findMemberByName(String name){
        	Boolean find = false; 
        	Iterator<Person> itp = this.getPeople().iterator();
        	while(itp.hasNext()) {
        		Person membre = itp.next();
        		if(name.equalsIgnoreCase(membre.getName())) {
        			System.out.println(membre);
        			find = true;
        		};
        	}
        	return find ;
        }
        /**
         * Récupérer les livres en retard,
         * @return retourne la liste des livres en retard
         */
        public ArrayList<Book> getAllLateBooks() {
			ArrayList<Book> bookresult = new ArrayList<>();
			Iterator<Book> itb = this.getBooks().iterator();
			while(itb.hasNext()) {
				Book bookcop = itb.next();
				long daysbetween = DAYS.between(LocalDate.now(),bookcop.getLoanPeriod());
				if(daysbetween < 0) {
					bookresult.add(bookcop);
				}
			}
        	return bookresult;
        }
        
        /**
         * charger des membres à partir d'un fichiers de sauvegarde au format CSV
         * @param filename nom du fichier CSV
         * @return
         */
        public int loadMembers(String filename) { 
        	int cpt = 0;
        	File f = new File(filename);
        	if(f.exists()) { 
        		FileReader fr = null; 
        		BufferedReader br = null; 
        		String[] data = null; 
        		try { 
        			try { 
        				fr = new FileReader(f); 
        				br = new BufferedReader(fr); 
        				//Convertir en objet Person 
        				//StringTokenizer st = new StringTokenizer(ligne, ";"); 
        				String ligne = br.readLine(); 
        				//Lire une ligne du fichier 
        				while ((ligne = br.readLine()) != null) {
        					//"a7aa0ae7-9ce3-44bc-a72a-894edb9a4653;Bob Smith;2;01-03-20" 
        					data = ligne.split(";"); 
        					Person p = new Person(UUID.fromString(data[0]), data[1]); 
        					//ajouter cette Person dans people 
        					this.people.add(p);
        					cpt++;
        					} 
        				} finally {
        					br.close();
        					fr.close();
        					} 
        			} catch (IOException e) {
        				
        			} 
        		} 
        	return cpt;
        	}
        /**
         * Charger des livres à partir d'un fichiers de sauvegarde au format CSV
         * @param filename
         * @return
         */
        public int loadBooks(String filename) {
			int cpt=0;
			File f = new File(filename);
        	if(f.exists()) { 
        		FileReader fr = null; 
        		BufferedReader br = null; 
        		String[] data = null; 
        		try { 
        			try { 
        				fr = new FileReader(f); 
        				br = new BufferedReader(fr); 
        				String ligne = br.readLine(); 
        				while ((ligne = br.readLine()) != null) { 
        					data = ligne.split(";"); 
        					Book book = new Book(data[0],data[1],Integer.parseInt(data[2]),Double.parseDouble(data[3]),data[4]); 
        					this.books.add(book);
        					cpt++;
        					} 
        				} finally {
        					br.close();
        					fr.close();
        					} 
        			} catch (IOException e) {
        				
        			} 
        		} 
        	return cpt;
        }
        /**
         * Enregistre les membres dans un fichier CSV
         * @param filename Chemin du fichier
         * @return
         */
        public int saveMembers(String filename) {
        	int cpt=0;
        	File file=new File(filename);
        	
        	if(!file.exists()) {
        		try {
					file.createNewFile();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "Impossible de crée le fichier, veuillez réessayer, Merci");
				}
        	}else {
        		FileWriter fw;
        		BufferedWriter bw;
        		PrintWriter pw;
				try {
					fw = new FileWriter(file);
					bw = new BufferedWriter(fw);
					pw = new PrintWriter(bw);
					Iterator<Person> itp = this.getPeople().iterator();
		               while(itp.hasNext()) {
		                   Person person = itp.next();
		                   pw.println(person.id+";"+person.getName()+";"+person.getMaxBooks()+";"+person.getRegistrationDate());
		                   cpt++;
		               }
		            JOptionPane.showMessageDialog(null, "Les membres ont bien été écrit dans le fichier");
					pw.flush();
					pw.close();
					bw.close();
					fw.close();
					
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null,"Mode Ruth , psaha la harira");
				}
        		
        		
        	}
        	
        	return cpt;
        }
        /**
         * Enregistre les livres dans un fichier CSV
         * @param filename Chemin du fichier
         * @return
         */
        public int saveBooks(String filename) {
        	int cpt=0;
        	File file=new File(filename);
        	
        	if(!file.exists()) {
        		try {
					file.createNewFile();
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null, "Impossible de crée le fichier, veuillez réessayer, Merci");
				}
        	}else {
        		FileWriter fw;
        		BufferedWriter bw;
        		PrintWriter pw;
				try {
					fw = new FileWriter(file);
					bw = new BufferedWriter(fw);
					pw = new PrintWriter(bw);
					Iterator<Book> itp = this.getBooks().iterator();
		               while(itp.hasNext()) {
		                   Book book1 = itp.next();
		                   pw.println(book1.getTitle()+";"
		                		   		+book1.getAuthor()+";"
		                		   		+book1.getTotalPages()+";"
		                		   		+book1.getRentalPrice()+";"
		                		   		+book1.getLanguage());
		                   cpt++;
		               }
		            JOptionPane.showMessageDialog(null, "Les membres ont bien été écrit dans le fichier");
					pw.flush();
					pw.close();
					bw.close();
					fw.close();
					
				} catch (IOException e) {
					JOptionPane.showMessageDialog(null,"Impossible d'écrire dans le fichier, veuillez fermer le document, merci");
				}
        		
        		
        	}
        	
        	return cpt;
        }
     
    @Override
        public String toString() {
            final int maxLen = 3;
            return "MyLibrary " + name + ":\n books =\n"
                    + (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + ",\npeople =\n"
                    + (people != null ? people.subList(0, Math.min(people.size(), maxLen)) : null);
        }

}
