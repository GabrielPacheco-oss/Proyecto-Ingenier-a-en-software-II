package Productos.COMBOS;

import Logica_Negocio.Pedido;
import Productos.ACOMPAÑAMIENTOS.Huevo;
import Productos.ACOMPAÑAMIENTOS.PanFrances;
import Productos.BEBIDAS.Chocolate;
import Productos.BEBIDAS.Jugo;
import Productos.POSTRES.ArrozConLeche;

public class Combo_2 extends Combo {
    public Combo_2() {
        super("Combo 2", 15000);
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre, cantidad)
            .bebida(new Chocolate("GRANDE",1*cantidad))
            .bebida(new Jugo("PEQUEÑO", 1*cantidad))
            .acompañamiento(new Huevo(2*cantidad))
            .acompañamiento(new PanFrances(2*cantidad))
            .postre(new ArrozConLeche(1*cantidad))
            .build();
        return p;
    }
}
