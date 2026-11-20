package Logica_Negocio.Estados;

import Logica_Negocio.Pedido;

public class Cancelado implements EstadosPedido {
    @Override
    public void avanzar(Pedido p) {}
    @Override
    public String getNombreEstado() {
        return "Cancelado";
    }
}
