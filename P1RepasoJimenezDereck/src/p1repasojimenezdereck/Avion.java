
package p1repasojimenezdereck;

public class Avion extends Vehiculo{
    //ATRIBUTOS
    private int numAlas;
    //CONSTRUCTOR
    public Avion(int numAlas, String marca, String color, int numAsientos) {
        super(marca, color, numAsientos);
        this.numAlas = numAlas;
    }
    //GET AND SET
    public int getNumAlas() {
        return numAlas;
    }

    public void setNumAlas(int numAlas) {
        this.numAlas = numAlas;
    }
    //METODOS
    public void MostrarDatos(){
        System.out.println("MARCA: "+getMarca());
        System.out.println("COLOR: "+getColor());
        System.out.println("NUMERO DE ASIENTOS: "+getNumAsientos());
        System.out.println("NUMERO DE ALAS: "+getNumAlas());
    }
    public void Volar(){
        System.out.println("VOLANDO");
    }
}
