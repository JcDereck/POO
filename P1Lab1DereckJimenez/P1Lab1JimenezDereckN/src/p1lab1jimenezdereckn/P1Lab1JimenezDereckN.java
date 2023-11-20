/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package p1lab1jimenezdereckn;

import java.util.Scanner;

/**
 *
 * @author ISAI
 */
public class P1Lab1JimenezDereckN {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble(); 

        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        double suma = numero1 + numero2;

        System.out.println("La suma de "+numero1+" y "+numero2+" es: "+suma);
    }
    
}
