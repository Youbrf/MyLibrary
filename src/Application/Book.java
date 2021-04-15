package Application;


import java.time.Duration;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.UUID;
import static java.time.temporal.ChronoUnit.DAYS;

public class Book {
    /**
     * Titre du livre;
     */
    private String title;
    /**
     * Auteur du livre
     */
    private String author;
    /**
     * Nombre total de pages dans le livre
     */
    private int totalPages;
    /**
     * Personne qui a emprunt� le document
     */
    private Person person;
    /**
     * dur�e d'emprunt
     */
    private LocalDate loanPeriod;
    private int years;
    private int month;
    private int days;
    /**
     * prix de location
     */
    private double rentalPrice;
    /**
     * Date d'emprunt
     */
    private LocalDate borrowingDate;
    /**
     * Language du livres.
     */
    private String language;

    /**
     * Constructor
     */
    /**
     * Cr�ation d'un livres avec les parametre suivant :
     * @param title Titre du livre
     * @param author Auteur du livre
     * @param totalPages Nombre total de pages du livre
     * @param rentalPrice Prix de location du livre
     * @param language language du livre
     */
    public Book(String title, String author, int totalPages, double rentalPrice, String language) {
        this.title = title;
        this.author = author;
        this.totalPages = totalPages;
        this.rentalPrice = rentalPrice;
        this.language = language;
    }


    /**
     * getteurs et setteurs
     */
    public int getYears() {
        return years;
    }
    public void setYears(int years) {
        this.years = years;
    }

    public int getMonth() {
        return month;
    }
    public void setMonth(int month) {
        this.month = month;
    }

    public int getDays() {
        return days;
    }
    public void setDays(int days) {
        this.days = days;
    }

    public Person getPerson() {
		return person;
	}

	public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author){}

    
    
    public int getTotalPages() {
		return totalPages;
	}


	public double getRentalPrice() {
		return rentalPrice;
	}


	public String getLanguage() {
		return language;
	}


	public LocalDate getLoanPeriod() {
        return loanPeriod;
    }
    public void setLoanPeriod(int years,int month,int daysOfMonth) {
        this.loanPeriod = LocalDate.of(years,month,daysOfMonth);
    }
    public void setLoanPeriod(int days) {
    	this.loanPeriod = LocalDate.now().plusDays(days);
		
	}
    public LocalDate getBorrowingDate() {
        return borrowingDate;
    }
    public void setBorrowingDate(LocalDate borrowingDate) {
        this.borrowingDate = borrowingDate;
    }

    /**
     * methods
     * @param person personne qui a emprunt� le livre
     */
    public void setBorrower(Person person) {
        this.person=person;
    }
    public Person getBorrower(){return person;}

    /**
     * ComputeRemainingDays calcule le nombre de jours restants avant
     * restitution du livre.
     * @return 
     */
    public long computeRemainingDays(){
       long daysbetween = DAYS.between(LocalDate.now(),loanPeriod);
        return daysbetween;
    }
    /**
     * toString, retourne les valeurs du livres.
     * @return
     */
    @Override
    public String toString() {
        return "title = "+title+", auteur = "+author+", nombre de page = "+totalPages+"\n";
                //+" | Emprunt� par = "+person.getName()+", le "+borrowingDate;
    }


	




}
