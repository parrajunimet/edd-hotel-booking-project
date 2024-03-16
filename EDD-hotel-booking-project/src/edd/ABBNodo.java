package edd;

public class ABBNodo {
    private int dato;
    private ABBNodo izquierda, derecha;

    public ABBNodo(int dato) {
        this.dato = dato;
        this.izquierda = this.derecha = null;
    }

    public int getDato() {
        return dato;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public ABBNodo getIzquierda() {
        return izquierda;
    }

    public void setIzquierda(ABBNodo izquierda) {
        this.izquierda = izquierda;
    }

    public ABBNodo getDerecha() {
        return derecha;
    }

    public void setDerecha(ABBNodo derecha) {
        this.derecha = derecha;
    }

    public void imprimirDato() {
        System.out.println(this.getDato());
    }
}
