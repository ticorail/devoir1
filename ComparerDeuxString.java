import java.util.Scanner;

public class ComparerDeuxString {

    // Les variables d'instance
    private String stringUn;
    private String stringDeux;

    // Création du constructeur
    public ComparerDeuxString(String stringUn, String stringDeux){
        this.stringUn = stringUn;
        this.stringDeux = stringDeux;
    }

    public String renverser(){
        String texteRenverser = "";
        if (stringUn.length() < stringDeux.length()){
            texteRenverser = new StringBuilder(stringUn).reverse().toString();
        } else if (stringUn.length() > stringDeux.length()){
            texteRenverser = new StringBuilder(stringDeux).reverse().toString();
        }
        return texteRenverser;
    }

    public String comparer(){
        if (stringUn.length() < stringDeux.length()){
            return "La phrase " + this.stringUn + " est plus petite que " + this.stringDeux;
        } else if (stringUn.length() > stringDeux.length()){
            return "La phrase " + this.stringUn + " est plus grande que " + this.stringDeux;
        } else {
            return "La phrase " + this.stringUn + " est égale à " + this.stringDeux;
        }
    }

    public static void main(String[] args) {

        // Création d'un objet Scanner pour permettre à l'utilisateur de saisir les chaînes
        Scanner scanner = new Scanner(System.in);

        // Saisir la première chaîne
        System.out.print("Entrer la première phrase : ");
        String stringUn = scanner.nextLine();

        // Pour éviter les chaînes vides

        while (stringUn.trim().isEmpty()) {
            System.out.println("La chaîne ne peut pas être vide. Veuillez entrer une phrase.");
            System.out.print("Veuillez entrer la première phrase : ");
            stringUn = scanner.nextLine();
        }

        // Saisir la deuxième chaîne

        System.out.print("Entrer la deuxième phrase : ");
        String stringDeux = scanner.nextLine();

        // Pour éviter les chaînes vides

        while (stringDeux.trim().isEmpty()) {
            System.out.println("La chaîne ne peut pas être vide. Veuillez entrer une phrase.");
            System.out.print("Veuillez entrer la deuxième phrase : ");
            stringDeux = scanner.nextLine();
        }

        // Création d'un objet ComparerDeuxString
        ComparerDeuxString phrase = new ComparerDeuxString(stringUn, stringDeux);

        System.out.println(phrase.comparer());

        System.out.println(phrase.renverser());

        scanner.close(); // Fermer le scanner
    }
}
