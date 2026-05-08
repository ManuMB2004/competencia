package modelo;

import java.util.ArrayList;

public class Cliente extends Usuario {
    private Carrito carrito;
    private ArrayList<Pedido> historialPedidos;

    public Cliente(String id, String nombre, String email, String password) {
        super(id, nombre, email, password);
        this.carrito = new Carrito();
        this.historialPedidos = new ArrayList<>();
    }

    @Override
    public String getTipoUsuario() {
        return "Cliente";
    }

    public Carrito getCarrito() { return carrito; }
    public ArrayList<Pedido> getHistorialPedidos() { return historialPedidos; }

    public void agregarPedido(Pedido pedido) {
        historialPedidos.add(pedido);
    }
}