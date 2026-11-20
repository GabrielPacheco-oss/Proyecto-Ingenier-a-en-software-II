package Productos.ACOMPANAMIENTOS;

abstract public class Acompanamiento {
    private String nombre;
    private double precio;
    private int cantidad;

    public Acompanamiento(String nombre, double precio, int cantidad) {
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
    public void sumarCantidad(int cantidad) {
        this.cantidad += cantidad;
    }
}
