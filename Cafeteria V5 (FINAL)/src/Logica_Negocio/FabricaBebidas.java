package Logica_Negocio;

import Productos.BEBIDAS.*;

public class FabricaBebidas {
    public static Bebida crear(String nombre,String tamaño,int cantidad) {
        switch (nombre) {
            case "Cafe": return new Cafe(tamaño, cantidad);
            case "Capuchino": return new Capuchino(tamaño, cantidad);
            case "Chocolate": return new Chocolate(tamaño, cantidad);
            case "Gaseosa": return new Gaseosa(tamaño, cantidad);
            case "Jugo": return new Jugo(tamaño, cantidad);
            case "Leche": return new Leche(tamaño, cantidad);
            case "Tee": return new Tee(tamaño, cantidad);
            case "Tinto": return new Tinto(tamaño, cantidad);
        }
        return null;
    }
}
