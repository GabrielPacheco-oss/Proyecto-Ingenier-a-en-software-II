package Logica_Negocio;

import Productos.ACOMPANAMIENTOS.*;
import Productos.BEBIDAS.*;
import Productos.POSTRES.*;
import java.util.ArrayList;

public class PedidoPersonalizado {
    public static Pedido crearPedido(String cliente,ArrayList<Bebida> bebidas,ArrayList<Acompanamiento> acompañamientos, ArrayList<Postre> postres){
        int i = 0;
        Pedido.Builder b = new Pedido.Builder(cliente);
        for (Bebida bebida : bebidas) {
            b.bebida(bebida);
            i++;
        }
        for (Acompanamiento acom : acompañamientos) {
            b.acompanamiento(acom);
            i++;
        }
        for (Postre postre : postres) {
            b.postre(postre);
            i++;
        }
        if (i == 0) {
            return null;
        }
        return b.build();
    }
}
