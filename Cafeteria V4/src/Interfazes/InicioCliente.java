package Interfazes;

import javax.swing.JOptionPane;

public class InicioCliente {
    public static void mostrarInicio(String cliente) {
        do {
            String[] opciones = {
                "Combos",
                "Pedido personalizado",
                "Ver pedidos",
                "Salir"
            };

            int opcion = JOptionPane.showOptionDialog(
                null,
                "¿Qué deseas hacer?",
                "Cafetería",
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );
            switch (opcion) {
                case 0: ListaCombos.mostrarListaCombos(cliente);break;
                case 1: CrearPedido.mostrarFormulario(); break;
                case 2: VerPedidos.mostrarPedidos(); break;
                case 3: Usuario.interfazUsuario(); break;
            }
        } while (true);
    }
}
