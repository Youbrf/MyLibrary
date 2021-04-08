package Application;

import java.util.Scanner;
import java.util.UUID;

public class Main {

	public static void main(String[] args) {
		String[] membres = {"Youssef","Moussa","YLemti","Monir"};
		String[] livres = {"Java","Php","Python"};
		String[] livresemprunte = {"tintin","milou"};
		Scanner scanner = new Scanner(System.in);
		String affiche;
		boolean end =true;
		do {
			do {
				System.out.println("Taper A pour afficher le menu des statistiques ");
				affiche = scanner.nextLine().toUpperCase();
					if(affiche.equalsIgnoreCase("A")) {
						System.out.println("			MENU DES STATISTIQUE");
						System.out.println("------------------------------------------------------------------");
						System.out.println("	1 - nombre total de livres et de membres");
						System.out.println("	2 - nombre de livres électroniques et de romans graphiques");
						System.out.println("	3 - nombres de membres qui ont un livre en emprunt");
						System.out.println("	4 - nombre de livres empruntés");
						System.out.println("	5 - nombre de livres en retard");
						System.out.println("	0 - quitter");
					}else {
						System.out.println("Votre entrer au clavier est incorrecte réessayer");
					}
				
			} while (!affiche.equalsIgnoreCase("A"));
			System.out.println("\n             Introduiser votre choix");
			int choix = scanner.nextInt();
			if(choix >= 0 && choix<=5) {
				switch (choix) {
				case 1:
					System.out.println("Total de livres = "+livres.length+" livre(s)");
					System.out.println("Total de membres = "+membres.length+" membre(s)");
					break;
				case 2:
					System.out.println("Total de livres = "+livresemprunte.length+" livre(s)");
					break;
				case 3:
					break;
				case 4:
					break;
				case 5:
					break;
				default:
					System.out.println("bye bye, à bientôt");
					end=false;
					break;
				}
			}
		} while (end);
	}
}
/**
 * 
 * 
 * 
Scanner sc = new Scanner(System.in);
int menu;
//System.out.println("Bienvenue dans le monde de narnia");
//System.out.println("tape 1 pour afficher le menu ");

MyLibrary Ixelle = new MyLibrary("Ixelle");
MyLibrary Uccle = new MyLibrary("Uccle");

System.out.println(Ixelle);
System.out.println(Uccle);
Person bingo = new Person("bingo",(byte)3);
Person Ruth = new Person("bingo3",(byte)3);
Book bingo1 = new Book("One Peace","Eiichiro Oda",456,1.2,"Français");
Uccle.addPerson(Ruth);
Ixelle.addPerson(bingo);
Uccle.addBook(bingo1);
System.out.println("----------------------------------------------------------------------------");

System.out.println(Ixelle);
System.out.println(Uccle);

menu = sc.nextInt();
if(menu==1) {
	System.out.println("----------- Menu -------------\n");
	System.out.println("	1. Ajouter un membre");
	System.out.println("	2. Ajouter un livre");
	System.out.println("	3. Emprunter un livre");
	System.out.println("	4. Afficher les statistiques");
	System.out.println("	0. Quitter");
	System.out.println("\n Veuillez choisir une option\n");
}
int choix = sc.nextInt();
if(choix>=0 && choix<=4) {
	switch (choix) {
	case 1:
		String off = sc.nextLine();
		System.out.println("---- Ajouter un membre ----\n");
		System.out.println("Veuillez introduire le nom du membre à ajouter :");
		String nom = sc.nextLine();
		System.out.println("Veuillez introduire le nombre de livres maximum que le membre peut emprunter :");
		Byte empruntmax = sc.nextByte();
		Person membre = new Person(nom,empruntmax);
		System.out.println(membre);
		break;
	case 2:
		break;
	case 3:
		break;
	case 4:
		break;
	default:
		System.out.println("bye bye, à bientôt");
		break;
	}
}else {
	System.out.println("Erreur, veuillez réintroduire une option");	
}


 * 
 * 
 */