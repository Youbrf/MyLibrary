package Code;

import java.util.ArrayList;
/**
 * 
 * @author Khalid-Moussa-Monir-Youssef-YoussefL
 *
 */
public class MyLibrary {
	private String name; 
	private ArrayList<Book> books = new ArrayList<Book>();
	
	/**
	 * Contructeur de Mylibrary
	 * @param name Le nom de MyLibrary
	 * @param books La liste de livre se trouvant dans MyLibrary
	 */
	public MyLibrary(String name, ArrayList<Book> books) {
		super();
		this.name = name;
		this.books = books;
	}
	
	
	
}
