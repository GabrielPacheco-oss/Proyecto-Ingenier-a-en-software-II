package Productos.COMBOS;
import Productos.ACOMPAÑAMIENTOS.Galleta;
import Productos.ACOMPAÑAMIENTOS.Ojaldre;
import Productos.BEBIDAS.Cafe;
import Productos.POSTRES.Tarta;
import Logica_Negocio.Pedido;

public class Combo_8 extends Combo {
    public Combo_8() {
        super("Combo 8", 7000);
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre, cantidad)
            .bebida(new Cafe("MEDIANO",1*cantidad))
            .acompañamiento(new Galleta(1*cantidad))
            .acompañamiento(new Ojaldre(1*cantidad))
            .postre(new Tarta(1*cantidad))
            .build();
        return p;
    }
}
