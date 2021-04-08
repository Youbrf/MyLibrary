package Application;

public class Bingo {

	public static void main(String[] args) {
		MyLibrary Ixelle = new MyLibrary("Ixelle");
    	MyLibrary Uccle = new MyLibrary("Uccle");
    	
    	System.out.println(Ixelle);
    	
    	Person youssef = new Person("bingo",(byte)3);
    	
    	Book onepeace = new Book("One Peace","Eiichiro Oda",456,1.2,"Français");
		
		Ixelle.addPerson(youssef);
//		youssef.borrows(onepeace, 2021, 10, 3);
		Ixelle.addBook(onepeace);
		System.out.println("----------------------------------------------------------------------------");
		
		System.out.println(Ixelle);

	}

}
