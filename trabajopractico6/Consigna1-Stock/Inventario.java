import java.util.ArrayList;

public class Inventario {
    private ArrayList<Producto> productos = new ArrayList<>();

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public void listarProductos() {
        for (Producto p : productos) {
            System.out.println(p);
        }
    }

    public Producto buscarPorId(int id) {
        for (Producto p : productos) {
            if (p.getId() == id) return p;
        }
        return null;
    }

    public void eliminarProducto(int id) {
        productos.removeIf(p -> p.getId() == id);
    }

    public boolean actualizarStock(int id, int nuevoStock) {
        Producto p = buscarPorId(id);
        if (p != null) {
            p.setStock(nuevoStock);
            return true;
        }
        return false;
    }

    public void filtrarPorCategoria(CategoriaProducto cat) {
        for (Producto p : productos) {
            if (p.getCategoria() == cat) System.out.println(p);
        }
    }

    public void filtrarPorRangoDePrecio(double min, double max) {
        for (Producto p : productos) {
            if (p.getPrecio() >= min && p.getPrecio() <= max)
                System.out.println(p);
        }
    }

    public int totalStock() {
        int total = 0;
        for (Producto p : productos) total += p.getStock();
        return total;
    }

    public Producto productoConMasStock() {
        if (productos.isEmpty()) return null;

        Producto mayor = productos.get(0);
        for (Producto p : productos) {
            if (p.getStock() > mayor.getStock()) mayor = p;
        }
        return mayor;
    }

    public void mostrarCategorias() {
        for (CategoriaProducto c : CategoriaProducto.values()) {
            System.out.println(c + " - " + c.descripcion());
        }
    }
}
