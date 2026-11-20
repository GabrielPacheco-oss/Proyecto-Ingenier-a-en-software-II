package Interfazes;

import Logica_Negocio.FabricaBebidas;
import Productos.BEBIDAS.*;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.*;

public class PanelBebidas{

    private static final Map<String, JComboBox<String>> tamaños = new LinkedHashMap<>();
    private static final Map<String, JSpinner> cantidades = new LinkedHashMap<>();

    public static JPanel crearPanel() {
        
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 3, 10, 8));
        panel.add(new JLabel("Bebida"));
        panel.add(new JLabel("Tamaño"));
        panel.add(new JLabel("Cantidad"));

        String[] bebidas = {
            "Cafe",      "Capuchino",
            "Chocolate", "Gaseosa",
            "Jugo",      "Leche",
            "Tee",       "Tinto"
        };
        
        for (String nombre : bebidas) {
            panel.add(new JLabel(nombre));
            JComboBox<String> tamaño = new JComboBox<>(new String[]{"PEQUEÑO", "MEDIANO", "GRANDE"}
            );
            tamaños.put(nombre, tamaño);
            panel.add(tamaño);
            JSpinner cantidad = new JSpinner(
                new SpinnerNumberModel(0, 0, 20, 1)
            );
            cantidades.put(nombre, cantidad);
            panel.add(cantidad);
        }
        return panel;
    }

    public static ArrayList<Bebida> obtenerBebidasSeleccionadas() {
        ArrayList<Bebida> bebidasSeleccionadas = new ArrayList<>();
        for (String nombre : cantidades.keySet()) {
            int cantidad = (int) cantidades.get(nombre).getValue();
            if (cantidad > 0) {
                String tamaño = (String)
                    tamaños.get(nombre).getSelectedItem();
                bebidasSeleccionadas.add((FabricaBebidas.crear(nombre, tamaño, cantidad)));
            }
        }
        return bebidasSeleccionadas;
    }
}
