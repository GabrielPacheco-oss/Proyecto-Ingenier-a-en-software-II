package Interfazes;

import Logica_Negocio.Estaciones.*;
import Logica_Negocio.Reloj;
import javax.swing.*;

public class Usuario {
    public static void interfazUsuario(Cocina c, Recepcion r, Mesero m, Completos comp, Reloj reloj) {
        String[] opciones = {"Cliente", "Administrador","Salir"};
        int seleccion = JOptionPane.showOptionDialog(
            null,
            "¿Cómo desea ingresar al sistema?",
            "Bienvenido - " + reloj.getHora(),
            JOptionPane.DEFAULT_OPTION,
            JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );
        switch (seleccion) {
            case 0 -> {
                String cliente;
                do {
                    if (reloj.getCierre() == 8) {
                        JOptionPane.showMessageDialog(
                            null,
                            "El cafe ha cerrado, vuelva mañana.",
                            "Buenas noches",
                            JOptionPane.ERROR_MESSAGE
                        );
                        Usuario.interfazUsuario(c, r, m, comp, reloj);
                    }
                    cliente = JOptionPane.showInputDialog(
                        null,
                        "Ingrese su nombre:",
                        "Identificación del cliente",
                        JOptionPane.QUESTION_MESSAGE
                    );
                    if (cliente == null) {
                        Usuario.interfazUsuario(c, r, m, comp, reloj);
                    }
                    if (cliente.trim().isEmpty()) {
                        JOptionPane.showMessageDialog(
                            null,
                            "Debe ingresar un nombre.",
                            "Error",
                            JOptionPane.ERROR_MESSAGE
                        );
                    }
                } while (cliente.trim().isEmpty());
                InicioCliente.mostrarInicio(cliente, c, r, m, comp,  reloj);
                }
            case 1 -> {
                InicioAdmin.mostrarInicio(c, r, m, comp, reloj);
            }
            case 2 -> {
                int respuesta = JOptionPane.showConfirmDialog(
                    null,
                    "¿Está seguro que desea salir?",
                    "Confirmar salida",
                    JOptionPane.YES_NO_OPTION
                );
                if (respuesta != JOptionPane.YES_OPTION) {
                    Usuario.interfazUsuario(c, r, m, comp, reloj);
                }
                JOptionPane.showMessageDialog(
                    null,
                    "Saliendo del sistema.",
                    "Salir",
                    JOptionPane.INFORMATION_MESSAGE
                );
                System.exit(0);
            }
            default -> System.exit(0);
        }
    }
}



