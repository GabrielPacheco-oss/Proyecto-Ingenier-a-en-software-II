package Logica_Negocio.Estaciones;

import Logica_Negocio.Estados.Listo;
import Logica_Negocio.Pedido;
import java.util.ArrayList;

public class Recepcion extends Observador {
    public Recepcion() {
    }
    protected static ArrayList<Pedido> pedidos = new ArrayList<>();
    @Override
    public void actualizar() {
        while (pedidos.size() <5 && !Cocina.getPedidosLista().isEmpty()) {
            Pedido p = Cocina.getPedidosLista().get(0);
            p.setEstado(new Listo());
            this.pedidos.add(p);
            Cocina.getPedidosLista().remove(0);
        }
    }
    public static ArrayList<Pedido> getPedidosLista() {
        return pedidos;
    }
    @Override
    public String getPedidos() {
        return mostrarPedidos(pedidos);
    }
    public void cerrar() {
        pedidos.clear();
    }
}
