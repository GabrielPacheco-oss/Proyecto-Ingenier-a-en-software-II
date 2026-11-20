package Logica_Negocio.Descuentos;

public class DescuentoBebidas implements DescuentoStrategy {
    public double aplicarDescuento(double total) {
        return total * 0.9;
    }
}
