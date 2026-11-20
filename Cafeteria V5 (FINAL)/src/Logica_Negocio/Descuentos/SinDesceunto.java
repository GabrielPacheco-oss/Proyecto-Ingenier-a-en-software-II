package Logica_Negocio.Descuentos;

public class SinDesceunto implements DescuentoStrategy {
    public double aplicarDescuento(double total) {
        return total;
    }
}
