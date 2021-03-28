package Application;

import java.util.ArrayList;
import java.util.Iterator;

public class MyLibrary {
        /**
         * Nom de la bibliothèque
         */
        private String name;
        /**
         * Liste des livres
         */
        private ArrayList<Book> books;
        /**
         * Liste des membres
         */
        private ArrayList<Person> people;
        /**
         * Crée une bibliothèque en spécifiant son nom
         *
         * @param name Nom de la bibliothèque
         */
        public MyLibrary(String name) {
            this.name = name;
            this.books = new ArrayList<Book>();
            this.people = new ArrayList<Person>();
        }
        /**
         * Renvoie le nom de la bibliothèque*
         * @return Le nom de la bibliothèque
         */
        public String getName() {
            return name;
        }
        /**
         * Modifie le nom de la bibliothèque
         *
         * @param name Nouveau nom de la bibliothèque
         */
        public void setName(String name) {
            this.name = name;
        }
        /**
         * Renvoie la liste des livres
         *
         * @return la liste des livres
         */
        public ArrayList<Book> getBooks() {
            return books;
        }
        /**
         * Renvoie la liste des membres
         *
         * @return la liste des membres
         */
        public ArrayList<Person> getPeople() {
            return people;
        }

        //methods

        /**
         * Ajouter des livres
         * @param book
         */
        public void addBook(Book book) {
            this.books.add(book);
        }

        /**
         * Ajouter des membres
         * @param person
         */
        public void addPerson(Person person) {
                this.people.add(person);
            }

        /**
         * Afficher des livres
          * @return
         */
        public int printBooks() {
                int cpt = 0;
                Iterator<Book> it = this.getBooks().iterator();
                while(it.hasNext()) {
                    Book b = it.next();
                    System.out.println(++cpt + ": "+b.getTitle() + " - "+b.getAuthor());
                }
                return cpt;
            }

        /**
         * Afficher des membres
         * @return
         */
        public int printMembers() {
                int cpt = 0;
                Iterator<Person> itp = this.getPeople().iterator();
                while(itp.hasNext()) {
                    Person p = itp.next();
                    System.out.println(++cpt + ": " + p.getName());
                }
                return cpt;
            }

    @Override
        public String toString() {
            final int maxLen = 3;
            return "MyLibrary " + name + ": books="
                    + (books != null ? books.subList(0, Math.min(books.size(), maxLen)) : null) + ",people="
                    + (people != null ? people.subList(0, Math.min(people.size(), maxLen)) : null);
        }

}
