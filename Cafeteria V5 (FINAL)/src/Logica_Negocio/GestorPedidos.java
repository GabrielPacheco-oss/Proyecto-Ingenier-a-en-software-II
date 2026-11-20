package Logica_Negocio;

import Logica_Negocio.Estaciones.Observador;
import java.util.ArrayList;

public class GestorPedidos {
    public GestorPedidos() {
    }
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    private static ArrayList<Observador> observadores = new ArrayList<>();

    public static void agregarPedido(Pedido p) {
        pedidos.add(p);
        for (Observador o : observadores) {
            p.agregarObservador(o);
        }
    }

    public static String obtenerPedidos() {
        String mensaje = "";
        if (pedidos.isEmpty()) {
            return "No hay pedidos.";
        } else {
            for (Pedido p : pedidos) {
            mensaje += "Pedido #: " + p.getId() + "\n";
            mensaje += "Cliente: " + p.getCliente() + "\n";
            mensaje += "Estado: " + p.getEstadoTexto() + "\n";
            mensaje += "Total: " + p.getPrecio() + "\n\n";
            }
            return mensaje;
        }
    }
    public static void añadirObservador(Observador o) {
        observadores.add(o);
    }
    public static void eliminarObservador(Observador o) {
        for (Pedido pedido : pedidos) {
            pedido.eliminarObservador(o);
        }
    }
    public static ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
}
