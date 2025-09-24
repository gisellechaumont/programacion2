public class Empleado {

    // Atributos privados --> encapsulamiento
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    private static int totalEmpleados = 0;
    private static int contadorId = 1; // genera ids automaticos

    // Constructor sobrecargado completo
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // incrementar empleados
    }

    // Constructor sobrecargado (solo nombre y puesto, id automático y salario por defecto)
    public Empleado(String nombre, String puesto) {
        this.id = contadorId++;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 50000; // salario por defecto
        totalEmpleados++; // incrementar empleados
    }

    // Métodos actualizarSalario
    public void actualizarSalario(double porcentaje) {
        this.salario += this.salario * (porcentaje / 100);
    }

    public void actualizarSalario(int aumentoFijo) {
        this.salario += aumentoFijo;
    }

    // Método estático para mostrar total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) { 
        this.id = id; 
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) { 
        this.nombre = nombre; 
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) { 
        this.puesto = puesto; 
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) { 
        this.salario = salario; 
    }

    // toString personalizado para mostrar mejor la información
    @Override
    public String toString() {
        return "Empleado{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", puesto='" + puesto + '\'' +
                ", salario=" + salario +
                '}';
    }
}
