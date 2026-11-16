package Logica_Negocio;

import Productos.BEBIDAS.*;
import Productos.ACOMPAÑAMIENTOS.*;
import Productos.POSTRES.*;

public class FabricaCombos {
    public static Pedido crearCombo(String tipo, int cantidad) {
        if ("Combo 1".equals(tipo)) {
            Pedido p = new Pedido.Builder("juan", cantidad)
            .bebida(new Tinto("PEQUEÑO",1*cantidad))
            .acompañamiento(new Almojabana(1*cantidad))
            .acompañamiento(new Queso(1*cantidad))
            .build();
            return p;
        }else if ("Combo 2".equals(tipo)) {
            Pedido p = new Pedido.Builder("juan", cantidad)
            .bebida(new Chocolate("GRANDE",1*cantidad))
            .bebida(new Jugo("PEQUEÑO", 1*cantidad))
            .acompañamiento(new Huevo(2*cantidad))
            .acompañamiento(new PanFrances(2*cantidad))
            .postre(new ArrozConLeche(1*cantidad))
            .build();
            return p;
        }else if ("Combo 3".equals(tipo)) {
            Pedido p = new Pedido.Builder("juan", cantidad)
            .bebida(new Capuchino("MEDIANO",1*cantidad))
            .postre(new Brownie(1*cantidad))
            .postre(new Helado(1*cantidad))
            .build();
            return p;
        }else if ("Combo 4".equals(tipo)) {
            Pedido p = new Pedido.Builder("juan", cantidad)
            .bebida(new Jugo("GRANDE",1*cantidad))
            .acompañamiento(new PastelDePollo(1*cantidad))
            .acompañamiento(new Ojaldre(1*cantidad))
            .build();
            return p;
        }else if ("Combo 5".equals(tipo)) {
            Pedido p = new Pedido.Builder("juan", cantidad)
            .bebida(new Cafe("MEDIANO",1*cantidad))
            .bebida(new Tee("MEDIANO", 1*cantidad))
            .acompañamiento(new Galleta(3*cantidad))
            .acompañamiento(new Pan(1*cantidad))
            .postre(new Helado(2*cantidad))
            .build();
            return p;
        }else if ("Combo 6".equals(tipo)) {
            Pedido p = new Pedido.Builder("juan", cantidad)
            .bebida(new Gaseosa("MEDIANO",2*cantidad))
            .acompañamiento(new Sandwich(1*cantidad))
            .acompañamiento(new PastelDeCarne(1*cantidad))
            .postre(new Paleta(1*cantidad))
            .postre(new Tarta(1*cantidad))
            .build();
            return p;
        } else if ("Combo 7".equals(tipo)) {
            Pedido p = new Pedido.Builder("juan", cantidad)
            .bebida(new Leche("MEDIANO",1*cantidad))
            .bebida(new Cafe("PEQUEÑO", 1*cantidad))
            .acompañamiento(new Pan(1*cantidad))
            .acompañamiento(new Queso(1*cantidad))
            .build();
            return p;
        }else if ("Combo 8".equals(tipo)) {
            Pedido p = new Pedido.Builder("juan", cantidad)
            .bebida(new Cafe("MEDIANO",1*cantidad))
            .acompañamiento(new Arepa(1*cantidad))
            .acompañamiento(new Ojaldre(1*cantidad))
            .postre(new Tarta(1*cantidad))
            .build();
            return p;
        }
        return null;
    }
}
