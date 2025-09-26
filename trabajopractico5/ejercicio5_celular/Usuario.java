public class Usuario {
    private String nombre;
    private String dni;
    private Celular celular; // Asociación bidireccional

    public Usuario(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }

    public String getNombre() { return nombre; }
    public String getDni() { return dni; }
    public Celular getCelular() { return celular; }
    public void setCelular(Celular celular) { this.celular = celular; }

    @Override
    public String toString() {
        return "Usuario[nombre=" + nombre + ", dni=" + dni + "]";
    }
}
