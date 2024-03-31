package Functions;

public class Habitacion {
    
    //Atributos de la clase
    private int numero; 
    private String tipo; 
    private int piso; 
    private boolean available; 

    public Habitacion (int numero, String tipo, int piso) {
        this.numero = numero;
        this.tipo = tipo;
        this.piso = piso;
        this.available = true;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
    
    
}