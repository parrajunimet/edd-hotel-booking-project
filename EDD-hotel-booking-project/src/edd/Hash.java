package edd;

import java.util.Hashtable;

public class Hash {

    private Hashtable<String, String> tabla;

    public Hash() {
        tabla = new Hashtable<>();
    }

    public void insertar(String clave, String valor) {
        tabla.put(clave, valor);
    }

    public String buscar(String clave) {
        return tabla.get(clave);
    }

    public void eliminar(String clave) {
        tabla.remove(clave);
    }

}
