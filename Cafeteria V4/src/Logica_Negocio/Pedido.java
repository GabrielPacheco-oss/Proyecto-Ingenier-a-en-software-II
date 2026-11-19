package Logica_Negocio;

import Productos.ACOMPAÑAMIENTOS.*;
import Productos.BEBIDAS.*;
import Productos.POSTRES.*;
import java.util.ArrayList;

public class Pedido {
    private static int contador = 0;
    private final String cliente;
    private final int id;
    private final int cantidad;
    private final double precio;
    private String estado;
    private final ArrayList<Bebida> bebidas;
    private final ArrayList<Acompañamiento> acoms;
    private final ArrayList<Postre> postres;

    public Pedido(Builder b){
        this.contador = contador + 1;
        this.id = contador;
        this.cliente = b.cliente;
        this.cantidad = b.cantidad;
        this.precio = CalcularPrecio.calcularPrecio(b);
        this.estado = b.estado;
        this.bebidas = b.bebidas;
        this.acoms = b.acoms;
        this.postres = b.postres;
    }

    public static class Builder {
        private String cliente;
        private int cantidad;
        private String estado = "Recibido";
        protected ArrayList<Bebida> bebidas = new ArrayList<>();
        protected ArrayList<Acompañamiento> acoms = new ArrayList<>();
        protected ArrayList<Postre> postres = new ArrayList<>();

        public Builder(String cliente, int cantidad) {
            this.cliente = cliente;
            this.cantidad = cantidad;
        }
        
        public Builder bebida(Bebida bebida) {this.bebidas.add(bebida); return this;}
        public Builder acompañamiento(Acompañamiento acom) {this.acoms.add(acom); return this;}
        public Builder postre(Postre postre) {this.postres.add(postre); return this;}

        public Pedido build() {return new Pedido(this);}
    }
    public String getCliente() {
        return this.cliente;
    }
    public int getId() {
        return this.id;
    }
    public String getEstado() {
        return this.estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }
    public double getPrecio() {
        return this.precio;
    }
    public ArrayList<Bebida> getBebidas(){
        return this.bebidas;
    }
    public ArrayList<Acompañamiento> getAcoms(){
        return this.acoms;
    }
    public ArrayList<Postre> getPostres(){
        return this.postres;
    }
}

