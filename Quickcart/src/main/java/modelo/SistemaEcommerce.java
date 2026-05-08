package modelo;

import java.util.ArrayList;

public class SistemaEcommerce {
    private ArrayList<Usuario> usuarios;
    private ArrayList<Producto> catalogo;
    private ArrayList<Pedido> pedidos;

    public SistemaEcommerce() {
        this.usuarios = new ArrayList<>();
        this.catalogo = new ArrayList<>();
        this.pedidos = new ArrayList<>();
    }

    public void registrarUsuario(Usuario usuario) {
        usuarios.add(usuario);
    }

    public Usuario iniciarSesion(String email, String password) {
        for (Usuario u : usuarios) {
            if (u.getEmail().equals(email) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    public void agregarProducto(Producto producto) {
        catalogo.add(producto);
    }

    public void eliminarProducto(String idProducto) {
        catalogo.removeIf(p -> p.getId().equals(idProducto));
    }

    public void registrarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    public ArrayList<Usuario> getUsuarios() { return usuarios; }
    public ArrayList<Producto> getCatalogo() { return catalogo; }
    public ArrayList<Pedido> getPedidos() { return pedidos; }
}