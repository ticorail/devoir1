package TP_INF1573.Devoir1.Exo1.Divisibilite;
import java.util.Scanner;

public class Divisibilite {

    // Méthode Static pour vérifier si l'un est divisible par l'autre

    public static void estdivisible(int premierEntier, int secondEntier) {

        // Vérifie si le premier est divisible par le deuxième
        if (premierEntier % secondEntier == 0) {
            System.out.println(premierEntier + " est divisible par " + secondEntier);
        }
        // Vérifie si le deuxième est divisible par le premier
        else if (secondEntier % premierEntier == 0) {
            System.out.println(secondEntier + " est divisible par " + premierEntier);
        }
        // Si aucun des deux n'est divisible par l'autre
        else {
            System.out.println("Les deux nombres ne sont pas divisibles l'un par l'autre.");
        }
    }

    // Création de la classe Main

    public static void main(String[] args) {

        // Création d'un scanner pour lire les entrées de l'utilisateur
        Scanner scanner = new Scanner(System.in);

        // Demander le premier entier

        System.out.print("Entrer le premier entier : ");

        // Pour vérifier les entrer invalides

        while (!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.print(input + " n'est pas un entier. Veuillez entrer un entier : ");
        }
        int premierEntier = scanner.nextInt(); // Lire l'entier valide

        // Si le nombre entrer est 0

        while (premierEntier == 0) {
            System.out.print("Entrer un entier different de 0 :");
            premierEntier = scanner.nextInt();

        }

        // Demander le deuxième entier

        System.out.print("Entrer le deuxième entier : ");


        // pour vérifier les entrers invalides. Tant que l'utilisateur n'entre pas un entier.

        while (!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.print(input + " n'est pas un entier. Veuillez entrer un entier : ");
        }

        int deuxiemeEntier = scanner.nextInt(); // Lire l'entier valide

        // Si le nombre entrer est 0

        while (deuxiemeEntier == 0) {

            System.out.print("Entrer un entier different de 0 :");
            deuxiemeEntier = scanner.nextInt();
        }


        estdivisible(premierEntier, deuxiemeEntier);  // Vérification de la divisibilité et affichage du résultat

        // Fermer le scanner
        scanner.close();
    }
}
