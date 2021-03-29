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
	 * Durée d el'emprunt
	 */
private String titles,author,language;
  private int nbrepages;
  private double rentalprice;
  private int totalPages;
  private Person person;
  private LocalDate borrowingDate;
  private LocalDate loanPeriod;
 
 
/**
 * @param titles
 * @param author
 * @param language
 * @param totalPages
 * @param rentalprice
 */
public Book(String titles, String author, String language, int totalPages, double rentalprice) {

	this.titles = titles;
	this.author = author;
	this.language = language;
	this.totalPages = totalPages;
	this.rentalprice = rentalprice;
}



//getters et setters :

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
 * @param month the month to set
 */
public void setMonth(int month) {
	this.month = month;
}

/**
 * @return the daysOfMonth
 */
public int getDaysOfMonth() {
	return days;
}

/**
 * @param daysOfMonth the daysOfMonth to set
 */
public void setDaysOfMonth(int daysOfMonth) {
	this.days = daysOfMonth;
}

/**
 * @param person personne qui a emprunté le livre
 */
public void setBorrower(Person person) {
    this.person=person;
}
public Person getBorrower(){
	return person;
	}

/**
 * Methodes :
 */

int years,month,days;

 public void  setLoanPeriod(int years,int month,int days) {
this.loanPeriod =LocalDate.of(years,month,days);
}
 
 
public void computeRemainingDays() {
	long noOfDaysBetween = LocalDate.now().until(loanPeriod, ChronoUnit.DAYS);
	System.out.println("Le nombre de jours restants est de =" + noOfDaysBetween);
    }
	




public int OnlineBook(int maxPeople,Book content) {
	return 0;
}


@Override
public String toString() {
return"Book [titles=" + titles + ", author=" + author + ", language=" + language + ", nbrepages=" + nbrepages
			+ ", rentalprice=" + rentalprice + ", totalPages=" + totalPages + "]";
	 

}



 



 

 
}


