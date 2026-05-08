package datos;

import modelo.*;
import java.io.*;
import java.util.ArrayList;

public class GestorProductos {

    private static final String ARCHIVO = "productos.txt";

    public static void guardar(ArrayList<Producto> productos) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(ARCHIVO))) {
            for (Producto p : productos) {
                pw.println(p.getTipoProducto() + "," + p.getId() + "," + p.getNombre() + "," + p.getDescripcion() + "," + p.getPrecio() + "," + p.getStock());
            }
        } catch (IOException e) {
            System.out.println("Error al guardar productos: " + e.getMessage());
        }
    }

    public static ArrayList<Producto> cargar() {
        ArrayList<Producto> productos = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(ARCHIVO))) {
            String linea;
            while ((linea = br.readLine()) != null) {
                String[] datos = linea.split(",");
                if (datos[0].equals("Digital")) {
                    productos.add(new ProductoDigital(datos[1], datos[2], datos[3], Double.parseDouble(datos[4]), Integer.parseInt(datos[5]), "", ""));
                } else {
                    productos.add(new ProductoFisico(datos[1], datos[2], datos[3], Double.parseDouble(datos[4]), Integer.parseInt(datos[5]), 0.0, ""));
                }
            }
        } catch (IOException e) {
            System.out.println("Error al cargar productos: " + e.getMessage());
        }
        return productos;
    }
}