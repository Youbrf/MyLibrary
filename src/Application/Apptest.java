package Application;

import java.util.Scanner;
import java.util.UUID;

import javax.swing.JOptionPane;

public class Apptest {
    public static void main(String[] args) {
    
    	
    	   	 MyLibrary mlib = new MyLibrary("bingo");
         
    	   	 System.out.println(mlib);
         
    	  	 System.out.println("------------------------------------------------------------");
    	
    	  	 System.out.println("------------------------------------------------------------");
    	  	 
    	  	 Person person = new Person(UUID.randomUUID(),"Bilal");
    	  	 Person person1 = new Person(UUID.randomUUID(),"Youssef");
    	  	 Person person2 = new Person(UUID.randomUUID(),"Moussa");
    	  	 
    	  	 mlib.addPerson(person);
    	  	 mlib.addPerson(person1);
    	  	 mlib.addPerson(person2);
    	  	 
    	  	 System.out.println(mlib);
    	  	 
    	  	 System.out.println("------------------------------------------------------------");
    	  	 System.out.println("------------------------------------------------------------");
    	  	 
    	  	 mlib.findMemberByName("bilal");
        
    }
}
