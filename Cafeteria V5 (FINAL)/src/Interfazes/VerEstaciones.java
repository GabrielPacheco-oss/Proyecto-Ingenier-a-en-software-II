package Interfazes;

import Logica_Negocio.Estaciones.*;
import Logica_Negocio.Reloj;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import javax.swing.*;


public class VerEstaciones {
    public static void mostrarEstaciones(Cocina c, Recepcion r, Mesero m, Completos comp, Reloj reloj) {
        JPanel panel = new JPanel(new GridLayout(1, 2,10,0));
        
        JTextArea cocina = new JTextArea(c.getPedidos());
        cocina.setEditable(false);
        JScrollPane areaCocina = new JScrollPane(cocina);

        JTextArea recepcion = new JTextArea(r.getPedidos());
        recepcion.setEditable(false);
        JScrollPane areaRecepcion = new JScrollPane(recepcion);

        JTextArea mesero = new JTextArea(m.getPedidos());
        mesero.setEditable(false);
        JScrollPane areaMesero = new JScrollPane(mesero);

        JTextArea completos = new JTextArea(comp.getPedidos());
        completos.setEditable(false);
        JScrollPane areaCompletos = new JScrollPane(completos);

        JPanel colCocina = new JPanel(new BorderLayout(0, 2));
        colCocina.add(new JLabel("Pedidos en preparacion:\n"), BorderLayout.NORTH);
        colCocina.add(areaCocina, BorderLayout.CENTER);

        JPanel colRecepcion = new JPanel(new BorderLayout(0, 2));
        colRecepcion.add(new JLabel("Pedidos finalizados:\n"), BorderLayout.NORTH);
        colRecepcion.add(areaRecepcion, BorderLayout.CENTER);

        JPanel colMesero = new JPanel(new BorderLayout(0, 2));
        colMesero.add(new JLabel("Pedidos que lleva el mesero:\n"), BorderLayout.NORTH);
        colMesero.add(areaMesero, BorderLayout.CENTER);

        JPanel colCompletos = new JPanel(new BorderLayout(0, 2));
        colCompletos.add(new JLabel("Pedidos entregados:\n"), BorderLayout.NORTH);
        colCompletos.add(areaCompletos, BorderLayout.CENTER);
        
        panel.add(colCocina);
        panel.add(colRecepcion);
        panel.add(colMesero);
        panel.add(colCompletos);
        panel.setPreferredSize(new Dimension(1000, 300));

        JOptionPane.showMessageDialog(
            null,
            panel,
            "Estado de las Estaciones - " + reloj.getHora(),
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
