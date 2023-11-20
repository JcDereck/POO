
package p1repasojimenezdereck;

import java.util.Scanner;

public class P1RepasoJimenezDereck {

   public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int opcionMenu;
        do{
            System.out.println("    ======================");
            System.out.println("        MENU PRINCIPAL    ");
            System.out.println("    ======================");
            System.out.println("    AVION......(1)");
            System.out.println("    YATE.......(2)");
            System.out.println("    SALIR......(3)");
            System.out.println("    ======================");
            System.out.print("Ingresar una opcion:");
            opcionMenu=scanner.nextInt();
            switch(opcionMenu){
                case 1:
                    Avion avion=new Avion(2,"H","morado",23);
                    System.out.println("========AVION 1========");
                    avion.MostrarDatos();
                    System.out.print("El avion esta: ");
                    avion.Volar();
                    System.out.println("========AVION 2========");
                    Avion avion1=new Avion(3,"A","azul",28);
                    avion1.MostrarDatos();
                    System.out.print("El avion esta: ");
                    avion1.Frenar();
                    break;
                case 2:
                    Yate yate=new Yate(3,"R","AMARILLO",5);
                    System.out.println("========YATE 1========");
                    yate.MostrarDatos();
                    System.out.print("EL YATE ESTA: ");
                    yate.Navegar();
                    System.out.println("========YATE 2========");
                    Yate yate1=new Yate(2,"T","ROJO",23);
                    yate1.MostrarDatos();
                    System.out.print("EL TATE ESTA: ");
                    yate1.Prender();    
                    break;
                case 3:
                    System.out.println("[GRACIAS POR INGRESAR AL MENU]");
                    break;
                default:
                    System.out.println("[LA OPCION INGRESADA ES INCORRECTA]");
            }
        }while(opcionMenu!=3 );
   }
}
