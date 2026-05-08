package datos;

import modelo.*;
import java.io.*;
import java.util.ArrayList;

public class GestorUsuarios {

    private static final String ARCHIVO = "usuarios.txt";

    public static void guardar(ArrayList<Usuario> usuarios) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO))) {
            for (Usuario u : usuarios) {
                pw.println(u.getTipoUsuario() + "," + u.getId() + "," + u.getNombre() + "," + u.getEmail() + "," + u.getPassword());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar usuarios: " + e.getMessage());
        }
    }

    public static ArrayList<Usuario> cargar() {
        ArrayList<Usuario> usuarios = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].equals("Cliente")) {
                    usuarios.add(new Cliente(datos[1], datos[2], datos[3], datos[4]));
                } else {
                    usuarios.add(new Administrador(datos[1], datos[2], datos[3], datos[4]));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar usuarios: " + e.getMessage());
        }
        return usuarios;
    }
}