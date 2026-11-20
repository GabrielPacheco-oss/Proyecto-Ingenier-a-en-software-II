package Productos.COMBOS;
import Logica_Negocio.Pedido;
import Productos.ACOMPANAMIENTOS.Galleta;
import Productos.ACOMPANAMIENTOS.Ojaldre;
import Productos.BEBIDAS.Cafe;
import Productos.POSTRES.Tarta;

public class Combo_8 extends Combo {
    public Combo_8() {
        super("Combo 8", 7000);
    }
    @Override
    public Pedido crearCombo(String nombre, int cantidad) {
        Pedido p = new Pedido.Builder(nombre)
            .bebida(new Cafe("MEDIANO",1*cantidad))
            .acompanamiento(new Galleta(1*cantidad))
            .acompanamiento(new Ojaldre(1*cantidad))
            .postre(new Tarta(1*cantidad))
            .build();
            p.setPrecio(7000*cantidad);
        return p;
    }
}
