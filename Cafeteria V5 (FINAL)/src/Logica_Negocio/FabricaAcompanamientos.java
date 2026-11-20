package Logica_Negocio;

import Productos.ACOMPANAMIENTOS.*;

public class FabricaAcompanamientos {
    public static Acompanamiento crear(String nombre ,int cantidad) {
        switch (nombre) {
            case "Almojabana": return new Almojabana(cantidad);
            case "Galleta": return new Galleta(cantidad);
            case "Huevo": return new Huevo(cantidad);
            case "Ojaldre": return new Ojaldre(cantidad);
            case "Pan": return new Pan(cantidad);
            case "Pan Frances": return new PanFrances(cantidad);
            case "Pastel de Carne": return new PastelDeCarne(cantidad);
            case "Pastel de Pollo": return new PastelDePollo(cantidad);
            case "Queso": return new Queso(cantidad);
        }
        return null;
    }
}
