package Interfazes;

import Logica_Negocio.GestorPedidos;
import javax.swing.*;

public class VerPedidos {
    public static void mostrarPedidos() {
        String pedidos = GestorPedidos.obtenerPedidos();
        JOptionPane.showMessageDialog(
            null, 
            pedidos, 
            "Pedidos", 
            JOptionPane.INFORMATION_MESSAGE
        );
    }
}
