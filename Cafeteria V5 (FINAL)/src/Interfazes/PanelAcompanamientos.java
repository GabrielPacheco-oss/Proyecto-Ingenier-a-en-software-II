package Interfazes;

import Logica_Negocio.FabricaAcompanamientos;
import Productos.ACOMPANAMIENTOS.Acompanamiento;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.swing.*;


public class PanelAcompanamientos {

    private static final Map<String, JSpinner> cantidades = new LinkedHashMap<>();

    public static JPanel crearPanel() {
        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(0, 2, 10, 8));
        panel.add(new JLabel("Acompañamiento"));
        panel.add(new JLabel("Cantidad"));

        String[] acompanamientos = {
            "Almojabana", "Galleta", "Huevo", "Ojaldre",
            "Pan", "Pan Frances", "Pastel de Carne",
            "Pastel de Pollo", "Queso"
        };

        for (String nombre : acompanamientos) {
            panel.add(new JLabel(nombre));
            JSpinner cantidad = new JSpinner(
                new SpinnerNumberModel(0, 0, 20, 1)
        );
            cantidades.put(nombre, cantidad);
            panel.add(cantidad);
        }
        return panel;
    }
    public static ArrayList<Acompanamiento> obtenerAcompanamientosSeleccionados() {
        ArrayList<Acompanamiento> acompanamientosSeleccionados = new ArrayList<>();
        for (String nombre : cantidades.keySet()){
            int cantidad = (int) cantidades.get(nombre).getValue();
            if (cantidad > 0) {
                acompanamientosSeleccionados.add((FabricaAcompanamientos.crear(nombre, cantidad)));
            }
        }
        return acompanamientosSeleccionados;
    }
}

