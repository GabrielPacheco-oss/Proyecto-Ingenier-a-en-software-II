package Logica_Negocio.Estados;

import Logica_Negocio.Pedido;

public class Entregando implements EstadosPedido {
    @Override
    public void avanzar(Pedido P) {
        P.setEstado(new Entregado());
    }
    @Override
    public String getNombreEstado() {
        return "Entregando";
    }

}
