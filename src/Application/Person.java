package Application;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.UUID;

public class Person {
    protected UUID id;
    private String name;
    private Byte maxBooks;
    private final LocalDate registrationDate;
    private ArrayList<Book> books;

    /**
     * Constructeur avec deux parametres
     * @param id  id de la personne
     * @param name  nom de la personne
     */
    public Person(UUID id, String name){
        this.id=id;
        this.name=name;
        this.maxBooks=3;
        this.registrationDate=LocalDate.now();
        this.books=new ArrayList<Book>();
    }
    public Person(String name, Byte maxBooks){
        this.id=UUID.randomUUID();
        this.name=name;
        this.maxBooks=maxBooks;
        this.registrationDate=LocalDate.now();
        this.books=new ArrayList<Book>();
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Byte getMaxBooks() {
        return maxBooks;
    }

    public void setMaxBooks(Byte maxBooks) {
        this.maxBooks = maxBooks;
    }

    public LocalDate getRegistrationDate() {
        return registrationDate;
    }

    public ArrayList<Book> getBooks() {
        return books;
    }


    /**
     *Methode qui permet d'emprunter un livre
     * @param book
     */
    public void borrows(Book book,int daysOfMonth,int month,int years) {
        this.books.add(book);
        book.setBorrower(this);
        book.setBorrowingDate(LocalDate.now());
        book.setLoanPeriod(years,month,daysOfMonth);
    }

    /**
     * Methode qui permet de retourner un livres
     * @param book
     */
    public void returns(Book book) {
        this.books.remove(book);
        book.setBorrower(null);
        book.setBorrowingDate(null);
    }

    @Override
    public String toString() {
        final int maxLen=3;
        return "Person [" + id + ": " + name + " (maxBooks=" + maxBooks + ", inscrit le "
                + registrationDate + ") - livre ="
                + (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + "]\n";
    }
}
