package Logica_Negocio.Estados;

import Logica_Negocio.Pedido;

public class EnPreparacion implements EstadosPedido{
    @Override
    public void avanzar(Pedido p) {
        p.setEstado(new Listo());
    }
    @Override
    public String getNombreEstado() {
        return "En preparación";
    }
}
