import java.util.Scanner;

public class EstDivisible {

    // Déclaration des variables

    private int premierEntier;
    private int deuxiemeEntier;

    // Création du Constructeur

    public EstDivisible(int premierEntier, int deuxiemeEntier){

        this.premierEntier = premierEntier;
        this.deuxiemeEntier = deuxiemeEntier;
    }

    // Méthode pour vérifier si l'un est divisible par l'autre
    public void EstDivisible() {

        // Vérifie si le premier est divisible par le deuxième
        if (premierEntier % deuxiemeEntier == 0) {
            System.out.println(premierEntier + " est divisible par " + deuxiemeEntier);
        }
        // Vérifie si le deuxième est divisible par le premier
        else if (deuxiemeEntier % premierEntier == 0) {
            System.out.println(deuxiemeEntier + " est divisible par " + premierEntier);
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
            System.out.println(input + " n'est pas un entier. Veuillez entrer un entier.");
        }
        int premierEntier = scanner.nextInt(); // Lire l'entier valide

        // Si le nombre entrer est 0

        while (premierEntier == 0) {
            System.out.println("Entrer un entier different de 0 :");
            premierEntier = scanner.nextInt();

        }

        // Demander le deuxième entier

        System.out.print("Entrer le deuxième entier : ");

        // pour vérifier les entrers invalides

        while (!scanner.hasNextInt()) {
            String input = scanner.next();
            System.out.println(input + " n'est pas un entier. Veuillez entrer un entier.");
        }
        int deuxiemeEntier = scanner.nextInt(); // Lire l'entier valide

        // Si le nombre entrer est 0

        while (deuxiemeEntier == 0) {

            System.out.println("Entrer un entier different de 0 :");
            deuxiemeEntier = scanner.nextInt();
        }

        // Création d'une instance de la classe EstDivisible

        EstDivisible divisibilite = new EstDivisible(premierEntier, deuxiemeEntier);

        divisibilite.EstDivisible();  // Vérification de la divisibilité et affichage du résultat

        // Fermer le scanner
        scanner.close();
    }
}
