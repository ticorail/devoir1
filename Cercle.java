import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class Cercle {
    // Déclaration d'une variable d'instance
    private double diametre;

    // Constructeur
    public Cercle() {
        this.diametre = (Math.random() * (20 - 5)) + 5; // Génère un diamètre aléatoire entre 5 et 20.
    }

    @Override
    public String toString() {
        return "Cercle de diamètre : " + String.format("%.2f", diametre) +
                " avec un périmètre : " + String.format("%.2f", perimetreCercle()) +
                " et une superficie : " + String.format("%.2f", superficieCercle());
    }



    // Accesseurs et modificateur
    public double getDiametre() {
        return diametre;
    }

    public void setDiametre(double diametre) {
        this.diametre = diametre;
    }

    // Méthodes

    //Calcule et retourne le périmètre du cercle.

    public double perimetreCercle() {
        return diametre * Math.PI;
    }


     //Calcule et retourne la superficie du cercle.

    public double superficieCercle() {
        double rayon = diametre / 2;
        return Math.PI * Math.pow(rayon, 2);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrer un entier (1 à 10) : ");
        int n = scanner.nextInt();

        // Vérification de la validité de l'entrée
        while (n <= 0 || n > 10) {
            System.out.print("Entrer un entier valide (1 à 10) : ");
            n = scanner.nextInt();
        }

        // Création d'un tableau de cercles pour pouvoir les triés
        Cercle[] cercles = new Cercle[n];

        for (int i = 0; i < n; i++) {
            cercles[i] = new Cercle();
        }

        // Tri des cercles par diamètre croissant
        Arrays.sort(cercles, Comparator.comparingDouble(c -> c.diametre));

        // Affichage des cercles triés
        for (Cercle c : cercles) {
            System.out.println(c);
        }

        scanner.close(); // Fermeture du scanner
    }
}
