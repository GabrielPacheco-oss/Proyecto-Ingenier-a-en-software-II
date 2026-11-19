package Productos.COMBOS;

import Logica_Negocio.Pedido;
import Productos.ACOMPAÑAMIENTOS.Almojabana;
import Productos.ACOMPAÑAMIENTOS.Queso;
import Productos.BEBIDAS.Tinto;

public class Combo_1 extends Combo {
    public Combo_1() {
        super("Combo_1",1000); 
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre, cantidad)
            .bebida(new Tinto("PEQUEÑO",1*cantidad))
            .acompañamiento(new Almojabana(1*cantidad))
            .acompañamiento(new Queso(1*cantidad))
            .build();
        return p;
    }
}
