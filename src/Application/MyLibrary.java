package Application;

import java.awt.Container;
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
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

import javax.swing.JOptionPane;

import java.time.temporal.*;


public  class MyLibrary    {
	

	
	/** 
	 * Nom de la bibliothèque
	 * Liste des membres
	 * Liste des livres
	 */
	private String name;
	private ArrayList<Person> people;
	private ArrayList<Book> books ;

	
	
	
	
	/**
	 * @param name
	 * @param people
	 * @param books
	 */
	public MyLibrary(String name) {
		this.name = name;
		this.people =  new ArrayList<Person>();
		this.books = new ArrayList<Book>();
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the people
	 */
	public ArrayList<Person> getPeople() {
		return people;
	}

	/**
	 * @param people the people to set
	 */
	public void setPeople(ArrayList<Person> people) {
		this.people = people;
	}

	/**
	 * @return the books
	 */
	public ArrayList<Book> getBooks() {
		return books;
	}

	/**
	 * @param books the books to set
	 */
	public void setBooks(ArrayList<Book> books) {
		this.books = books;
	}
	
	/** METHODE AFFICHAGE LIBRARY
	 * 
	 */
	 public static  void menuLibrairy() {
		 
	        System.out.println("			MENU DE LA LIBRAIRY");
			System.out.println("------------------------------------------------------------------");
			System.out.println("	1 - Ajouter un membre");
			System.out.println("	2 - Ajouter un livre ");
			System.out.println("	3 - Emprunter un livre");
			System.out.println("	4 - Afficher les statistique de la librairy");
			System.out.println("	0 - quitter");
	 }	   
			
	
	/**
	 * 
	 * @param Ajout book
	 */
	public  void addBook(Book book) {
		this.books.add(book);
	}
	
	/**
	 * 
	 * @param Ajout person
	 */
	public  void addPerson(Person person) { 
		this.people.add(person);
	}
	
	/**
	 * @param supprimer book
	 */
   public void deleteBook(Book book) {
	      this.books.remove(book);
   }
	
   /**
	 * @param supprimer book
	 */
  public void deleteBook(Person person) {
	      this.people.remove(person);
  }
	

	/**
	 * 
	 * @  methode d'affichage book
	 */
	
	public int printBooks() {
		int cpt = 0;
		Iterator<Book> it = this.getBooks().iterator();
		while(it.hasNext()) {
			Book b = (Book) it.next();
			System.out.println(++cpt + ": " +b.getTitles() + " - " +b.getAuthor()); 
			} 
		return cpt;
			}
	
	
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
	
	 
	 public int loadBooks(String filename) { 
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
	     				//Convertir en objet Book 
	     				//StringTokenizer st = new StringTokenizer(ligne, ";"); 
	     				String ligne = br.readLine(); 
	     				//Lire une ligne du fichier 
	     				while ((ligne = br.readLine()) != null) {
	     					
	     					data = ligne.split(";"); 
	     					Book p = new Book((data[0]), data[1],data[2], Double.parseDouble(data[3]),Integer.parseInt(data[4])); 
	     					//ajouter ce livre dans "Book"
							this.books.add(p);
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
	  *  Sauvegarder les "MEMBRES" :
	  */
	 
	 public int saveMembers(String filename) { 
	     	int cpt = 0;
	     	File f = new File(filename);
	     	if(f.exists()) { 
	     		FileWriter fw = null; 
	     		BufferedWriter bw = null; 
	     	    PrintWriter pw = null; 
	     		try { 
	     			try { 
	     				fw = new FileWriter(f); 
	     				bw = new BufferedWriter(fw); 
	     				pw = new PrintWriter(bw);
	     				 
	     				
	     				Iterator<Person> itp = this.getPeople().iterator();
			               while(itp.hasNext()) {
			                   Person person = itp.next();
			                   pw.println(person.id+";"+person.getName()+";"+person.getMaxBooks()+";"+person.getRegistrationDate());
			                   cpt++;
			               }
	     				}finally {
	     					pw.flush();
	     					pw.close();
	     					bw.close();
	     					fw.close();
	     					} 
	     			} catch (IOException e) {
	     				JOptionPane.showMessageDialog(null, "Tu ne peux pas écrire dans le fichier pour le moment Moussa !!!!!!!");
	     			} 
	     		} 
	     	return cpt;
	 }
	 
	 
	 /**
	  *  Sauvegarder un "Book :
	  */
	 
	 public int saveBooks(String filename) { 
	     	int cpt = 0;
	     	File f = new File(filename);
	     	if(f.exists()) { 
	     		FileWriter fw = null; 
	     		BufferedWriter bw = null; 
	     	    PrintWriter pw = null; 
	     		try { 
	     			try { 
	     				fw = new FileWriter(f); 
	     				bw = new BufferedWriter(fw); 
	     				pw = new PrintWriter(bw);
	     				 
	     				Iterator<Book> itp = this.getBooks().iterator();
			               while(itp.hasNext()) {
			                   Book book = itp.next();
			                   fw.append(book.getTitles()+(",")
			                		   +book.getAuthor()+(",")
			                		   +book.getLanguage()+(",")
			                		   +book.getTotalPages()+(",")
			                		   +book.getRentalprice()+(",")
			                		   +book.getBorrowingDate()+(",")
			                		   +book.getLoanPeriod());
			                   cpt++;
			               }
	     				}finally {
	     					pw.flush();
	     					pw.close();
	     					bw.close();
	     					fw.close();
	     					} 
	     			} catch (IOException e) {
	     				JOptionPane.showMessageDialog(null, "Tu ne peux pas écrire dans le fichier pour le moment Moussa !!!!!!!");
	     			} 
	     		} 
	     	return cpt;
	 }

	 
	 
       /**
        * méthode  Obtenir tout les livres en retard
     * @return 
        */
	
	
	  public ArrayList<Book> getAllLateBook () {
		  
		ArrayList<Book> list= new ArrayList<>();
		Iterator <Book> iter = this.getBooks().iterator();
	    while (iter.hasNext()) {
	    	
	    	Book bookRetard = iter.next();
	    	 
	    	
			if(bookRetard.computeRemainingDays() <= 0) {
				list.add(bookRetard);
			
			}
		}
    	return list;
    }
	     	
	    
	
	    	
	    	
		

		
    	
	
    
	/**
     *  méthode trouver les membres par leurs noms
	 * @return 
	 * @return 
     */
	
	    public Person findMembersName(String name) {
		Scanner clavier = new Scanner(System.in);
		int cpt = 0;
    	ArrayList<Person> membreCorrespondant = new ArrayList<>();
    	ArrayList<Person> membreQuotasBookAtteind = new ArrayList<>();
    	Iterator<Person> itp = this.getPeople().iterator();
    	while(itp.hasNext()) {
    		Person membre = itp.next();
    		
    		if(membre.getName().equals(name) && membre.getBookEmprunte() < membre.getMaxBooks()) {
    			membreCorrespondant.add(membre);
    		}else if(membre.getName().equals(name) && membre.getBookEmprunte() >= membre.getMaxBooks()){
    			membreQuotasBookAtteind.add(membre);
    		};
		}
    	System.out.println("Personne pouvant emprunter : ");
    	for (Person person : membreCorrespondant) {
			System.out.println(++cpt +" : "+ person.getName()+" - livre emprunté : "+person.getBookEmprunte());
		}
    	System.out.println("Personne ne pouvant plus emprunter :");
    	for (Person person : membreQuotasBookAtteind) {
			System.out.println(person.getName()+" - livre emprunté : "+person.getBookEmprunte());
		}
    	System.out.println("Introduiser le numero du membre qui correspond a votre choix :");
    	return membreCorrespondant.get(clavier.nextInt()-1);
	}
	
   
	public Book searchBook(String titre) {
		
	
		Scanner clavier = new Scanner(System.in);
		
    	int cpt = 0;
    	ArrayList<Book> bookDisponible = new ArrayList<>();
    	ArrayList<Book> bookIndisponible = new ArrayList<>();
    	
    	Iterator<Book> itb = this.getBooks().iterator();
    	while(itb.hasNext()) {
    		Book BookEmprunte = itb.next();
    		if(BookEmprunte.getTitles().contains(titre) && !BookEmprunte.isEmprunte()){
    			bookDisponible.add(BookEmprunte);
    		}else if (BookEmprunte.getTitles().contains(titre) && BookEmprunte.isEmprunte()){
    			bookIndisponible.add(BookEmprunte);
    		}
    	}
    	
    	System.out.println("Livre disponible : ");
    	for (Book book : bookDisponible) {
			System.out.println(++cpt +" : "+ book.getTitles());
		}
    	System.out.println("Livre non disponible :");
    	for (Book book : bookIndisponible) {
			System.out.println(book.getTitles());
		}
    	System.out.println("Introduiser le numero du livre que vous voulez emprunter :");
		int choixEmprunt = clavier.nextInt();

		return bookDisponible.get(choixEmprunt-1);
    }
		
		
		
		
		
	
	
	
	
	
	@Override
	public String toString() {
	final int maxLen = 10;
	return "MyLibrary " + name 
			+ ": \nbooks=\n" + (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) 
			+ ",\npeople=\n" + (people != null ? people.subList(0, Math.min(people.size(), maxLen)) : null);
	}

	

	
	
	
	
		
	}

	
	
	

	
	

