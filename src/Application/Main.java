package Application;

import java.time.LocalDate;
import java.time.Year;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Main {

	
	
	public static void main(String[] args) {
		
		//-----CREATE LIBRARY-----
	      MyLibrary library = new MyLibrary("Normandie");
	
	
	//-----CREATE PERSON-----
	      Person person = new Person(UUID.randomUUID(),"Francis le belge");
	      Person person1 = new Person(UUID.randomUUID(),"youssef"); 
	      Person person2 = new Person(UUID.randomUUID(),"Rostom");
		  Person person3 = new Person(UUID.randomUUID(),"Alfred");
		  Person person4 = new Person(UUID.randomUUID(),"younes"); 
		  Person person5 = new Person(UUID.randomUUID(),"Alphonse");
	 
	 //-----ADD PERSON AT THE LIBRARY-----
	      library.addPerson(person);
	      library.addPerson(person1);
	      library.addPerson(person2);
	      library.addPerson(person3);
	      library.addPerson(person4);
	      library.addPerson(person5);
	 
	//-----CREATE BOOK-----
	      Book book = new Book("Harry potter", "youssef", "francais", 220, 18);
	      Book book1 = new Book("Harry petter", "Jacques Prevert", "francais", 300, 25);
	      Book book2 = new Book("Le magicien d'oz", "Delanoé", "francais", 220, 20);
	      Book book3 = new Book("Terminator", "monir", "dutch", 100, 25);
	      Book book4 = new Book("L'ariol et le ouchane", "youssef", "marocain", 35, 18);
	      Book book5 = new Book("Casa del Zaio", "Mahmoud", "Tunisien", 320, 21);
	 
	 
	 //-----ADD BOOK AT THE LIBRARY-----
	      library.addBook(book);
	      library.addBook(book1);
	      library.addBook(book2);
	      library.addBook(book3);
	      library.addBook(book4);
	      library.addBook(book5);
	 
	 //-----PERSON TO BORROW BOOK-----
	      person.borrows(book2, 2021, 04, 19);
	      person1.borrows(book, 2021, 04, 20);
	      person2.borrows(book1, 2021, 04, 30);
	      person4.borrows(book5, 2021, 05, 01);
	      person1.borrows(book3, 2021, 04, 19);
	      person1.borrows(book4, 2021,04 , 29);
	 
	 
	 
	/** //-----RESTITUTION EN NOMBRES DE JOURS----- 
	      book.computeRemainingDays();
	      book1.computeRemainingDays();
    
     //-----Find MEMBRE-----
	      library.findMembersName("youssef"); 
	 
	 //-----LOOK ALL BOOK-----
	      library.getAllLateBook();
	 
	 
	 //-----SAVE AND LOAD MEMBERS----- 
	      library.saveMembers("database/membres.csv");
	      library.loadMembers("database/membres.csv");
	      System.out.println(library.getPeople());
	 
	      System.out.println("***************************************************************************************");
	 
	 //-----SAVE AND LOAD BOOK-----
	      library.saveBooks("Application/book.csv");
	      library.loadBooks("Application/book.csv");
	      System.out.println(library.getBooks());*/
	 
	
		
	
			
		
			
             Scanner clavier = new Scanner(System.in);
			
            MyLibrary.menuLibrairy();
			   
			   int choix = clavier.nextInt();
			   clavier.nextLine();
				if(choix >= 1 && choix<=4) {
					switch (choix) {
					case 1:
						System.out.println("Quel est le nom du membre ?");
						String nameMember = clavier.nextLine();
						
						System.out.println("Quel est le nombre de livres maximum que le membre peut emprunter ?");
						int maxBook = clavier.nextInt();
						
						Person member = new Person( nameMember,maxBook);
					
						System.out.println("Le membre a bien été créer : ");
						System.out.println(member);
						library.addPerson(member);
						
						
						break;
					case 2:
						System.out.println("Quel est le titre du livre ?");
						String title = clavier.nextLine();
						
						System.out.println("Qui est l'auteur du livre ?");
						String author = clavier.nextLine();
						
						System.out.println("Quel est le nombre de page du livre ?");
						int totalPages = clavier.nextInt();
						
						System.out.println("Quel est le prix de location ?");
						double rentalPrice = clavier.nextDouble();
						clavier.nextLine();
						
						System.out.println("Quel est la langue du livre ?");
						String language = clavier.nextLine();
						
						Book livre = new Book(title,author,language,rentalPrice,totalPages);
						System.out.println("Le livre a bien été créer : ");
						System.out.println(livre);
						library.addBook(livre);
						break;
					case 3:
						System.out.println("Quel est le titre du livre que vous voulez emprunter ?");
						String Titre = clavier.nextLine();
						Book bookborrow = library.searchBook(Titre);
						
						System.out.println("Quel personne empruntera le livre ?");
						String membre = clavier.nextLine();
						Person personborrow = library.findMembersName(membre);
						
						System.out.println("Combien de jours voulez vous emprunter le livre ?");
						int daysBorrow = clavier.nextInt();
						
						person.borrows(bookborrow.getLoanPeriod());
						System.out.println("L'emprunteur : "+( (Person) personborrow).getName()+", livre : "+bookborrow.getTitles()+", retour le : "+LocalDate.now().plusDays(daysBorrow));
						break;
					case 4:
						
						try (Scanner scanner = new Scanner(System.in)) {
							String affiche;
						
							
								do {
									System.out.println("Taper A pour afficher le menu des statistiques ");
									affiche = scanner.nextLine().toUpperCase();
										if(affiche.equalsIgnoreCase("A")) {
											System.out.println("			MENU DES STATISTIQUE");
											System.out.println("------------------------------------------------------------------");
											System.out.println("	a - nombre total de livres et de membres");
											System.out.println("	b - nombre de livres électroniques et de romans graphiques");
											System.out.println("	c- nombres de membres qui ont un livre en emprunt");
											System.out.println("	d- nombre de livres empruntés");
											System.out.println("	e - nombre de livres en retard");
											System.out.println("	f - quitter");
										}else {
											System.out.println("Votre entrer au clavier est incorrecte réessayer");
										}
								
					
					           } while (!affiche.equalsIgnoreCase("A"));
								   System.out.println("\n             Introduiser votre choix");
								   
								      char choix2= scanner.next().charAt(0);
								         
									switch (choix2) {
									case 'a':
										System.out.println("Nombre total de livres = "+library.getBooks().size()+" livre(s).");
										System.out.println("Nombre total de membres = "+library.getPeople().size()+" membre(s).");
										break;
									case 'b':
                                            System.out.println("Pas de livres électroniques");
										break;
									case 'c':
										int cpt = 0;
										for (Person p : library.getPeople()) {
											if(p.getBookEmprunte()!=0) {
												cpt++;
											}
										}
										System.out.println("Nombre de membre qui on un livre en emprunt = "+cpt);
										break;
									case 'd':
										int cpt1 = 0;
										for (Book b : library.getBooks()) {
											if(b.getPerson()!=null) {
												cpt1++;
											}
										}
										System.out.println("Nombre de livres empruntés = "+cpt1);
										break;
									case 'e':
										int cpt2=0;
										for (Book b	: library.getBooks()) {
											if(b.getPerson()!=null && b.computeRemainingDays()<=0) {
												cpt2++;
											}
										}
										System.out.println("Nombre de livres en retard = "+cpt2);
										break;

									default:
										System.out.println("Veuillez introduire un caractere suivant : a,b,c,d,e ");
										break;	
								
							
									}
					
								break;
							
						}default:
					 System.out.println("Vous avez quitter le programme");
					 System.exit(-1);
						break;
						
					}
					}
					}
					}
				
				
	
				

	

		
		
		
		
	
