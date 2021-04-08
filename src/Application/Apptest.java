package Application;

import java.util.Scanner;
import java.util.UUID;

import javax.swing.JOptionPane;

public class Apptest {
    public static void main(String[] args) {
    
    	
    	   	 MyLibrary mlib = new MyLibrary("bingo");
         
    	   	 System.out.println(mlib);
         
    	  	 System.out.println("------------------------------------------------------------");

    	  	 mlib.loadMembers("database/membres.csv");
    	
    	  	 System.out.println("------------------------------------------------------------");
         
    	  	 System.out.println(mlib);
    	  	 
    	  	 Person person = new Person(UUID.randomUUID(),"Bilal");
    	  	 
    	  	 mlib.addPerson(person);
    	  	 
    	  	 System.out.println("------------------------------------------------------------");
    	  	 System.out.println("------------------------------------------------------------");
    	 
    	  	 System.out.println(mlib);
    	  	 
    	  	 mlib.saveMembers("database/membres.csv");
    	  	 
        
    }
}
