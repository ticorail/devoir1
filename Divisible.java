package exo1;
import java.util.*;

public class Divisible {
	public static boolean estDivisible(int a, int b) {
        if (b == 0) {
            System.out.println("Impossible de diviser par 0");
            return false; 
        }

        boolean res = (a % b == 0);
        
        if (res) {
            System.out.println(b + " divise " + a);
        } else {
            System.out.println(b + " ne divise pas " + a);
        }

        return res;
    }
    public static void main(String [] args) {
    	Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez la valeur de a : ");
        int a = scanner.nextInt();
        
        System.out.print("Entrez la valeur de b : ");
        int b = scanner.nextInt();    

        System.out.println("Résultats: " );
		estDivisible(a,b);
		
	}
}
