package Interfazes;

import javax.swing.JOptionPane;

public class ListaCombos {
    public static void mostrarListaCombos() {

        String[] combos = {
            "Combo 1", "Combo 2",
            "Combo 3", "Combo 4",
            "Combo 5", "Combo 6",
            "Combo 7", "Combo 8"
        };

        String seleccion;

        do {
            seleccion = (String) JOptionPane.showInputDialog(
                null,
                "Seleccione un combo para consultar:",
                "Combos disponibles",
                JOptionPane.QUESTION_MESSAGE,
                null,
                combos,
                combos[0]
            );

            if (seleccion != null) {
                InterCombos.mostrarCombo(seleccion);
            }

        } while (seleccion != null);
    }
}
