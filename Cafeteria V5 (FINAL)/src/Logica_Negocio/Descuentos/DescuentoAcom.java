package Logica_Negocio.Descuentos;

public class DescuentoAcom implements DescuentoStrategy {
    public double aplicarDescuento(double total) {
        return total * 0.8;
    }
}
