package Interfazes;

import Logica_Negocio.*;
import Productos.COMBOS.*;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;

public class ListaCombos {
    public static void mostrarListaCombos(String cliente) {
        do{
            JPanel panel = new JPanel();
            panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));
            JTextArea descripcion = new JTextArea(
                "COMBOS DISPONIBLES\n" +
                "Combo 1 - $1000 - incluye: Incluye: Tinto pequeño, Almojabana, Queso\n" +
                "Combo 2 - $15000 - incluye: Chocolate grande, Jugo pequeño, 2 Huevos, 2 Panes Franceses, Arroz con Leche\n" +
                "Combo 3 - $9000 - incluye: Jugo mediano, Pastel de Pollo, Ojaldre\n" +
                "Combo 4 - $6000 - incluye: Jugo grande, Pastel de Pollo, Ojaldre\n" +
                "Combo 5 - $11000 - incluye: Cafe mediano, Tee mediano, 3 Galletas, Pan, 2 Helados\n" +
                "Combo 6 - $18000 - incluye: Gaseosa mediana, Sandwich, Pastel de Carne, Paleta, Tarta\n" +
                "Combo 7 - $4000 - incluye: Leche mediana, Cafe pequeño, Pan, Queso\n" +
                "Combo 8 - $9500 - incluye: Cafe mediano, Galleta, Ojaldre, Tarta"
            );
            descripcion.setEditable(false);
            panel.add(new JScrollPane(descripcion));
            
            JPanel opciones = new JPanel();
            opciones.setLayout(new FlowLayout(FlowLayout.LEFT,5,10));
            panel.add(opciones);
            
            String[] combos = {
                "Combo 1", "Combo 2",
                "Combo 3", "Combo 4",
                "Combo 5", "Combo 6",
                "Combo 7", "Combo 8"
            };

            JComboBox<String> listaCombos = new JComboBox<>(combos);
            listaCombos.setPreferredSize(new Dimension(150, 25));
            listaCombos.setMaximumSize(new Dimension(150, 25));

            JSpinner cantidad = new JSpinner(
                new SpinnerNumberModel(1, 1, 10, 1)
            );
            cantidad.setPreferredSize(new Dimension(70, 25));
            cantidad.setMaximumSize(new Dimension(70, 25));

            opciones.add(new JLabel("Seleccione el combo:"));
            opciones.add(listaCombos);
            opciones.add(Box.createHorizontalStrut(20));    
            opciones.add(new JLabel("Cantidad de combos:"));
            opciones.add(cantidad);

            int opcion = JOptionPane.showOptionDialog(
                null,
                panel,
                "Combos disponibles",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.INFORMATION_MESSAGE,
                null,
                new String[]{"Volver", "Confirmar"},
                "Confirmar"
            );

            if (opcion == 1) {
                Combo comboSeleccionado = switch (listaCombos.getSelectedIndex()) {
                    case 0 -> new Combo_1();
                    case 1 -> new Combo_2();
                    case 2 -> new Combo_3();
                    case 3 -> new Combo_4();
                    case 4 -> new Combo_5();
                    case 5 -> new Combo_6();
                    case 6 -> new Combo_7();
                    case 7 -> new Combo_8();
                    default -> null;
                };
                Pedido pedido = FabricaCombos.crearCombo(comboSeleccionado,cliente,(int)cantidad.getValue());
                JOptionPane.showMessageDialog(
                    null,
                    "¡Pedido creado correctamente!\n" +
                    comboSeleccionado.getNombre() +
                    "\nCantidad: " + cantidad.getValue() +
                    "\nPrecio: " + comboSeleccionado.getPrecio((int)cantidad.getValue())
                );
                GestorPedidos.agregarPedido(pedido);

            } else if (opcion == 0) {
                InicioCliente.mostrarInicio(cliente);
            }
        }while (true);
    }
}
