package Logica_Negocio.Estaciones;

import Logica_Negocio.Estados.EnPreparacion;
import Logica_Negocio.GestorPedidos;
import Logica_Negocio.Pedido;
import java.util.ArrayList;

public class Cocina extends Observador {
    public Cocina() {
    }
    protected static ArrayList<Pedido> pedidos = new ArrayList<>();
    @Override
    public void actualizar() {
        while (pedidos.size() <3 && !GestorPedidos.getPedidos().isEmpty()) {
            Pedido p = GestorPedidos.getPedidos().get(0);
            p.setEstado(new EnPreparacion());
            this.pedidos.add(p);
            GestorPedidos.getPedidos().remove(0);
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
