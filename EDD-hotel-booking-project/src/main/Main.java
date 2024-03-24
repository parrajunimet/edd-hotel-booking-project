package main;

import Functions.*;
import Interfaces.Nosotros;
import edd.*;

/**
 *
 * @author juan-parra
 */
public class Main {
    
    //Se hacen static para su accesado desde las interfaces a medida que se editan sus datos.
    public static Hashtable hash;
    public static ABBReservaciones reservas;
    public static ABBHistorial historial;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //El basic functions es la columna vertebral de esto.
        BasicFunctions func = new BasicFunctions();
        
        // Reservaciones (por clientes)
        reservas = func.Reservas();
        
        // Estado Actual (clientes hospedados)
        Lista<Client> guests = func.Estado();
        hash = func.createHashtable(guests);
        
        // Historial de Habitaciones
        Lista<Client> history = func.Historial();
        historial = func.crearHistorial(history);
        
        //GUI principal
        Nosotros nosotros = new Nosotros();
        nosotros.setVisible(true);
    }
    
}
