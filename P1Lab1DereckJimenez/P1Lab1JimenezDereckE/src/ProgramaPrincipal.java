import java.util.Scanner;

public class ProgramaPrincipal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner scanner = new Scanner(System.in);
	        System.out.print("Ingrese el primer numero: ");
	        double numero1 = scanner.nextDouble(); 
	        
	        System.out.print("Ingrese el segundo numero: ");
	        double numero2 = scanner.nextDouble();
	        
	        double suma = numero1 + numero2;
	        
	        System.out.println("La suma de "+numero1+" y "+numero2+" es: "+suma);
	}
}