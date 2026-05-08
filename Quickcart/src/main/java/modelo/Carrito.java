package modelo;

import java.util.ArrayList;

public class Carrito {
    private ArrayList<Producto> productos;
    private ArrayList<Integer> cantidades;

    public Carrito() {
        this.productos = new ArrayList<>();
        this.cantidades = new ArrayList<>();
    }

    public void agregarProducto(Producto producto, int cantidad) {
        productos.add(producto);
        cantidades.add(cantidad);
    }

    public void eliminarProducto(int indice) {
        productos.remove(indice);
        cantidades.remove(indice);
    }

    public void modificarCantidad(int indice, int cantidad) {
        cantidades.set(indice, cantidad);
    }

    public double calcularTotal() {
        double total = 0;
        for (int i = 0; i < productos.size(); i++) {
            total += productos.get(i).getPrecio() * cantidades.get(i);
        }
        return total;
    }

    public ArrayList<Producto> getProductos() { return productos; }
    public ArrayList<Integer> getCantidades() { return cantidades; }

    public void vaciar() {
        productos.clear();
        cantidades.clear();
    }
}