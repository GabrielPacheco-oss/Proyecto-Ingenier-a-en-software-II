package Productos.POSTRES;

abstract public class Postre {
    private String nombre;
    private double precio;
    private int cantidad;

    public Postre(String nombre, double precio, int cantidad) {
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public String getNombre() {
        return nombre;
    }
    public double getPrecio() {
        return precio;
    }
    public int getCantidad() {
        return cantidad;
    }
}
