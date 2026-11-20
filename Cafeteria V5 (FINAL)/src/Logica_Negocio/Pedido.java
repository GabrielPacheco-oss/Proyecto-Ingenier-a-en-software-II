package Logica_Negocio;

import Logica_Negocio.Estaciones.Observador;
import Logica_Negocio.Estados.*;
import Productos.ACOMPANAMIENTOS.*;
import Productos.BEBIDAS.*;
import Productos.POSTRES.*;
import java.util.ArrayList;

public class Pedido extends Observado {
    private static int contador = 0;
    private final String cliente;
    private final int id;
    private double precio;
    private EstadosPedido estado;
    private final ArrayList<Bebida> bebidas;
    private final ArrayList<Acompanamiento> acoms;
    private final ArrayList<Postre> postres;
    private ArrayList<Observador> observadores = new ArrayList<>();

    public Pedido(Builder b){
        this.contador = contador + 1;
        this.id = contador;
        this.cliente = b.cliente;
        this.precio = CalcularPrecio.calcularPrecio(b);
        this.estado = b.estado;
        this.bebidas = b.bebidas;
        this.acoms = b.acoms;
        this.postres = b.postres;
        }

    public static class Builder {
        private String cliente;
        private EstadosPedido estado = new Recibido();
        protected ArrayList<Bebida> bebidas = new ArrayList<>();
        protected ArrayList<Acompanamiento> acoms = new ArrayList<>();
        protected ArrayList<Postre> postres = new ArrayList<>();
        protected ArrayList<Observador> observadores = new ArrayList<>();

        public Builder(String cliente) {
            this.cliente = cliente;
            this.observadores = new ArrayList<>();
        }
        
        public Builder bebida(Bebida bebida) {this.bebidas.add(bebida); return this;}
        public Builder acompanamiento(Acompanamiento acom) {this.acoms.add(acom); return this;}
        public Builder postre(Postre postre) {this.postres.add(postre); return this;}

        public Pedido build() {return new Pedido(this);}
    }
    public String getCliente() {
        return this.cliente;
    }
    public int getId() {
        return this.id;
    }
    public EstadosPedido getEstado() {
        return this.estado;
    }
    public String getEstadoTexto() {
        return this.estado.getNombreEstado();
    }
    public void setEstado(EstadosPedido estado) {
        this.estado = estado;
    }
    public double getPrecio() {
        return this.precio;
    }
    public double setPrecio(double precio) {
        return this.precio = precio;
    }
    public static void contador0(int c) {
        contador = c;
    }
    @Override
    public void agregarObservador(Observador o) {
        this.observadores.add(o);
    }
    @Override
    public void eliminarObservador(Observador o) {
        this.observadores.remove(o);
    }
}

