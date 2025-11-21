public class Producto {
    private int id;
    private String nombre;
    private double precio;
    private int stock;
    private CategoriaProducto categoria;

    public Producto(int id, String nombre, double precio, int stock, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.categoria = categoria;
    }

    public int getId() { return id; }
    public String getNombre() { return nombre; }
    public double getPrecio() { return precio; }
    public int getStock() { return stock; }
    public CategoriaProducto getCategoria() { return categoria; }

    public void setPrecio(double precio) { this.precio = precio; }
    public void setStock(int stock) { this.stock = stock; }
    public void setCategoria(CategoriaProducto categoria) { this.categoria = categoria; }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", stock=" + stock +
                ", categoria=" + categoria +
                '}';
    }
}
