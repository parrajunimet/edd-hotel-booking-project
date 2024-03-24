package edd;

import Functions.Client;

public class Hashtable {

    //Atributos de la clase
    private Lista[] array;
    private int hashSize;

    /**
     * Constructor de la clase
     * @param hashSize, longitud del hashtable
     */
    public Hashtable(int hashSize) {
        this.array = new Lista[hashSize];
        this.hashSize = hashSize;
    }

    /**
     * Metodo que permite obtener la lista de clientes almacenados en una clave del hashtable
     * @return array de clientes almacenados en una clave del hashtable
     */
    public Lista[] getArray() {
        return array;
    }

    /**
     * Metodo que permite modificar la lista de clientes almacenados en una clave del hashtable
     * @param array, nueva lista de clientes a almacenar en una clave del hashtable
     */
    public void setArray(Lista[] array) {
        this.array = array;
    }

    /**
     * Metodo que permite obtener la longitud del hashtable
     * @return longitud del hashtable
     */
    public int getHashSize() {
        return hashSize;
    }

    /**
     * Metodo que permite modificar la longitud del hashtable
     * @param hashSize, nueva longitud del hashtable
     */
    public void setHashSize(int hashSize) {
        this.hashSize = hashSize;
    }
    
    /**
     * Metodo que permite obtener el valor ASCII de una palabra
     * @param palabra 
     * @return valor ASCII de la palabra ingresada
     */
    public int getAsciiValue(String palabra) {
        int suma = 0;

        for (int i = 0; i < palabra.length(); i++) {
            char character = palabra.charAt(i);
            int ascii = (int) character;
            suma += ascii;
        }
        return suma;
    }
    
    /**
     * Metodo que permite obtener el hashcode a partir del valor ASCII del nombre y apellido del cliente
     * @param name, nombre del cliente
     * @param lastName, apellido del cliente
     * @return hashcode del cliente
     */
    public int hashCode(String name, String lastName) {
        int clave;
        name = name.toLowerCase();
        lastName = lastName.toLowerCase();
        String junto = name + lastName;
        clave = getAsciiValue(junto) % getHashSize();
        return clave;
    }
    
    /**
     * Metodo que permite insertar un cliente en el hashtable
     * @param value, cliente a ingresar
     */
    public void insertInHashtable(Client value) {

        String name = value.getName();
        String lastName = value.getLastName();
        int key = hashCode(name, lastName);
        Lista subLista = new Lista();
        subLista.insertFinal(value);
        Lista valorArreglo = getArray()[key];
        if (valorArreglo != null) {
            valorArreglo.insertFinal(value);
        } else {
            getArray()[key] = subLista;
        }
    }
    

}
