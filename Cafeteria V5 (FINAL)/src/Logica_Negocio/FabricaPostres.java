package Logica_Negocio;

import Productos.POSTRES.*;

public class FabricaPostres {
    public static Postre crear(String nombre ,int cantidad) {
        switch (nombre) {
            case "Arroz con Leche": return new ArrozConLeche(cantidad);
            case "Brownie": return new Brownie(cantidad);
            case "Helado": return new Helado(cantidad);
            case "Paleta": return new Paleta(cantidad);
            case "Tarta": return new Tarta(cantidad);
        }
        return null;
    }
}
