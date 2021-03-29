package Application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public  class MyLibrary   {
	
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
	 public void menuLibrairy() {
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
	public void addBook(Book book) {
		this.books.add(book); 
		
		
	}
	
	/**
	 * 
	 * @param Ajout person
	 */
	
	public void addPerson(Person nvMembre) { 
		Scanner s = new Scanner(System.in);
		;
		System.out.println("-----Ajouter un membre-----");
		System.out.println("quelle est son nom");
		nvMembre.setName(name);
		
		for (int i =0;i< books.size();i++);
		}
	
	/**
	 * 
	 * @  methode d'affichage book
	 */
	public int printBooks() {
		int cpt = 0;
		Iterator it = this.getBooks().iterator();
		while(it.hasNext()) {
			Book b = it.next();
			System.out.println(++cpt + ": " +b.getTitle() + " - " +b.getAuthor()); 
			} 
		return cpt;
			}
	
	 /**
	  *  méthode  Obtenir tout les livres en retard
	  */
	
	public void GetAllLateBook () {
	}

	
    /**
     *  méthode trouver les membres par leurs noms
     */
	public void FindMemberByName() {
	}
	
	
	@Override
	public String toString() {
	final int maxLen = 3;
	return "MyLibrary " + name + ": books=" + (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + ", people=" + (people != null ? people.subList(0, Math.min(people.size(), maxLen)) : null);
	}
	

	
	
}
