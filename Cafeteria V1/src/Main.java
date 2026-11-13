import Productos.ACOMPAÑAMIENTOS.*;
import Productos.BEBIDAS.*;
import Productos.POSTRES.*;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.println("====================================");
        System.out.println("======= BUEN CAFE, GRAN CAFE =======");
        System.out.println("====================================");

        Helado helado = new Helado(2);
        Browni browni = new Browni(1);
        Trata trata = new Trata(3);
        Paleta paleta = new Paleta(4);

        Tinto tinto = new Tinto("pequeño", 2);
        Cafe cafe = new Cafe("grande",1);

        Pan pan = new Pan(2);
        Galleta galleta = new Galleta(3);

        System.out.println("Helado: " + helado.getNombre());
        System.out.println("Browni: " + browni.getNombre());
        System.out.println("Trata: " + trata.getNombre());
        System.out.println("Paleta: " + paleta.getNombre());
        System.out.println("Tinto: " + tinto.getNombre());
        System.out.println("Cafe: " + cafe.getNombre());
        System.out.println("Pan: " + pan.getNombre());
        System.out.println("Galleta: " + galleta.getNombre());
    }
}