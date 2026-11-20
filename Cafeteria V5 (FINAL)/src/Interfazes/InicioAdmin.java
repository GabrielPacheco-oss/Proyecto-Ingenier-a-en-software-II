package Interfazes;

import Logica_Negocio.Estaciones.*;
import Logica_Negocio.Reloj;

public class InicioAdmin {
    public static void mostrarInicio(Cocina c, Recepcion r, Mesero m, Completos comp, Reloj reloj) {
        do { 
            String[] opciones = {
                "Ver pedidos",
                "Ver estaciones",
                "Pasar 15 minutos",
                "Ver reporte de ventas",
                "Siguiente dia",
                "Salir"
            };
            int opcion = javax.swing.JOptionPane.showOptionDialog(
                null,
                "¿Qué deseas hacer?",
                "Cafetería - Administrador - " + reloj.getHora(),
                javax.swing.JOptionPane.DEFAULT_OPTION,
                javax.swing.JOptionPane.QUESTION_MESSAGE,
                null,
                opciones,
                opciones[0]
            );
            switch (opcion) {
                case 0: VerPedidos.mostrarPedidos(); break;
                case 1: VerEstaciones.mostrarEstaciones(c, r, m, comp, reloj); break;
                case 2: if(reloj.getCierre() != 8){
                        reloj.notificar(); break;
                    } else {
                        javax.swing.JOptionPane.showMessageDialog(
                            null,
                            "Ya es hora de cierre, no se puede avanzar mas.",
                            "Error",
                            javax.swing.JOptionPane.ERROR_MESSAGE
                        );
                        mostrarInicio(c, r, m, comp, reloj);
                    }
                    return;
                case 3: if(reloj.getCierre() != 8){
                        javax.swing.JOptionPane.showMessageDialog(
                            null,
                            "No se puede ver el reporte antes de la hora de cierre.",
                            "Error",
                            javax.swing.JOptionPane.ERROR_MESSAGE
                        );
                    }else{
                        ReporteVentas.mostrarReporte(); 
                    }
                    break;
                case 4: if(reloj.getCierre() != 8){
                        javax.swing.JOptionPane.showMessageDialog(
                            null,
                            "No se puede pasar al siguiente día antes de la hora de cierre.",
                            "Error",
                            javax.swing.JOptionPane.ERROR_MESSAGE
                        );
                    }else{
                        reloj.siguienteDia();
                        Usuario.interfazUsuario(c, r, m, comp, reloj);
                    }
                break;
                case 5: Usuario.interfazUsuario(c, r, m, comp, reloj); break;
            }
        } while (true);
    }
}
