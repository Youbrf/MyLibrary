package Application;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		String[] membres = {"Youssef","Moussa","YLemti","Monir"};
		String[] livres = {"Java","Php","Python"};
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
