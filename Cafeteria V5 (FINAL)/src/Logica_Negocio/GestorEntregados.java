package Logica_Negocio;

import java.util.ArrayList;

public class GestorEntregados {
    private static double totalGanancias = 0;
    private static ArrayList<Pedido> pedidos = new ArrayList<>();
    
    public static void agregarPedido(Pedido p) {
        pedidos.add(p);
        totalGanancias += p.getPrecio();
    }

    public static String obtenerPedidos() {
        String mensaje = "";
        if (pedidos.isEmpty()) {
            return "No se han completado pedidos.";
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
    public static ArrayList<Pedido> getPedidos() {
        return pedidos;
    }
    public static double getGanancias() {
        double total = 0;
        for (Pedido p : pedidos) {
            total += p.getPrecio();
        }
        return total;
    }
    public static double getTotalGanancias() {
        return totalGanancias;
    }
    public static void vaciar() {
        pedidos.clear();
    }
}
