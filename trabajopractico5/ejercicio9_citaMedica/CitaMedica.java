public class CitaMedica {
    private String fecha;
    private String hora;
    private Paciente paciente;         // asociación unidireccional
    private Profesional profesional;   // asociación unidireccional

    public CitaMedica(String fecha, String hora, Paciente paciente, Profesional profesional) {
        this.fecha = fecha;
        this.hora = hora;
        this.paciente = paciente;
        this.profesional = profesional;
    }

    public String getFecha() {
        return fecha;
    }

    public String getHora() {
        return hora;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Profesional getProfesional() {
        return profesional;
    }

    @Override
    public String toString() {
        return "CitaMedica [fecha=" + fecha + ", hora=" + hora + 
               ", paciente=" + paciente + ", profesional=" + profesional + "]";
    }
}
