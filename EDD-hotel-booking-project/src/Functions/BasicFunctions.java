package Functions;

import com.csvreader.CsvReader;
import edd.ABBHistorial;
import edd.ABBReservaciones;
import edd.Lista;
import edd.Nodo;
import java.io.FileNotFoundException;
import java.io.IOException;
import edd.Hashtable;
import edd.NodoHistorial;
import static main.Main.habitaciones;

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
    * M&eacute;todo que Guarda las Reservas del archivo CSV.
    * Esto mediante el uso de la libreria javacsv.
    * 
    * @version 7 marzo 2024
    * @return ABB que contiene las reservaciones del hotel
    */
    public ABBReservaciones Reservas(){
        ABBReservaciones reservas = new ABBReservaciones(); 
        
        try{
            
            CsvReader leerUsuarios = new CsvReader("test//Reservas.csv");
            leerUsuarios.readHeaders();
            
            // Mientras haya lineas se obtienen los datos del archivo
            while(leerUsuarios.readRecord()) {
                
                String ci = leerUsuarios.get(0);
                ci = ci.replace(".","");
                int cedula = Integer.parseInt(ci);
                
                String f_name = leerUsuarios.get(1);
                String l_name = leerUsuarios.get(2);
                String email = leerUsuarios.get(3);
                String genero = leerUsuarios.get(4);
                String tipo_hab = leerUsuarios.get(5);
                String celular = leerUsuarios.get(6);
                String llegada = leerUsuarios.get(7);
                String salida = leerUsuarios.get(8);
                
                Client cliente = new Client(cedula,f_name,l_name,email,genero,tipo_hab,celular,llegada,salida,-1);
                reservas.insertNodo(reservas.getRoot(), cliente);
                
            }
            
            } catch(FileNotFoundException e) {
                e.printStackTrace();
            } catch(IOException e) {
                e.printStackTrace();
            }
        return reservas; 
    }
    
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
    
    /**  
     * M&eacute;todo que Guarda el Hist&oacute;rico de las personas hospedadas.
     * Hospedadas pues en el hotel a trav&eacute;s del archivo CSV.
     * 
     * @return lista del historial de habitaciones del hotel
     */
    public Lista<Client> Historial(){
        Lista<Client> historial = new Lista<>(); // Lista donde guardaremos los datos del archivo
        
        try{
            
            CsvReader leerUsuarios = new CsvReader("test//Historico.csv");
            leerUsuarios.readHeaders();
            
            // Mientras haya lineas obtenemos los datos del archivo
            while(leerUsuarios.readRecord()) {
                String ci = leerUsuarios.get(0);
                ci = ci.replace(".","");
                int cedula = Integer.parseInt(ci);

                String f_name = leerUsuarios.get(1);
                String l_name = leerUsuarios.get(2);
                String email = leerUsuarios.get(3);
                String gender = leerUsuarios.get(4);
                String llegada = leerUsuarios.get(5);
                String hab = leerUsuarios.get(6);
                int num_hab = Integer.parseInt(hab);

                Client cliente = new Client(cedula, f_name, l_name, email, gender, null, null, llegada, null, num_hab);
                historial.insertFinal(cliente);
                
            }
           
            } catch(FileNotFoundException e) {
                e.printStackTrace();
            } catch(IOException e) {
                e.printStackTrace();
            }
        return historial;   
    }
    
    /**
     * M&eacute;todo que crea un ABB de tipo historial con 300 nodos.
     * Luego agrega los datos existentes del historial de habitaciones.
     * 
     * @param history, lista del historial de habitaciones
     * @return ABB que contiene el historial de habitaciones 
     */
    public ABBHistorial crearHistorial(Lista<Client> history){
        /**
        * Metodo que crea la estructura de Árbol para el Historial de Habitaciones
        */
        ABBHistorial historial = new ABBHistorial();
        NodoHistorial root = new NodoHistorial(150);
        NodoHistorial left = new NodoHistorial(75);
        NodoHistorial right = new NodoHistorial(225);
        historial.setRoot(root);
        root.setLeftSon(left);
        root.setRightSon(right);
        for (int i = 1; i <301; i++) {
            if (i!=150 && i!= 75 && i!=225 ){
                historial.insertNodo(i, historial.getRoot());
            }
        }
        for (int i = 0; i < history.getSize(); i++) {
            Client current = (Client) history.getDato(i).getElement();
            historial.insertarCliente(historial.getRoot(), current);
        }
        
        return historial;
    }
    
    public Lista<Habitacion> createHabitacionesDisponibles (Lista<Habitacion> habitaciones, Lista <Client> guests){
        for (int i = 0; i < guests.getSize(); i++) {
            Client current = (Client) guests.getDato(i).getElement();
            int num_hab = current.getRoomNum();
            Habitacion room = (Habitacion) habitaciones.getDato(num_hab-1).getElement();
            room.setAvailable(false);
        }
        return habitaciones;
        
    }
    
    public Lista<Habitacion> Habitaciones(){
        try{
            Lista<Habitacion> rooms = new Lista<>();
            
            CsvReader leerHab = new CsvReader("test//Habitaciones.csv");
            leerHab.readHeaders();
            
            while(leerHab.readRecord()) {
                String hab = leerHab.get(0);
                int numero = Integer.parseInt(hab);
                
                String tipo_hab = leerHab.get(1);
                
                String piso = leerHab.get(2);
                int num_piso = Integer.parseInt(piso);
                
                Habitacion room = new Habitacion(numero, tipo_hab, num_piso);
                rooms.insertFinal(room);

            }
            
            return rooms;
            
        } catch(FileNotFoundException e) {
            e.printStackTrace();
        } catch(IOException e) {
            e.printStackTrace();
        } 
        return null; 
    } 
    
    public int habitacionDisponible(Client cliente) {
        
        String roomType = cliente.getTipoHab();
        for (int i = 0; i < habitaciones.getSize(); i++) {
            Habitacion room = (Habitacion) habitaciones.getDato(i).getElement();
            if (room.isAvailable()) {
                if (roomType.equals(room.getTipo())) {
                    room.setAvailable(false);
                    return room.getNumero();
                }
            }
        }
        return -1;
    }
    
}
