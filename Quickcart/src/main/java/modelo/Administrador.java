package modelo;

import java.util.ArrayList;

public class Administrador extends Usuario {

    public Administrador(String id, String nombre, String email, String password) {
        super(id, nombre, email, password);
    }

    @Override
    public String getTipoUsuario() {
        return "Administrador";
    }

    public void agregarProducto(ArrayList<Producto> catalogo, Producto p) {
        catalogo.add(p);
    }

    public void eliminarProducto(ArrayList<Producto> catalogo, String idProducto) {
        catalogo.removeIf(p -> p.getId().equals(idProducto));
    }
}