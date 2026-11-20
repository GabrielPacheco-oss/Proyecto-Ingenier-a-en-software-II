package Logica_Negocio.Estados;

import Logica_Negocio.Pedido;

public class Listo implements EstadosPedido{
    @Override
    public void avanzar(Pedido p) {
        p.setEstado(new Entregado());
    }
    @Override
    public String getNombreEstado() {
        return "Listo";
    }
}
