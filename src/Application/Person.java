/**
 * 
 */
package Application;

import java.sql.Date;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
import java.util.Scanner;
import java.util.UUID;

/**
 * @author Moussa
 *
 */

public class Person  {
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
	private int bookEmprunte;
		
	
	/**
	 * @param name
	 * @param id
	 * @param name2
	 * @param maxBooks
	 * @param registrationDate
	 * @param books
	 */
	
	public Person(UUID id,String name) {
		this.id=UUID.randomUUID();
		this.name =name;
		this.maxBooks = 3;
		this.registrationDate = LocalDate.now();
		this.books = new ArrayList<Book>();
		this.bookEmprunte=0;
	}
	
	
	public Person(String name,int maxbooks) {
		this.id=UUID.randomUUID();
		this.name =name;
		this.maxBooks = 3;
		this.registrationDate = LocalDate.now();
		this.books = new ArrayList<Book>();
		this.bookEmprunte=0;
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
	 */
	public void borrows(Book book,int years,int month,int daysOfMonth) {
		
		 if(this.bookEmprunte < this.maxBooks ) {
	        	this.books.add(book);
	        	book.setBorrower(this);
	        	book.setBorrowingDate(LocalDate.now());
	        	book.setLoanPeriod(years,month,daysOfMonth);
	        	this.bookEmprunte =  this.bookEmprunte + 1;
	        	book.setEmprunte(true);
	        }else {
	        	System.out.println(this.getName() +" Le nombre de livre emprunté est déjà atteint, veuillez restituer un livre pour en prendre un nouveau.");
	        }
	}
	
	/**
	 * Méthode de restitution d'un livre
	 * @param book
	 */
	public void returns(Book book) {
		this.books.remove(book);
		book.setBorrower(null);
	    book.setBorrowingDate(null);
	    this.bookEmprunte = this.bookEmprunte-1;
    }
	
		

	
	@Override
	public String toString() {
		final int maxLen = 3;
	return "Person [" + id + ": " + name + " (maxBooks=" + maxBooks + ", inscrit le " + registrationDate + ")\n books=" + (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + "]\n";	
	}


	public int getBookEmprunte() {
		return bookEmprunte;
	}


	public void setBookEmprunte(int bookEmprunte) {
		this.bookEmprunte = bookEmprunte;
	}


	

	public void borrows(LocalDate loanPeriod) {
		// TODO Auto-generated method stub
		
	}
	
  }

	


