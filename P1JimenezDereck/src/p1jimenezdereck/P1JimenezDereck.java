package p1jimenezdereck;

import java.util.Scanner;

/**
 *
 * @author ESPE
 */
        
public class P1JimenezDereck {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble(); 
        
        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();
        
        double suma = numero1 + numero2;
        
        System.out.println("La suma de "+numero1+" y "+numero2+" es: "+suma);
    }
}
