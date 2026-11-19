package Interfazes;

public class InicioAdmin {
    public static void mostrarInicio() {
        String[] opciones = {
            "Ver pedidos",
            "Salir"
        };

        int opcion = javax.swing.JOptionPane.showOptionDialog(
            null,
            "¿Qué deseas hacer?",
            "Cafetería - Administrador",
            javax.swing.JOptionPane.DEFAULT_OPTION,
            javax.swing.JOptionPane.QUESTION_MESSAGE,
            null,
            opciones,
            opciones[0]
        );

        switch (opcion) {
            case 0: VerPedidos.mostrarPedidos(); break;
            case 1: System.exit(0); break;
        }
    }
}
