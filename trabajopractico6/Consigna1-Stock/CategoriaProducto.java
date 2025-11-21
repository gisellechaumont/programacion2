public enum CategoriaProducto {
    ALIMENTOS("Alimentos y bebidas"),
    ELECTRONICA("Electrónica y tecnología"),
    HOGAR("Artículos para el hogar"),
    ROPA("Indumentaria y accesorios"),
    FARMACIA("Productos farmacéuticos");

    private final String descripcion;

    CategoriaProducto(String descripcion) {
        this.descripcion = descripcion;
    }

    public String descripcion() {
        return descripcion;
    }
}
