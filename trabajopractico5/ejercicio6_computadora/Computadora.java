public class Computadora {
    private String marca;
    private String numeroSerie;
    private PlacaMadre placa;          // composición
    private Propietario propietario;   // asociación bidireccional

    public Computadora(String marca, String numeroSerie, PlacaMadre placa, Propietario propietario) {
        this.marca = marca;
        this.numeroSerie = numeroSerie;
        this.placa = placa;
        this.propietario = propietario;
        // mantener asociación bidireccional
        this.propietario.setComputadora(this);
    }

    public String getMarca() {
        return marca;
    }

    public String getNumeroSerie() {
        return numeroSerie;
    }

    public PlacaMadre getPlaca() {
        return placa;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
        this.propietario.setComputadora(this); // actualizar referencia bidireccional
    }

    @Override
    public String toString() {
        return "Computadora [marca=" + marca + ", numeroSerie=" + numeroSerie + 
               ", placa=" + placa + ", propietario=" + propietario + "]";
    }
}
