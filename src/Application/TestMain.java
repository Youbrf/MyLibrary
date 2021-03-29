package Application;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.UUID;

import javax.management.remote.SubjectDelegationPermission;

public class TestMain {

	public static void main(String[] args) {
		
		
		/*public Person(UUID id,String name) {
			this.id=id;
			this.name = name;
			this.maxBooks = 3;
			this.registrationDate = LocalDate.now();
			this.books = new ArrayList<Book>();
		}*/
		
		 Person person = new Person(UUID.randomUUID(),"Francis le belge");
		  
		  
		  
		  
		/* public Book(String titles, String author, String language, int totalPages, double rentalprice) {

				this.titles = titles;
				this.author = author;
				this.language = language;
				this.totalPages = totalPages;
				this.rentalprice = rentalprice;
			}*/

		  Book book = new Book("Harry potter", "youssef", "francais", 220, 18);
		  Book book1 = new Book("Terminator", "monir", "dutch", 300, 22);
		
		  
		  
		  /** 
			 * Methodes d'emprunt d'un livre
			 * @param book
			 
			public void borrows(Book book,int year,int month,int day) {
				this.books.add(book);
				book.setBorrower(this);
				book.setBorrowingDate(LocalDate.now());
				book.setLoanPeriod(year, month, day);
			}*/
		  
		  
		  person.borrows(book,2021,03,20);
		  person.borrows(book1,2021,03,30);
		  
		  System.out.println(book);
		  System.out.println( person);
		 
		  
		 /* 
		  *  public void computeRemainingDays() {
				long noOfDaysBetween = LocalDate.now().until(loanPeriod, ChronoUnit.DAYS);
				System.out.println("Le nombre de jours restants est de =" + noOfDaysBetween);
			    }*/
		  
		  
		  book.computeRemainingDays();
		  book1.computeRemainingDays();
	
		 
	    
		 
		 
		
	}
}   
