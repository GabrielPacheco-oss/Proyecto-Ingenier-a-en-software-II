package Logica_Negocio;

import java.util.ArrayList;
import java.util.List;

public class GestorPedidos {

    private static List<Pedido> pedidos = new ArrayList<>();

    public static void agregarPedido(Pedido p) {
        pedidos.add(p);
    }
    public static String obtenerPedidos() {
        String mensaje = "";
        if (pedidos.isEmpty()) {
            return "No hay pedidos.";
        } else {
            for (Pedido p : pedidos) {
            mensaje += "Pedido #: " + p.getId() + "\n";
            mensaje += "Cliente: " + p.getCliente() + "\n";
            mensaje += "Estado: " + p.getEstado() + "\n";
            mensaje += "Total: " + p.getPrecio() + "\n";
            }
            return mensaje;
        }
    }

}
