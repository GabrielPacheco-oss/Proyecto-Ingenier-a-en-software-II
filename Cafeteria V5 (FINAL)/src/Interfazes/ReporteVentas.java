package Interfazes;

import Logica_Negocio.GestorEntregados;
import Logica_Negocio.Pedido;
import Logica_Negocio.Reloj;
import javax.swing.*;
import java.awt.*;

public class ReporteVentas {
    public static void mostrarReporte() {

        String mensaje = "";
        int cantidad = 0;

        for (Pedido p : GestorEntregados.getPedidos()) {
            mensaje += "Pedido #: " + p.getId() + "\n";
            mensaje += "Cliente: " + p.getCliente() + "\n";
            mensaje += "Total: $" + p.getPrecio() + "\n\n";
            cantidad++;
        }
        if (cantidad == 0) {
            mensaje = "No se han vendido pedidos.";
        }
        JTextArea texto = new JTextArea(mensaje);
        texto.setEditable(false);

        JScrollPane scroll = new JScrollPane(texto);
        scroll.setPreferredSize(new Dimension(400, 300));

        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

        panel.add(new JLabel("Pedidos vendidos: " + cantidad + "            Dia: " + Reloj.getDias()));
        panel.add(scroll);
        panel.add(new JLabel("Ganancias totales de hoy: $" + GestorEntregados.getGanancias()));
        panel.add(new JLabel("Ganancias totales: $" + GestorEntregados.getTotalGanancias()));

        JOptionPane.showMessageDialog(
            null,
            panel,
            "Reporte de ventas",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
