package Code;

import java.time.LocalDate;
/**
 * 
 * @author Khalid-Moussa-Monir-Youssef-YoussefL
 *
 */
public class Person {
	/**
	 * name , le nom de la personne
	 */
	private String name;
	/**
	 * maxBooks, Le nombre maximum de livres physiques que cette personne peut emprunter en même temps 
	 */
	private byte maxBooks;
	/**
	 * registrationDate, La date d'incription de la personne
	 */
	private LocalDate registrationDate;
	
	/**
	 * Contructeur d'une personne
	 * @param name nom de la personne	
	 * @param maxBooks	nombre maximum de livres physiques que cette personne peut emprunter en même temps
	 * @param registrationDate date d'inscription
	 */
	public Person(String name, byte maxBooks, LocalDate registrationDate) {
		super();
		this.name = name;
		this.maxBooks = maxBooks;
		this.registrationDate = registrationDate;
	}
	
	
}
