package modelo;

import java.util.ArrayList;

public class Pedido {
    private String id;
    private Cliente cliente;
    private ArrayList<Producto> productos;
    private ArrayList<Integer> cantidades;
    private double total;
    private String estado;
    private String metodoPago;
    private String fecha;

    public Pedido(String id, Cliente cliente, ArrayList<Producto> productos, ArrayList<Integer> cantidades, double total, String metodoPago, String fecha) {
        this.id = id;
        this.cliente = cliente;
        this.productos = productos;
        this.cantidades = cantidades;
        this.total = total;
        this.estado = "Pendiente";
        this.metodoPago = metodoPago;
        this.fecha = fecha;
    }

    public String getId() { return id; }
    public Cliente getCliente() { return cliente; }
    public ArrayList<Producto> getProductos() { return productos; }
    public ArrayList<Integer> getCantidades() { return cantidades; }
    public double getTotal() { return total; }
    public String getEstado() { return estado; }
    public String getMetodoPago() { return metodoPago; }
    public String getFecha() { return fecha; }
    public void setEstado(String estado) { this.estado = estado; }

    @Override
    public String toString() {
        return "Pedido #" + id + " | " + fecha + " | $" + total + " | " + estado;
    }
}