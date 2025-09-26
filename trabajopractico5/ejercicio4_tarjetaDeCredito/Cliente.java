import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nombre;
    private String dni;
    private List<TarjetaDeCredito> tarjetas; // Asociación bidireccional

    public Cliente(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
        this.tarjetas = new ArrayList<>();
    }

    // Getters y setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getDni() { return dni; }
    public void setDni(String dni) { this.dni = dni; }

    public List<TarjetaDeCredito> getTarjetas() { return tarjetas; }

    // Método para asociar tarjeta
    public void agregarTarjeta(TarjetaDeCredito tarjeta) {
        tarjetas.add(tarjeta);
        if (tarjeta.getCliente() != this) {
            tarjeta.setCliente(this);
        }
    }
}
