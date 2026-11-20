package Interfazes;

import Logica_Negocio.FabricaPostres;
import Productos.POSTRES.*;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.*;


public class PanelPostres {

    private static final Map<String, JSpinner> cantidades = new LinkedHashMap<>();

    public static JPanel crearPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 8));
        panel.add(new JLabel("Postre"));
        panel.add(new JLabel("Cantidad"));

        String[] postres = {
            "Arroz con Leche", "Brownie", "Helado", "Paleta",
            "Tarta"
        };

        for (String nombre : postres) {
            panel.add(new JLabel(nombre));
            JSpinner cantidad = new JSpinner(
                new SpinnerNumberModel(0, 0, 20, 1)
        );
            cantidades.put(nombre, cantidad);
            panel.add(cantidad);
        }
        return panel;
    }

    public static ArrayList<Postre> obtenerPostresSeleccionados() {
        ArrayList<Postre> postresSeleccionados = new ArrayList<>();
        for (String nombre : cantidades.keySet()){
            int cantidad = (int) cantidades.get(nombre).getValue();
            if (cantidad > 0) {
                postresSeleccionados.add((FabricaPostres.crear(nombre, cantidad)));
            }
        }
        return postresSeleccionados;
    }
}