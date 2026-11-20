package Logica_Negocio.Estados;

import Logica_Negocio.Pedido;

public interface EstadosPedido {
    abstract void avanzar(Pedido p);
    abstract String getNombreEstado();
}
