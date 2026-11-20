package Productos.COMBOS;

import Logica_Negocio.Pedido;
import Productos.ACOMPANAMIENTOS.Almojabana;
import Productos.ACOMPANAMIENTOS.Queso;
import Productos.BEBIDAS.Tinto;

public class Combo_1 extends Combo {
    public Combo_1() {
        super("Combo 1",1000); 
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre)
            .bebida(new Tinto("PEQUEÑO",1*cantidad))
            .acompanamiento(new Almojabana(1*cantidad))
            .acompanamiento(new Queso(1*cantidad))
            .build();
            p.setPrecio(1000*cantidad);
        return p;
    }
}
