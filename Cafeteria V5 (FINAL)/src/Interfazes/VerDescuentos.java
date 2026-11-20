package Interfazes;

public class VerDescuentos {
    public static void mostrarDescuentos() {
        String mensaje = "Descuentos disponibles (No aplica en combos):\n";
        mensaje += "De 4 a 5: Descuento en bebidas\n";
        mensaje += "De 5 a 6: Descuento en acompañamientos\n";
        mensaje += "De 6 a 7: Descuento en postres\n";
        mensaje += "A partir de las 7: Sin descuentos\n";
        javax.swing.JOptionPane.showMessageDialog(null, mensaje);
    }
}
