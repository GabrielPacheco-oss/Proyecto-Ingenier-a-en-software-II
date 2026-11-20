package Productos.COMBOS;

import Logica_Negocio.Pedido;

abstract public class Combo {
    private String nombre;
    private double precio;

    public Combo(String nombre, double precio) {
        this.precio = precio;
        this.nombre = nombre;
    }
    abstract public Pedido crearCombo(String nombre, int cantidad);    
    public String getNombre(){
        return nombre;
    }
    public double getPrecio(int cantidad){
        return precio * cantidad;
    }
}
