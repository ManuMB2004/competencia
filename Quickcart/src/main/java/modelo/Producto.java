package modelo;

public abstract class Producto {
    private String id;
    private String nombre;
    private String descripcion;
    private double precio;
    private int stock;

    public Producto(String id, String nombre, String descripcion, double precio, int stock) {
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.stock = stock;
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getDescripcion() { return descripcion; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    
    
    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    public abstract String getTipoProducto();

    @Override
    public String toString() {
        return getTipoProducto() + " | " + nombre + " | $" + precio + " | Stock: " + stock;
    }
}