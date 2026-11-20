package Productos.COMBOS;

import Logica_Negocio.Pedido;
import Productos.ACOMPANAMIENTOS.Huevo;
import Productos.ACOMPANAMIENTOS.PanFrances;
import Productos.BEBIDAS.Chocolate;
import Productos.BEBIDAS.Jugo;
import Productos.POSTRES.ArrozConLeche;

public class Combo_2 extends Combo {
    public Combo_2() {
        super("Combo 2", 15000);
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre)
            .bebida(new Chocolate("GRANDE",1*cantidad))
            .bebida(new Jugo("PEQUEÑO", 1*cantidad))
            .acompanamiento(new Huevo(2*cantidad))
            .acompanamiento(new PanFrances(2*cantidad))
            .postre(new ArrozConLeche(1*cantidad))
            .build();
            p.setPrecio(15000*cantidad);
        return p;
    }
}
