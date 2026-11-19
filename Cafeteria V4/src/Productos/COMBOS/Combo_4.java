package Productos.COMBOS;

import Logica_Negocio.Pedido;
import Productos.ACOMPAÑAMIENTOS.PastelDePollo;
import Productos.ACOMPAÑAMIENTOS.Ojaldre;
import Productos.BEBIDAS.Jugo;

public class Combo_4 extends Combo {
    public Combo_4() {
        super("Combo 4", 6000);
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre, cantidad)
            .bebida(new Jugo("GRANDE",1*cantidad))
            .acompañamiento(new PastelDePollo(1*cantidad))
            .acompañamiento(new Ojaldre(1*cantidad))
            .build();
        return p;
    }
    public String getNombre() {
        return "Combo 4";
    }
    public double getPrecio(int cantidad) {
        return 6000 * cantidad;
    }
}
