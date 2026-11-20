package Logica_Negocio;

import Logica_Negocio.Descuentos.*;
import Productos.ACOMPANAMIENTOS.Acompanamiento;
import Productos.BEBIDAS.Bebida;
import Productos.POSTRES.Postre;

public class CalcularPrecio {
    public static double calcularPrecio(Pedido.Builder b) {
        
        DescuentoStrategy descuento = new SinDesceunto();
        int hora = Reloj.getCierre();

        double postres = 0;
        double acom = 0 ;
        double bebidas = 0;
        double precio = 0;

        for (Bebida bebida : b.bebidas) {
            precio = bebida.getPrecio();
            if (bebida.getTamaño().equals("MEDIANO")) {
                precio = precio + 1000;
            }else if (bebida.getTamaño().equals("GRANDE")) {
                precio = precio + 2000;
            }
            bebidas += precio * bebida.getCantidad();
        }
        for (Acompanamiento a : b.acoms) {
            acom += a.getPrecio() * a.getCantidad();
        }
        for (Postre postre : b.postres) {
            postres += postre.getPrecio() * postre.getCantidad();
        }
        switch (hora) {
            case 4: {
                descuento = new DescuentoBebidas();
                bebidas = descuento.aplicarDescuento(bebidas);
                break;
            }
            case 5: {
                descuento = new DescuentoAcom();
                acom = descuento.aplicarDescuento(acom);
                break;
            }
            case 6: {
                descuento = new DescuentoPostres();
                postres = descuento.aplicarDescuento(postres);
                break;
            }
            case 7: {
                descuento = new SinDesceunto();
                break;
            }
        }
        return bebidas + acom + postres;
    }
}
