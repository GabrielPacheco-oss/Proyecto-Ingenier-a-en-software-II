package Productos.COMBOS;

import Logica_Negocio.Pedido;
import Productos.ACOMPAÑAMIENTOS.Galleta;
import Productos.ACOMPAÑAMIENTOS.Pan;
import Productos.BEBIDAS.Cafe;
import Productos.BEBIDAS.Tee;
import Productos.POSTRES.Helado;

public class Combo_5 extends Combo {
    public Combo_5() {
        super("Combo 5", 11000);
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre, cantidad)
            .bebida(new Cafe("MEDIANO",1*cantidad))
            .bebida(new Tee("MEDIANO", 1*cantidad))
            .acompañamiento(new Galleta(3*cantidad))
            .acompañamiento(new Pan(1*cantidad))
            .postre(new Helado(2*cantidad))
            .build();
        return p;
    }
    public String getNombre() {
        return "Combo 5";
    }
    public double getPrecio(int cantidad) {
        return 11000 * cantidad;
    }
}
    