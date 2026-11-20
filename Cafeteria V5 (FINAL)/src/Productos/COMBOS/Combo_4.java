package Productos.COMBOS;

import Logica_Negocio.Pedido;
import Productos.ACOMPANAMIENTOS.Ojaldre;
import Productos.ACOMPANAMIENTOS.PastelDePollo;
import Productos.BEBIDAS.Jugo;

public class Combo_4 extends Combo {
    public Combo_4() {
        super("Combo 4", 6000);
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre)
            .bebida(new Jugo("GRANDE",1*cantidad))
            .acompanamiento(new PastelDePollo(1*cantidad))
            .acompanamiento(new Ojaldre(1*cantidad))
            .build();
            p.setPrecio(6000*cantidad);
        return p;
    }
}
