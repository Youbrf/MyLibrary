package Application;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.UUID;

import javax.management.remote.SubjectDelegationPermission;

public class TestMain {

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
		      Book book1 = new Book("Harry petter", "Jacques Prevert", "francais", 300,28);
		      Book book35 = new Book("Harry potter faze", "youssef", "francais", 220, 18);
		      Book book14 = new Book("Harry petter aas", "Jacques Prevert", "francais", 300,28);
		      Book book231 = new Book("Harry potter eza", "youssef", "francais", 220, 18);
		      Book book155 = new Book("Harry petter trtr", "Jacques Prevert", "francais", 300,28);
		      Book book2 = new Book("Le magicien d'oz", "Delanoé", "francais", 220, 20);
		      Book book3 = new Book("Terminator", "monir", "dutch", 100, 25);
		      Book book4 = new Book("L' ariol et le ouchane", "youssef", "marocain", 35, 18);
		      Book book5 = new Book("Casa del Zaio", "Mahmoud", "Tunisien", 320, 21);
		 
		 
		 //-----ADD BOOK AT THE LIBRARY-----
		      library.addBook(book);
		      library.addBook(book1);
		      library.addBook(book2);
		      library.addBook(book3);
		      library.addBook(book4);
		      library.addBook(book5);
		      library.addBook(book155);
		      library.addBook(book231);
		      library.addBook(book14);
		      library.addBook(book35);
		 //-----PERSON TO BORROW BOOK-----
		      person.borrows(book2, 2021, 04, 14);
		      person1.borrows(book, 2021, 04, 12);
		      person2.borrows(book1, 2021, 04, 30);
		      person1.borrows(book3, 2021, 04, 19);
		      person1.borrows(book4, 2021,04 , 29);
		 
		      Book test = library.searchBook("Harry");
		      System.out.println("\n\n Voici le livre = \n"+test);
		 //-----RESTITUTION EN NOMBRES DE JOURS----- 
		     /** book.computeRemainingDays();
		      book1.computeRemainingDays();
	      
        //-----Find MEMBRE-----
		      library.findMembersName("youssef");
		 
		//-----LOOK ALL BOOK-----
		      System.out.println(library.getAllLateBook());
		      
		  
		 
		 //-----SAVE AND LOAD MEMBERS----- 
		      library.saveMembers("database/membres.csv");
		      library.loadMembers("database/membres.csv");
		      System.out.println(library.getPeople());
		 
		      System.out.println("***************************************************************************************");
		 
		 //-----SAVE AND LOAD BOOK-----
		      library.saveBooks("Application/book.csv");
		      library.loadBooks("Application/book.csv");
		      System.out.println(library.getBooks());*/
		 
		      
		  		 	  
		  			
		  			
		  			
		 }
		  		
		  	
		  		
	}
   
