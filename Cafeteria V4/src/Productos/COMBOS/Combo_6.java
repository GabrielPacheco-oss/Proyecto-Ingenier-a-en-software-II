package Productos.COMBOS;

import Logica_Negocio.Pedido;
import Productos.ACOMPAÑAMIENTOS.PastelDeCarne;
import Productos.ACOMPAÑAMIENTOS.Sandwich;
import Productos.BEBIDAS.Gaseosa;
import Productos.POSTRES.Paleta;
import Productos.POSTRES.Tarta;

public class Combo_6 extends Combo {
    public Combo_6() {
        super("Combo 6", 18000);
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre, cantidad)
            .bebida(new Gaseosa("MEDIANO",2*cantidad))
            .acompañamiento(new Sandwich(1*cantidad))
            .acompañamiento(new PastelDeCarne(1*cantidad))
            .postre(new Paleta(1*cantidad))
            .postre(new Tarta(1*cantidad))
            .build();
        return p;
    }
}
