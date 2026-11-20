package Logica_Negocio.Estados;

import Logica_Negocio.Pedido;

public class Recibido implements EstadosPedido{
    @Override
    public void avanzar(Pedido p) {
        p.setEstado(new EnPreparacion());
    }
    @Override
    public String getNombreEstado() {
        return "Recibido";
    }
}
