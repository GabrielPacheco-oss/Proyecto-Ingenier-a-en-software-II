package Logica_Negocio.Estaciones;

import Logica_Negocio.Pedido;
import java.util.ArrayList;

abstract public class Observador {
    abstract public void actualizar();
    public String mostrarPedidos(ArrayList<Pedido> pedidos) {
        String mensaje = "";
        if (pedidos.isEmpty()) {
            return "Aun no hay pedidos.\n";
        }
        for (Pedido p : pedidos) {
            mensaje += "Pedido #: " + p.getId() + "\n";
            mensaje += "Cliente: " + p.getCliente() + "\n";
            mensaje += "Estado: " + p.getEstadoTexto() + "\n";
            mensaje += "Total: " + p.getPrecio() + "\n\n";
        }
        return mensaje;
    }
    abstract public String getPedidos();
}
