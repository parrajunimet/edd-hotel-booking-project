package edd;


class DoubleList {
    DoubleListNodo raiz;

    public DoubleList() {
        this.raiz = null;
    }

    public void insertar(int dato) {
        DoubleListNodo nuevoNodo = new DoubleListNodo(dato);
        if (raiz == null) {
            raiz = nuevoNodo;
        } else {
            DoubleListNodo temp = raiz;
            while (temp.siguiente != null) {
                temp = temp.siguiente;
            }
            temp.siguiente = nuevoNodo;
            nuevoNodo.anterior = temp;
        }
    }

    public void mostrar() {
        DoubleListNodo temp = raiz;
        while (temp != null) {
            System.out.print(temp.dato + " ");
            temp = temp.siguiente;
        }
        System.out.println();
    }
}
