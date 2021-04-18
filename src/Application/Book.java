/**
 * 
 */
package Application;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import  static java.time.temporal.ChronoUnit.DAYS;
import java.util.Date;
import java.time.temporal.*;
/**
 * @author Moussa
 *
 */
public class Book  {
	
	
	
	/**
	 * Titre du livre
	 * Nom de l'auteur
	 * Languages du livre
	 * Nombre total de pages
	 * Le prix de la location
	 * L'emprunteur
	 * Date de l'emprunt
	 * Durée de l'emprunt
	 */
  private String titles,author,language;
  private double rentalprice;
  private int totalPages;
  private Person person;
  private LocalDate borrowingDate;
  private LocalDate loanPeriod;
  private boolean emprunte;
  private int years;
  private int month;
  private int days;

 // --Constructeur "BOOK"--

  /**
   * @param titles
   * @param author
   * @param language
   * @param rentalprice
   * @param totalPages
   * @param borrowingDate
   
   */
  public Book(String titles, String author, String language, double rentalprice, int totalPages
  		) {
  	super();
  	this.titles = titles;
  	this.author = author;
  	this.language = language;
  	this.rentalprice = rentalprice;
  	this.totalPages = totalPages;
  	this.emprunte=false;
  	this.loanPeriod=loanPeriod;
  	this.years=years;
  	this.month=month;
  	this.days= days;
  }

/**
 * @return the titles
 */
public String getTitles() {
	return titles;
}




/**
 * @param titles the titles to set
 */
public void setTitles(String titles) {
	this.titles = titles;
}


/**
 * @return the author
 */
public String getAuthor() {
	return author;
}


/**
 * @param author the author to set
 */
public void setAuthor(String author) {
	this.author = author;
}


/**
 * @return the language
 */
public String getLanguage() {
	return language;
}


/**
 * @param language the language to set
 */
public void setLanguage(String language) {
	this.language = language;
}




/**
 * @return the rentalprice
 */
public double getRentalprice() {
	return rentalprice;
}


/**
 * @param rentalprice the rentalprice to set
 */
public void setRentalprice(double rentalprice) {
	this.rentalprice = rentalprice;
}


/**
 * @return the totalPages
 */
public int getTotalPages() {
	return totalPages;
}


/**
 * @param totalPages the totalPages to set
 */
public void setTotalPages(int totalPages) {
	this.totalPages = totalPages;
}


/**
 * @return the person
 */
public Person getBorrower() {
	return person;
}


/**
 * @param person the person to set
 */
public void setBorrower(Person person) {
	this.person = person;
}


/**
 * @return the person
 */
public Person getPerson() {
	return person;
}

/**
 * @param person the person to set
 */
public void setPerson(Person person) {
	this.person = person;
}

/**
 * @return the borrowingDate
 */
public LocalDate getBorrowingDate() {
	return borrowingDate;
}


/**
 * @param borrowingDate the borrowingDate to set
 */
public void setBorrowingDate(LocalDate borrowingDate) {
	this.borrowingDate = borrowingDate;
}


/**
 * @return the loanPeriod
 */
public LocalDate getLoanPeriod() {
	return loanPeriod;
}


/**
 * @param loanPeriod the loanPeriod to set
 */
public void setLoanPeriod(LocalDate loanPeriod) {
	this.loanPeriod = loanPeriod;
}


/**
 * @return the isEmprunte
 */
public boolean isEmprunte() {
	return emprunte;
}

/**
 * @param Booleanthe isEmprunte to set
 */

public void setEmprunte(boolean emprunte) {
	this.emprunte = emprunte;
}

/**
 * @return the years
 */
public int getYears() {
	return years;
}


/**
 * @param years the years to set
 */
public void setYears(int years) {
	this.years = years;
}


/**
 * @return the month
 */
public int getMonth() {
	return month;
}


/**
 * @param month the month to set
 */
public void setMonth(int month) {
	this.month = month;
}


/**
 * @return the days
 */
public int getDays() {
	return days;
}


/**
 * @param days the days to set
 */
public void setDays(int days) {
	this.days = days;
}


/**
 * Methodes :
 */

public void  setLoanPeriod(int years,int month,int days) {
this.loanPeriod =LocalDate.of(years,month,days);
}
 
 
public long computeRemainingDays() {

	long noOfDaysBetween = LocalDate.now().until(loanPeriod, ChronoUnit.DAYS);
	
	return  noOfDaysBetween ;
    }
	




public int OnlineBook(int maxPeople,Book content) {
	return 0;
}


@Override
public String toString() {
return"Book [titles=" + titles + ", author=" + author + ", language=" + language 
			+ ", rentalprice=" + rentalprice + ", totalPages=" + totalPages + "]\n";
	 

}



}


