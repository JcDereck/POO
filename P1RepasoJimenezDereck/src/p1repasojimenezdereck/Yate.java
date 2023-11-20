
package p1repasojimenezdereck;

public class Yate extends Vehiculo{
    //ATRIBUTOS
    private int numeroHelices;
    
    //CONSTRUCTOR
    public Yate(int numeroHelices, String marca, String color, int numAsientos) {
        super(marca, color, numAsientos);
        this.numeroHelices = numeroHelices;
    }
    
    //GET AND SET
    public int getNumeroHelices() {
        return numeroHelices;
    }
    public void setNumeroHelices(int numeroHelices) {
        this.numeroHelices = numeroHelices;
    }
    
    //METODOS
    public void MostrarDatos(){
        System.out.println("MARCA: "+getMarca());
        System.out.println("COLOR: "+getColor());
        System.out.println("NUMERO DE ASIENTOS: "+getNumAsientos());
        System.out.println("NUMERO DE HELICES: "+getNumeroHelices());
    }
    public void Navegar(){
        System.out.println("NAVEGANDO");
    }
}
