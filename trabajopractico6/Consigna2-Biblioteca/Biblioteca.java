import java.util.ArrayList;

public class Biblioteca {
    private ArrayList<Libro> libros = new ArrayList<>();
    private ArrayList<Autor> autores = new ArrayList<>();

    public void agregarAutor(Autor autor) {
        autores.add(autor);
    }

    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }

    public void listarLibros() {
        for (Libro l : libros) {
            System.out.println(l);
        }
    }

    public Libro buscarPorISBN(String isbn) {
        for (Libro l : libros) {
            if (l.getIsbn().equals(isbn)) return l;
        }
        return null;
    }

    public void eliminarLibro(String isbn) {
        libros.removeIf(l -> l.getIsbn().equals(isbn));
    }

    public void filtrarPorAnio(int anio) {
        for (Libro l : libros) {
            if (l.getAnioPublicacion() == anio) System.out.println(l);
        }
    }

    public int totalLibros() {
        return libros.size();
    }

    public void listarAutores() {
        for (Autor a : autores) {
            System.out.println(a);
        }
    }
}
