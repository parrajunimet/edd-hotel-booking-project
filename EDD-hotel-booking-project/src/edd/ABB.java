package edd;

public class ABB {
    private ABBNodo raiz;

    public ABB() {
        raiz = null;
    }

    public void insertar(int dato) {
        raiz = insertarRec(raiz, dato);
    }

    private ABBNodo insertarRec(ABBNodo nodo, int dato) {
        if (nodo == null) {
            return new ABBNodo(dato);
        }

        if (dato < nodo.getDato()) {
            nodo.setIzquierda(insertarRec(nodo.getIzquierda(), dato));
        } else if (dato > nodo.getDato()) {
            nodo.setDerecha(insertarRec(nodo.getDerecha(), dato));
        }

        return nodo;
    }

    public boolean buscar(int dato) {
        return buscarRec(raiz, dato);
    }

    private boolean buscarRec(ABBNodo nodo, int dato) {
        if (nodo == null) {
            return false;
        }

        if (dato == nodo.getDato()) {
            return true;
        } else if (dato < nodo.getDato()) {
            return buscarRec(nodo.getIzquierda(), dato);
        } else {
            return buscarRec(nodo.getDerecha(), dato);
        }
    }

    public void eliminar(int dato) {
        raiz = eliminarRec(raiz, dato);
    }

    private ABBNodo eliminarRec(ABBNodo nodo, int dato) {
        if (nodo == null) {
            return nodo;
        }

        if (dato < nodo.getDato()) {
            nodo.setIzquierda(eliminarRec(nodo.getIzquierda(), dato));
        } else if (dato > nodo.getDato()) {
            nodo.setDerecha(eliminarRec(nodo.getDerecha(), dato));
        } else {
            if (nodo.getIzquierda() == null) {
                return nodo.getDerecha();
            } else if (nodo.getDerecha() == null) {
                return nodo.getIzquierda();
            }

            nodo.setDato(minimoValor(nodo.getDerecha()));
            nodo.setDerecha(eliminarRec(nodo.getDerecha(), nodo.getDato()));
        }

        return nodo;
    }

    private int minimoValor(ABBNodo nodo) {
        int min = nodo.getDato();
        while (nodo.getIzquierda() != null) {
            min = nodo.getIzquierda().getDato();
            nodo = nodo.getIzquierda();
        }
        return min;
    }

}
