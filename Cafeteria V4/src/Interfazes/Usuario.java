package Interfazes;

import javax.swing.*;

public class Usuario {
    public static void interfazUsuario() {
        String[] opciones = {"Cliente", "Administrador"};

        int seleccion = JOptionPane.showOptionDialog(
            null,
            "¿Cómo desea ingresar al sistema?",
            "Bienvenido",
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );

        switch (seleccion) {
            case 0 -> {
                String cliente = null;
                do{
                    cliente = JOptionPane.showInputDialog(
                    null,
                    "Ingrese su nombre:",
                    "Identificación del cliente",
                    JOptionPane.QUESTION_MESSAGE
                    );
                    if (cliente != null && !cliente.trim().isEmpty()) {
                        InicioCliente.mostrarInicio(cliente);
                    } else {
                        JOptionPane.showMessageDialog(
                            null,
                            "Debe ingresar un nombre."
                        );
                    }
                        
                } while (cliente == null || cliente.trim().isEmpty());
            }
            case 1 -> {
                InicioAdmin.mostrarInicio();
            }
            default -> System.exit(0);
        }
    }
}

