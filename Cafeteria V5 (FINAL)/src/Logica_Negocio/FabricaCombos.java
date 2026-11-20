package Logica_Negocio;

import Productos.COMBOS.*;

public class FabricaCombos {
    public static Pedido crearCombo(Combo c,String cliente, int cantidad) {
        return c.crearCombo(cliente, cantidad);
    }
}
