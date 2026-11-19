package Productos.COMBOS;
import Logica_Negocio.Pedido;
import Productos.ACOMPAÑAMIENTOS.Pan;
import Productos.ACOMPAÑAMIENTOS.Queso;
import Productos.BEBIDAS.Cafe;
import Productos.BEBIDAS.Leche;

public class Combo_7 extends Combo {
    public Combo_7() {
        super("Combo 7", 4000);
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre, cantidad)
            .bebida(new Leche("MEDIANO",1*cantidad))
            .bebida(new Cafe("PEQUEÑO", 1*cantidad))
            .acompañamiento(new Pan(1*cantidad))
            .acompañamiento(new Queso(1*cantidad))
            .build();
        return p;
    }
}
    