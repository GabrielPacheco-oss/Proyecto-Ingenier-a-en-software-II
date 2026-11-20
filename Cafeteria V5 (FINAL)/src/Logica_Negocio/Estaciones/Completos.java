package Logica_Negocio.Estaciones;

import Logica_Negocio.Estados.Entregado;
import Logica_Negocio.GestorEntregados;
import Logica_Negocio.Pedido;

public class Completos extends Observador {
    public Completos() {
    }
    @Override
    public void actualizar() {
        while (!Mesero.getPedidosLista().isEmpty()) {
            Pedido p = Mesero.getPedidosLista().get(0);
            p.setEstado(new Entregado());
            GestorEntregados.agregarPedido(p);
            Mesero.getPedidosLista().remove(0);
        }
    }
    @Override
    public String getPedidos() {
        return GestorEntregados.obtenerPedidos();
    }
    public void cerrar(){
        GestorEntregados.vaciar();
    }
}
