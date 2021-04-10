package Application;

import java.util.Scanner;
import java.util.UUID;

import javax.swing.JOptionPane;

public class Apptest {
    public static void main(String[] args) {
    
    		// Création de la librairie
    	   	 MyLibrary mlib = new MyLibrary("bingo");
         // afficher la librairie
    	   	 System.out.println(mlib);
         
    	  	 System.out.println("------------------------------------------------------------");
    	
    	  	 System.out.println("------------------------------------------------------------");
    	  // creation de trois personne	 
    	  	 Person person = new Person(UUID.randomUUID(),"Bilal");
    	  	 Person person1 = new Person(UUID.randomUUID(),"Youssef");
    	  	 Person person2 = new Person(UUID.randomUUID(),"Moussa");
    	  // creation de trois livres	 
    	  	Book onepeace = new Book("One Peace","Eiichiro Oda",456,1.2,"Français");
    	  	Book Naruto = new Book("Naruto","Masashi Kishimoto",324,1.4,"Français");
    	  	Book dbz = new Book("Dragon ball Z","Akira Toriyama",278,1.1,"Français");
    	  // ajout des personnes dans la librairie ( mlib )	 
    	  	 mlib.addPerson(person);
    	  	 mlib.addPerson(person1);
    	  	 mlib.addPerson(person2);
    	  // ajout des livres dans la librairie ( mlib ) 
    	  	 mlib.addBook(onepeace);
    	  	 mlib.addBook(Naruto);
    	  	 mlib.addBook(dbz);
    	  // emprunt de livres 
    	  	 person1.borrows(dbz, 2, 03, 2021);
    	  	 person2.borrows(Naruto, 13, 05, 2021);
    	  	 person1.borrows(onepeace, 9, 04, 2021);
    	  // affichage de la librairie 
    	  	 System.out.println(mlib);
    	  	 
    	  	 System.out.println("------------------------------------------------------------");
    	  	 System.out.println("------------------------------------------------------------");
    	  // affichage des livres en retard 
    	  	 System.out.println(mlib.getAllLateBooks());
        
    }
}
