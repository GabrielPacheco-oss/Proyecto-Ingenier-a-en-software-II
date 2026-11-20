
package Interfazes;

import Logica_Negocio.GestorPedidos;
import Logica_Negocio.Pedido;
import Logica_Negocio.PedidoPersonalizado;
import Logica_Negocio.Reloj;
import javax.swing.*;

public class CrearPedido {
    public static void mostrarFormulario(String cliente, Reloj reloj) {

        JTabbedPane pestañas = new JTabbedPane();
        JPanel panelBebidas = PanelBebidas.crearPanel();
        JPanel panelAcompañamientos = PanelAcompanamientos.crearPanel();
        JPanel panelPostres = PanelPostres.crearPanel();

        pestañas.addTab("Bebidas", new JScrollPane(panelBebidas));
        pestañas.addTab("Acompañamientos", new JScrollPane(panelAcompañamientos));
        pestañas.addTab("Postres", new JScrollPane(panelPostres));

        int opcion = JOptionPane.showConfirmDialog(
            null,
            pestañas,
            "Pedido personalizado - " + cliente + " - " + reloj.getHora(),
            JOptionPane.OK_CANCEL_OPTION,
            JOptionPane.PLAIN_MESSAGE
        );
        if (opcion == JOptionPane.OK_OPTION) {
            Pedido p = PedidoPersonalizado.crearPedido(cliente,
                PanelBebidas.obtenerBebidasSeleccionadas(),
                PanelAcompanamientos.obtenerAcompanamientosSeleccionados(),
                PanelPostres.obtenerPostresSeleccionados()
            );
            if (PanelBebidas.obtenerBebidasSeleccionadas().isEmpty() &&
                PanelAcompanamientos.obtenerAcompanamientosSeleccionados().isEmpty() &&
                PanelPostres.obtenerPostresSeleccionados().isEmpty()) {
                JOptionPane.showMessageDialog(
                    null,
                    "Debe seleccionar al menos un producto."
                );
                return;
            }
            JOptionPane.showMessageDialog(
                null,
                "¡Pedido creado correctamente!\n" +
                "\nPara: " + cliente +
                "\nPrecio: " + p.getPrecio()
            );
            GestorPedidos.agregarPedido(p);
            panelBebidas.removeAll();
            panelAcompañamientos.removeAll();
            panelPostres.removeAll();
        }
    }
}
