import Interfazes.*;
import Logica_Negocio.Estaciones.*;
import Logica_Negocio.GestorPedidos;
import Logica_Negocio.Reloj;

public class Main {
    public static void main(String[] args) {

        Cocina cocina = new Cocina();
        Recepcion recepcion = new Recepcion();
        Mesero mesero = new Mesero();
        Completos completos = new Completos();
        
        GestorPedidos gestorPedidos = new GestorPedidos();
        
        gestorPedidos.añadirObservador(cocina);
        gestorPedidos.añadirObservador(recepcion);
        gestorPedidos.añadirObservador(mesero);
        gestorPedidos.añadirObservador(completos);

        Reloj reloj = new Reloj(cocina, recepcion, mesero, completos);

        Usuario.interfazUsuario(cocina, recepcion, mesero, completos, reloj);
    }
}