package Logica_Negocio;

import Logica_Negocio.Estaciones.*;

public class Reloj {
    private Cocina cocina;
    private Recepcion recepcion;
    private Mesero mesero;
    private Completos completos;
    private static int dias = 1;

    public Reloj(Cocina c, Recepcion r, Mesero m, Completos com) {
        this.cocina = c;
        this.recepcion = r;
        this.mesero = m;
        this.completos = com;
    }
    private static int horas = 4;
    private static int minutos = 0;
    public void notificar(){
        minutos += 15;
        if (minutos == 60) {
            minutos = 0;
            horas++;
        }
        if (horas == 8 && minutos == 0) {
            cocina.cerrar();
            recepcion.cerrar();
            mesero.cerrar();
            return;
        }
        completos.actualizar();
        mesero.actualizar();
        recepcion.actualizar();
        cocina.actualizar();
    }
    public static String getHora() {
        if (minutos < 10) {
            return horas + ":0" + minutos;
        }
        return horas + ":" + minutos;
    }
    public static int getCierre() {
        return horas;
    }
    public static int getDias() {
        return dias;
    }
    public void siguienteDia() {
        horas = 4;
        minutos = 0;
        dias++;
        completos.cerrar();
        Pedido.contador0(0);
    }
}
