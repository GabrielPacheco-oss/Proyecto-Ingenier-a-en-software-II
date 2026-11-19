package Productos.BEBIDAS;

abstract public class Bebida {
    private String nombre;
    private String tamaño;
    private double precio;
    private int cantidad;

    public Bebida(String nombre, String tamaño, double precio, int cantidad) {
        this.nombre = nombre;
        this.tamaño = tamaño;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    public String getNombre() {
        return nombre;
    }
    public String getTamaño() {
        return tamaño;
    }
    public double getPrecio() {
        return precio;
    }   
    public int getCantidad() {
        return cantidad;
    }
    public void sumarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }
}
