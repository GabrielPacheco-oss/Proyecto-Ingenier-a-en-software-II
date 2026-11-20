package Interfazes;

import Logica_Negocio.Estaciones.Cocina;
import Logica_Negocio.Estaciones.Completos;
import Logica_Negocio.Estaciones.Mesero;
import Logica_Negocio.Estaciones.Recepcion;
import Logica_Negocio.Reloj;
import javax.swing.JOptionPane;

public class InicioCliente {
    public static void mostrarInicio(String cliente,Cocina c, Recepcion r, Mesero m, Completos comp,  Reloj reloj) {
        while (reloj.getCierre() != 8) {
            String[] opciones = {
                "Combos",
                "Pedido personalizado",
                "Ver pedidos",
                "Ver descuentos",
                "Pasar 15 minutos",
                "Salir"
            };

            int opcion = JOptionPane.showOptionDialog(
                null,
                "¿Qué deseas hacer?",
                "Cafetería - " + reloj.getHora(),
                JOptionPane.DEFAULT_OPTION,
                JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );
            switch (opcion) {
                case 0: ListaCombos.mostrarListaCombos(cliente, c, r, m, comp, reloj);break;
                case 1: CrearPedido.mostrarFormulario(cliente, reloj); break;
                case 2: VerPedidos.mostrarPedidos(); break;
                case 3: VerDescuentos.mostrarDescuentos(); break;
                case 4: reloj.notificar(); break;
                case 5: Usuario.interfazUsuario(c, r, m, comp, reloj); break;
            }
        }
        JOptionPane.showMessageDialog(
            null,
            "El cafe ha cerrado, vuelva mañana.",
            "Buenas noches",
            JOptionPane.ERROR_MESSAGE
        );
        Usuario.interfazUsuario(c, r, m, comp, reloj);
    }
}
