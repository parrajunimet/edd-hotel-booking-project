package Functions;

import com.csvreader.CsvReader;
import edd.Hashtable;
import edd.Lista;
import edd.Nodo;
import java.io.FileNotFoundException;
import java.io.IOException;
import edd.Hashtable;

/**
 * Clase de funciones para iniciar el programa.
 * Ejemplo: crear &aacute;rboles binarios de b&uacute;squeda, hashtable,etc.
 * Considerada por m&iacute; como la columna vertebral de este proyecto.
 * Permite la conversi&oacute;n archivo CSV -> programa.
 * 
 * @version 7 marzo 2024
 * @author luigiperez
 */
public class BasicFunctions {
    
    /**
     * M&eacute;todo que Guarda el estado de los hu&eacute;spedes en el CSV.
     * Esto para luego crear el hashtable ver el siguiente m&eacute;todo.
     * 
     * @return lista de los clientes hospedados actualmente en el hotel.
     */
    public Lista<Client> Estado(){
        Lista<Client> guests = new Lista<>(); // Lista donde guardaremos los datos del archivo
        
        try{
            
            CsvReader leerUsuarios = new CsvReader("test//Estado.csv");
            leerUsuarios.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerUsuarios.readRecord()) {
                if (!leerUsuarios.get(0).equals("")){
                    String hab = leerUsuarios.get(0);
                    int num_hab = Integer.parseInt(hab);
                    
                    String f_name = leerUsuarios.get(1);
                    String l_name = leerUsuarios.get(2);
                    String email = leerUsuarios.get(3);
                    String gender = leerUsuarios.get(4);
                    String celular = leerUsuarios.get(5);
                    String llegada = leerUsuarios.get(6);
                    
                    Client cliente = new Client(-1, f_name, l_name, email, gender, null, celular, llegada, null, num_hab);
                    guests.insertFinal(cliente);
                }
            }
            
            } catch(FileNotFoundException e) {
                e.printStackTrace();
            } catch(IOException e) {
                e.printStackTrace();
            }
        return guests;
    }
    
    /**
     * M&eacute;todo que permite crear un Hashtable a partir de la lista de hu&eacute;spedes del hotel.
     * Ajuro se tiene que palicar el anterior para correr este algoritmo.
     * 
     * @param guests, lista de huespedes actuales del hotel.
     * @return hashtable que almacena los huespedes del hotel.
     */
    public Hashtable createHashtable(Lista<Client> guests){
        /**
        * Metodo que crea el Hashtable
        */
        Hashtable hasht = new Hashtable(600);
        Nodo pointer = guests.getHead();
        while(pointer != null){
            Client current = (Client) pointer.getElement();
            hasht.insertInHashtable(current);
            pointer = pointer.getNext();
        }
        return hasht;
    }
    
}
