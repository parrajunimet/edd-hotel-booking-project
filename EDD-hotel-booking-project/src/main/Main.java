package main;

import Functions.*;
import Interfaces.Nosotros;
import edd.*;

/**
 *
 * @author juan-parra
 */
public class Main {
    
    public static Hashtable hash;
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BasicFunctions func = new BasicFunctions();
        
        // Estado Actual
        Lista<Client> guests = func.Estado();
        hash = func.createHashtable(guests);
        
        Nosotros nosotros = new Nosotros();
        nosotros.setVisible(true);
    }
    
}
