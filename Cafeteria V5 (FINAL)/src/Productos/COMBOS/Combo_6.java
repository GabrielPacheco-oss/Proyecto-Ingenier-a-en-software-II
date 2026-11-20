package Productos.COMBOS;

import Logica_Negocio.Pedido;
import Productos.ACOMPANAMIENTOS.PastelDeCarne;
import Productos.BEBIDAS.Gaseosa;
import Productos.POSTRES.Paleta;
import Productos.POSTRES.Tarta;

public class Combo_6 extends Combo {
    public Combo_6() {
        super("Combo 6", 15000);
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre)
            .bebida(new Gaseosa("MEDIANO",2*cantidad))
            .acompanamiento(new PastelDeCarne(1*cantidad))
            .postre(new Paleta(1*cantidad))
            .postre(new Tarta(1*cantidad))
            .build();
            p.setPrecio(15000*cantidad);
        return p;
    }
}
