// Clase Foto (composición con Pasaporte)
public class Foto {
    private String imagen;
    private String formato;

    public Foto(String imagen, String formato) {
        this.imagen = imagen;
        this.formato = formato;
    }

    public String getImagen() {
        return imagen;
    }

    public String getFormato() {
        return formato;
    }

    @Override
    public String toString() {
        return "Foto [imagen=" + imagen + ", formato=" + formato + "]";
    }
}

// Clase Titular (asociación bidireccional con Pasaporte)
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; // referencia bidireccional

    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }

    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    @Override
    public String toString() {
        return "Titular [nombre=" + nombre + ", dni=" + dni + "]";
    }
}

// Clase Pasaporte
public class Pasaporte {
    private String numero;
    private String fechaEmision;
    private Foto foto;          // composición
    private Titular titular;    // asociación bidireccional

    public Pasaporte(String numero, String fechaEmision, Foto foto, Titular titular) {
        this.numero = numero;
        this.fechaEmision = fechaEmision;
        this.foto = foto;
        this.titular = titular;
        // Mantener asociación bidireccional
        this.titular.setPasaporte(this);
    }

    public String getNumero() {
        return numero;
    }

    public String getFechaEmision() {
        return fechaEmision;
    }

    public Foto getFoto() {
        return foto;
    }

    public Titular getTitular() {
        return titular;
    }

    @Override
    public String toString() {
        return "Pasaporte [numero=" + numero + ", fechaEmision=" + fechaEmision + 
               ", foto=" + foto + ", titular=" + titular + "]";
    }
}

// Clase principal para probar
public class Main {
    public static void main(String[] args) {
        Foto foto = new Foto("foto.jpg", "JPEG");
        Titular titular = new Titular("Giselle", "39241016");
        Pasaporte pasaporte = new Pasaporte("A1234567", "2025-09-26", foto, titular);

        System.out.println(pasaporte);
    }
}
