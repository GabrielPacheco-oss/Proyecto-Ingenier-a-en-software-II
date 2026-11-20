package Interfazes;

import Logica_Negocio.GestorEntregados;
import Logica_Negocio.GestorPedidos;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;

public class VerPedidos {
    public static void mostrarPedidos() {

        JPanel panel = new JPanel(new GridLayout(1, 2,10,0));
        JTextArea pendientes = new JTextArea(
            GestorPedidos.obtenerPedidos()
        );
        pendientes.setEditable(false);
        JScrollPane scroll = new JScrollPane(pendientes);

        JTextArea entregados = new JTextArea(
            GestorEntregados.obtenerPedidos()
        );
        entregados.setEditable(false);
        JScrollPane scrollEntregados = new JScrollPane(entregados);

        JPanel colPendientes = new JPanel(new BorderLayout(0, 2));
        colPendientes.add(new JLabel("Pedidos pendientes:\n"), BorderLayout.NORTH);
        colPendientes.add(scroll, BorderLayout.CENTER);

        JPanel colEntregados = new JPanel(new BorderLayout(0, 2));
        colEntregados.add(new JLabel("Pedidos entregados:\n"), BorderLayout.NORTH);
        colEntregados.add(scrollEntregados, BorderLayout.CENTER);

        panel.add(colPendientes);
        panel.add(colEntregados);

        panel.setPreferredSize(new Dimension(400, 500));

        JOptionPane.showMessageDialog(
            null,
            panel,
            "Pedidos registrados",
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
