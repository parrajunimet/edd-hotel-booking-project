
package Interfaces;

/**
 *
 * @author Camila Garcia
 */
public class InterfaceFunctions {
    //Esta clase tiene los metodos para abrir las interfaces
    private static final Nosotros paginaprincipal = new Nosotros();
    private static final BuscarClientes buscarclientes = new BuscarClientes();
    private static final BuscarReservaciones buscarreservaciones= new BuscarReservaciones();
    private static final Historial historial = new Historial();
    private static final CheckIn checkin = new CheckIn();
    private static final Checkout checkout = new Checkout();
    
    //Metodo para obtener la pagina principal , ya que es un atributo privado
    public static Nosotros getNosotros(){
        return paginaprincipal;
    }
    
    //Metodo que hace visible la interfaz
    public static void openNosotros(){
        getNosotros().setVisible(true);
    }
    
    //Metodo para obtener buscar cliente, ya que es un atributo privado
    public static BuscarClientes getBuscarClientes(){
        return buscarclientes;
    }
    
    //Metodo que hace visible la interfaz
    public static void openBuscarClientes(){
        getBuscarClientes().setVisible(true);
    }
    
    //Metodo para obtener buscar reservaciones , ya que es un atributo privado
    public static BuscarReservaciones getBuscarReservaciones(){
        return buscarreservaciones;
    }
    
    //Metodo que hace visible la interfaz
    public static void openBuscarReservaciones(){
        getBuscarReservaciones().setVisible(true);
    }
    
    //Metodo para obtener historial, ya que es un atributo privado
    public static Historial getHistorial(){
        return historial;
    }
    
    //Metodo que hace visible la interfaz
    public static void openHistorial(){
        getHistorial().setVisible(true);
    }
    
    //Metodo para obtener check in, ya que es un atributo privado
    public static CheckIn getCheckIn(){
        return checkin;
    }
    
    //Metodo que hace visible la interfaz
    public static void openCheckIn(){
        getCheckIn().setVisible(true);
    }
    
      //Metodo para obtener check out, ya que es un atributo privado
    public static Checkout getCheckout(){
        return checkout;
    }
    
    //Metodo que hace visible la interfaz
    public static void openCheckout(){
        getCheckout().setVisible(true);
    }
    
     public static void VolverNosotros(){
       //Muestro la pagina principal
        getNosotros().setVisible(true);
        //Hago que las ventanas abiertas ya no se muestren
        getBuscarClientes().setVisible(false);
        getBuscarReservaciones().setVisible(false);
        getHistorial().setVisible(false);
        getCheckIn().setVisible(false);
        getCheckout().setVisible(false);
        
   }
   
    
}

    
