package Application;

import java.util.UUID;

public class LoadSave {

	public static void main(String[] args) {
		
		
		MyLibrary library = new MyLibrary("Normandie");
		/**System.out.println("-------------------- AVANT LOADMEMBER ------------------------");
		System.out.println(library);
		System.out.println("-------------------- APRES LOADMEMBER ------------------------");
		
		library.loadMembers("database/membres.csv");
		System.out.println(library);
		
		
		
		
		System.out.println("-------------------- AVANT LOADBOOK ------------------------");
		System.out.println(library);
		System.out.println("-------------------- APRES LOADBOOK ------------------------");
		
	
		
		library.saveBooks("Application/Book.csv");
		
		System.out.println(library);*/
		  Person person = new Person(UUID.randomUUID(),"Francis le belge");
		  Person person1 = new Person(UUID.randomUUID(),"Youssef");
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
	      Book book4 = new Book("L' ariol et le ouchane", "youssef", "marocain", 35, 18);
	      Book book5 = new Book("Casa del Zaio", "Mahmoud", "Tunisien", 320, 21);
	 
	 
	 //-----ADD BOOK AT THE LIBRARY-----
	      library.addBook(book);
	      library.addBook(book1);
	      library.addBook(book2);
	      library.addBook(book3);
	      library.addBook(book4);
	      library.addBook(book5);
	 
	//library.findMembersName("rOSTOM");
		
	     System.out.println(book.getBorrowingDate());
	     
	     library.getAllLateBook();
}
}