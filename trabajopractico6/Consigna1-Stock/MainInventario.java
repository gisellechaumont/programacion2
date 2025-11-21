public class MainInventario {
    public static void main(String[] args) {

        Inventario inventario = new Inventario();

        inventario.agregarProducto(new Producto(1, "Leche", 1200, 30, CategoriaProducto.ALIMENTOS));
        inventario.agregarProducto(new Producto(2, "Televisor", 350000, 10, CategoriaProducto.ELECTRONICA));
        inventario.agregarProducto(new Producto(3, "Sábanas", 20000, 25, CategoriaProducto.HOGAR));
        inventario.agregarProducto(new Producto(4, "Remera", 15000, 40, CategoriaProducto.ROPA));
        inventario.agregarProducto(new Producto(5, "Ibuprofeno", 3500, 60, CategoriaProducto.FARMACIA));

        System.out.println("=== Lista completa ===");
        inventario.listarProductos();

        System.out.println("\n=== Buscar ID 3 ===");
        System.out.println(inventario.buscarPorId(3));

        System.out.println("\n=== Actualizar stock del ID 4 ===");
        inventario.actualizarStock(4, 100);
        System.out.println(inventario.buscarPorId(4));

        System.out.println("\n=== Filtrar categoría HOGAR ===");
        inventario.filtrarPorCategoria(CategoriaProducto.HOGAR);

        System.out.println("\n=== Producto con más stock ===");
        System.out.println(inventario.productoConMasStock());

        System.out.println("\n=== Total stock ===");
        System.out.println(inventario.totalStock());

        System.out.println("\n=== Mostrar categorías ===");
        inventario.mostrarCategorias();
    }
}
