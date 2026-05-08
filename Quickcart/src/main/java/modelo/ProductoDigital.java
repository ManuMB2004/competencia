package modelo;

public class ProductoDigital extends Producto {
    private String urlDescarga;
    private String formato;

    public ProductoDigital(String id, String nombre, String descripcion, double precio, int stock, String urlDescarga, String formato) {
        super(id, nombre, descripcion, precio, stock);
        this.urlDescarga = urlDescarga;
        this.formato = formato;
    }

    public String getUrlDescarga() { return urlDescarga; }
    public String getFormato() { return formato; }
    public void setUrlDescarga(String urlDescarga) { this.urlDescarga = urlDescarga; }
    public void setFormato(String formato) { this.formato = formato; }

    @Override
    public String getTipoProducto() {
        return "Digital";
    }
}