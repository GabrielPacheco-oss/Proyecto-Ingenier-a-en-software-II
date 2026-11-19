package Logica_Negocio;

import Productos.ACOMPAÑAMIENTOS.Acompañamiento;
import Productos.BEBIDAS.Bebida;
import Productos.POSTRES.Postre;

public class CalcularPrecio {
    public static double calcularPrecio(Pedido.Builder b) {
        double total = 0;
        double precio = 0;
        for (Bebida bebida : b.bebidas) {
            precio = bebida.getPrecio();
            if (bebida.getTamaño().equals("MEDIANO")) {
                precio = precio + 1000;
            }else if (bebida.getTamaño().equals("GRANDE")) {
                precio = precio + 2000;
            }
            total += precio * bebida.getCantidad();
        }
        for (Acompañamiento acom : b.acoms) {
            total += acom.getPrecio() * acom.getCantidad();
        }
        for (Postre postre : b.postres) {
            total += postre.getPrecio() * postre.getCantidad();
        }
        return total;
    }
}
