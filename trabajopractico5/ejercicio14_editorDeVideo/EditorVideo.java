public class EditorVideo {
    // Dependencia de creación: genera un Render dentro del método exportar
    public void exportar(String formato, Proyecto proyecto) {
        Render render = new Render(formato, proyecto);
        System.out.println("Exportando proyecto: " + proyecto.getNombre() +
                " en formato: " + formato);
    }
}
