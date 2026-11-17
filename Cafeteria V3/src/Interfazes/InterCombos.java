
package Interfazes;

import Logica_Negocio.*;
import Productos.ACOMPAÑAMIENTOS.*;
import Productos.BEBIDAS.*;
import Productos.POSTRES.*;
import javax.swing.JOptionPane;

public class InterCombos {

    public static void mostrarCombo(String combo) {

        Pedido p = FabricaCombos.crearCombo(combo, 1);
        StringBuilder mensaje = new StringBuilder();

        mensaje.append(combo).append("\n\n");

        mensaje.append("BEBIDAS:\n");
        for (Bebida b : p.getBebidas()) {
            mensaje.append("- ")
                   .append(b.getNombre())
                   .append(" (").append(b.getTamaño()).append(")")
                   .append(" x ").append(b.getCantidad())
                   .append("\n");
        }

        mensaje.append("\nACOMPAÑAMIENTOS:\n");
        for (Acompañamiento a : p.getAcoms()) {
            mensaje.append("- ")
                   .append(a.getNombre())
                   .append(" x ").append(a.getCantidad())
                   .append("\n");
        }

        mensaje.append("\nPOSTRES:\n");
        for (Postre po : p.getPostres()) {
            mensaje.append("- ")
                   .append(po.getNombre())
                   .append(" x ").append(po.getCantidad())
                   .append("\n");
        }

        mensaje.append("\nPRECIO: $")
               .append(p.getPrecio());

        JOptionPane.showMessageDialog(
            null,
            mensaje.toString(),
            "Detalle de " + combo,
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
