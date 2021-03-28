package Application;

import java.util.UUID;

public class Apptest {
    public static void main(String[] args) {
         Person person = new Person(UUID.randomUUID(),"Youssef");
         Book livre1 = new Book("One Peace","Eiichiro Oda",456,1.2,"Français");
         Book livre2 = new Book("Naruto","Masashi Kishimoto",432,1,"Français");

         person.borrows(livre1,2021,4,2);
         person.borrows(livre2,2021,10,3);
         livre1.computeRemainingDays();
        System.out.println(person);
    }
}
