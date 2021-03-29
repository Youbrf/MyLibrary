/**
 * 
 */
package Application;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;
import java.util.UUID;

/**
 * @author Moussa
 *
 */

public class Person   
 
// @formatter:on
 {
	 /**
	 * @param UUID
	 * @param name
	 * @param maxBooks
	 * @param registrationDate
	 * @param books
	 */
	protected UUID id;
	private String name;
	private int maxBooks;
	private LocalDate registrationDate;
	private ArrayList<Book>books ;
	
		
	public Person(UUID id,String name) {
		this.id=id;
		this.name = name;
		this.maxBooks = 3;
		this.registrationDate = LocalDate.now();
		this.books = new ArrayList<Book>();
	}
	
	/**
	 * @return the id
	 */
	public UUID getId() {
		return id;
	}

	
	/**
	 * @param id the id to set
	 */
	public void setId(UUID id) {
		this.id = id;
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
	 * @return the maxBooks
	 */
	public int getMaxBooks() {
		return maxBooks;
	}
	
	/**
	 * @param maxBooks the maxBooks to set
	 */
	public void setMaxBooks(int maxBooks) {
		this.maxBooks = maxBooks;
	}

	
	/**
	 * @return the registrationDate
	 */
	public LocalDate getRegistrationDate() {
		return registrationDate;
	}

	/**
	 * @param registrationDate the registrationDate to set
	 */
	public void setRegistrationDate(LocalDate registrationDate) {
		this.registrationDate = registrationDate;
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
	
	
	
	/** 
	 * Methodes d'emprunt d'un livre
	 * @param book
	 */
	public void borrows(Book book,int year,int month,int day) {
		this.books.add(book);
		book.setBorrower(this);
		book.setBorrowingDate(LocalDate.now());
		book.setLoanPeriod(year, month, day);
	}
	
	/**
	 * Méthode de restitution d'un livre
	 * @param book
	 */
	public void returns(Book book) {
		this.books.remove(book);
		book.setBorrower(null);
		book.setBorrowingDate(null);
		}
		

	
	@Override
	public String toString() {
		final int maxLen = 3;
	return "Person [" + id + ": " + name + " (maxBooks=" + maxBooks + ", inscrit le " + registrationDate + ")\n books=" + (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + "]";	
	}
	

  }

	


