package Productos.COMBOS;

import Logica_Negocio.Pedido;
import Productos.BEBIDAS.Capuchino;
import Productos.POSTRES.Brownie;
import Productos.POSTRES.Helado;

public class Combo_3 extends Combo {
    public Combo_3() {
        super("Combo 3", 9000);
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre, cantidad)
            .bebida(new Capuchino("MEDIANO",1*cantidad))
            .postre(new Brownie(1*cantidad))
            .postre(new Helado(1*cantidad))
            .build();
            return p;
    }
}

