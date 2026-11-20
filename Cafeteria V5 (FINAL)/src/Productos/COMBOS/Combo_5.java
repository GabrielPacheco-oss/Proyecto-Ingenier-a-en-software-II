package Productos.COMBOS;

import Logica_Negocio.Pedido;
import Productos.ACOMPANAMIENTOS.Galleta;
import Productos.ACOMPANAMIENTOS.Pan;
import Productos.BEBIDAS.Cafe;
import Productos.BEBIDAS.Tee;
import Productos.POSTRES.Helado;

public class Combo_5 extends Combo {
    public Combo_5() {
        super("Combo 5", 11000);
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre)
            .bebida(new Cafe("MEDIANO",1*cantidad))
            .bebida(new Tee("MEDIANO", 1*cantidad))
            .acompanamiento(new Galleta(3*cantidad))
            .acompanamiento(new Pan(1*cantidad))
            .postre(new Helado(2*cantidad))
            .build();
            p.setPrecio(11000*cantidad);
        return p;
    }
}
    