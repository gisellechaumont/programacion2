public class MainBiblioteca {
    public static void main(String[] args) {

        Biblioteca biblioteca = new Biblioteca();

        Autor a1 = new Autor(1, "Gabriel García Márquez", "Colombia");
        Autor a2 = new Autor(2, "J.K. Rowling", "Reino Unido");
        Autor a3 = new Autor(3, "Julio Cortázar", "Argentina");

        biblioteca.agregarAutor(a1);
        biblioteca.agregarAutor(a2);
        biblioteca.agregarAutor(a3);

        biblioteca.agregarLibro(new Libro("111", "Cien años de soledad", 1967, a1));
        biblioteca.agregarLibro(new Libro("222", "Harry Potter y la piedra filosofal", 1997, a2));
        biblioteca.agregarLibro(new Libro("333", "Rayuela", 1963, a3));
        biblioteca.agregarLibro(new Libro("444", "La hojarasca", 1955, a1));
        biblioteca.agregarLibro(new Libro("555", "Harry Potter y la cámara secreta", 1998, a2));

        System.out.println("=== Listar libros ===");
        biblioteca.listarLibros();

        System.out.println("\n=== Buscar por ISBN 333 ===");
        System.out.println(biblioteca.buscarPorISBN("333"));

        System.out.println("\n=== Filtrar por año 1997 ===");
        biblioteca.filtrarPorAnio(1997);

        System.out.println("\n=== Total de libros ===");
        System.out.println(biblioteca.totalLibros());

        System.out.println("\n=== Eliminar ISBN 444 ===");
        biblioteca.eliminarLibro("444");
        biblioteca.listarLibros();

        System.out.println("\n=== Listar autores ===");
        biblioteca.listarAutores();
    }
}
