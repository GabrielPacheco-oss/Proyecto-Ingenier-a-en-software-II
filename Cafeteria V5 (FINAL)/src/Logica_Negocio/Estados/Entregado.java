package Logica_Negocio.Estados;

import Logica_Negocio.Pedido;

public class Entregado implements EstadosPedido{
    @Override
    public void avanzar(Pedido p) {}
    @Override
    public String getNombreEstado() {
        return "Entregado";
    }
}
