package Logica_Negocio.Estaciones;

import Logica_Negocio.Estados.Entregando;
import Logica_Negocio.Pedido;
import java.util.ArrayList;

public class Mesero extends Observador{
    public Mesero() {
    }
    protected static ArrayList<Pedido> pedidos = new ArrayList<>();

    @Override
    public void actualizar() {
        for (int i = 0; i < Recepcion.getPedidosLista().size() && pedidos.size() < 2; i++) {
            Pedido p = Recepcion.getPedidosLista().get(i);
            p.setEstado(new Entregando());
            this.pedidos.add(p);
            Recepcion.getPedidosLista().remove(i);
            i--;
        }
    }
    public static ArrayList<Pedido> getPedidosLista() {
        return pedidos;
    }
    @Override
    public String getPedidos(){
        return mostrarPedidos(pedidos);
    }
    public void cerrar() {
        pedidos.clear();
    }
}
