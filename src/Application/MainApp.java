package Application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

import javax.swing.text.html.HTMLDocument.Iterator;

public class MainApp {

	public static void main(String[] args) {
		
		MyLibrary myBiblio = new MyLibrary("ICC");
		
		Person person = new Person(UUID.randomUUID(),"Monir");
	  	Person person1 = new Person(UUID.randomUUID(),"Younes");
	  	Person person2 = new Person(UUID.randomUUID(),"Moussa");
	  	Person person3 = new Person(UUID.randomUUID(),"Monir Boutiebi");
	  	Person person4 = new Person(UUID.randomUUID(),"Younes Lemti");
	  	Person person5 = new Person(UUID.randomUUID(),"Moussa Boulhout");
	  	Person person6 = new Person(UUID.randomUUID(),"Youssef Chennou");
		
	  	Book onepeace = new Book("One Peace - Arc Romance Dawn","Eiichiro Oda",456,1.2,"Français");
	  	Book onepeace1 = new Book("One Peace - Arc Village d'Orange","Eiichiro Oda",456,1.2,"Français");
	  	Book onepeace2 = new Book("One Peace - Arc Village de Sirop","Eiichiro Oda",456,1.2,"Français");
	  	Book onepeace3 = new Book("One Peace - Arc Baratie","Eiichiro Oda",456,1.2,"Français");
	  	Book onepeace4 = new Book("One Peace - Arc Arlong Park","Eiichiro Oda",456,1.2,"Français");
	  	Book onepeace5 = new Book("One Peace - Arc Les Aventures de Baggy","Eiichiro Oda",456,1.2,"Français");
	  	Book Naruto = new Book("Naruto - Au pays des vagues ","Masashi Kishimoto",324,1.4,"Français");
	  	Book Naruto1 = new Book("Naruto - L'Épreuve de survie ","Masashi Kishimoto",324,1.4,"Français");
	  	Book Naruto2 = new Book("Naruto - Kakashi, le ninja copieur ","Masashi Kishimoto",324,1.4,"Français");
	  	Book Naruto3 = new Book("Naruto - Les Miroirs de glace de Haku ","Masashi Kishimoto",324,1.4,"Français");
	  	Book dbz = new Book("Dragon ball Z","Akira Toriyama",278,1.1,"Français");
	  	Book dbz1 = new Book("Dragon ball Z super","Akira Toriyama",278,1.1,"Français");
	  	Book dbz2 = new Book("Dragon ball GT","Akira Toriyama",278,1.1,"Français");
	  	
	  	myBiblio.addPerson(person);
	  	myBiblio.addPerson(person1);
	  	myBiblio.addPerson(person2);
	  	myBiblio.addPerson(person3);
	  	myBiblio.addPerson(person4);
	  	myBiblio.addPerson(person5);
	  	myBiblio.addPerson(person6);
	  	
	  	myBiblio.addBook(onepeace);
	  	myBiblio.addBook(onepeace1);
	  	myBiblio.addBook(onepeace2);
	  	myBiblio.addBook(onepeace3);
	  	myBiblio.addBook(onepeace4);
	  	myBiblio.addBook(onepeace5);
	  	myBiblio.addBook(Naruto);
	  	myBiblio.addBook(Naruto1);
	  	myBiblio.addBook(Naruto2);
	  	myBiblio.addBook(Naruto3);
	  	myBiblio.addBook(dbz);
	  	myBiblio.addBook(dbz1);
	  	myBiblio.addBook(dbz2);
	  	
	  	person.borrows(onepeace3, 7);
	  	person.borrows(onepeace, 7);
	  	person1.borrows(Naruto1, 7);
	  	person.borrows(onepeace5, 7);
	  	person1.borrows(onepeace, 7);
	  	person3.borrows(onepeace4, 7);
	  	person4.borrows(onepeace1, 7);
	  	person4.borrows(Naruto2, 7);
	  	person4.borrows(dbz, 7);
	  	
		Scanner sc = new Scanner(System.in);
		
		System.out.println("\n  	-----	MENU	-----\n");
		System.out.println("		1. Ajouter un membre");
		System.out.println("		2. Ajouter un livre");
		System.out.println("		3. Emprunter un livre");
		System.out.println("		4. Afficher les statistiques");
		System.out.println("		0. Quitter");
		System.out.println("\n Veuillez choisir une option : ");
		
		int menu = sc.nextInt();
		sc.nextLine();
		if(menu>=0 && menu<=4) {
			switch (menu) {
			case 1:
				System.out.println("Quel est le nom du membre ?");
				String nomMembre = sc.nextLine();
				System.out.println("Quel est le nombre de livres maximum qu'il peut emprunter ?");
				int maxLivre = sc.nextInt();
				Person membre = new Person(nomMembre,(byte)maxLivre);
				System.out.println("Le membre a bien été créer : ");
				System.out.println(membre);
				myBiblio.addPerson(membre);
				break;
			case 2:
				System.out.println("Quel est le titre du livre ?");
				String title = sc.nextLine();
				System.out.println("Qui est l'auteur du livre ?");
				String author = sc.nextLine();
				System.out.println("Quel est le nombre de page du livre ?");
				int totalPages = sc.nextInt();
				System.out.println("Quel est le prix de location ?");
				double rentalPrice = sc.nextDouble();
				sc.nextLine();
				System.out.println("Quel est la langue du livre ?");
				String language = sc.nextLine();
				Book livre = new Book(title,author,totalPages,rentalPrice,language);
				System.out.println("Le livre a bien été créer : ");
				System.out.println(livre);
				myBiblio.addBook(livre);
				break;
			case 3:
				System.out.println("Quel est le titre du livre que vous voulez emprunter ?");
				String sTitre = sc.nextLine();
				Book bookborrow = myBiblio.searchBook(sTitre);
				System.out.println("Quel personne empruntera le livre ?");
				String personem = sc.nextLine();
				Person personborrow = myBiblio.findMemberByName(personem);
				System.out.println("Combien de jours voulez vous emprunter le livre ?");
				int daysBorrow = sc.nextInt();
				personborrow.borrows(bookborrow, daysBorrow);
				System.out.println("L'emprunteur : "+personborrow.getName()+", livre : "+bookborrow.getTitle()+", retour le : "+LocalDate.now().plusDays(daysBorrow));
				break;
			case 4:
				
				break;

			default:
				System.out.println("Bye bye, à bientôt !!");
				System.exit(-1);
				break;
			}
		}
		
		

	}

}
