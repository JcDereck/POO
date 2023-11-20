
package p1repasojimenezdereck;

public class Vehiculo {
    //ATRIBUTOS
    private String marca;
    private String color;
    private int numAsientos;
    
    //CONSTRUTOR 
    public Vehiculo(String marca, String color, int numAsientos) {
        this.marca = marca;
        this.color = color;
        this.numAsientos = numAsientos;
    }
    
    //GET AND SET
    public String getMarca() {
        return marca;
    }
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumAsientos() {
        return numAsientos;
    }
    public void setNumAsientos(int numAsientos) {
        this.numAsientos = numAsientos;
    }
    
    //METODOS
    public void Prender(){
        System.out.println("PRENDIDO");
    }
    public void Apagar(){
        System.out.println("APAGADO");
    }
    public void Acelerar(){
        System.out.println("ACELERAR");
    }
    public void Frenar(){
        System.out.println("FRENAR");
    }
}
