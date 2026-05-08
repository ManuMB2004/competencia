package modelo;

public class ProductoFisico extends Producto {
    private double peso;
    private String dimensiones;

    public ProductoFisico(String id, String nombre, String descripcion, double precio, int stock, double peso, String dimensiones) {
        super(id, nombre, descripcion, precio, stock);
        this.peso = peso;
        this.dimensiones = dimensiones;
    }

    public double getPeso() { return peso; }
    public String getDimensiones() { return dimensiones; }
    public void setPeso(double peso) { this.peso = peso; }
    public void setDimensiones(String dimensiones) { this.dimensiones = dimensiones; }

    @Override
    public String getTipoProducto() {
        return "Fisico";
    }
}