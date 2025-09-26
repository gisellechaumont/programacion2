public class TarjetaDeCredito {
    private String numero;
    private String fechaVencimiento;
    private Cliente cliente; // Asociación bidireccional
    private Banco banco;     // Agregación

    public TarjetaDeCredito(String numero, String fechaVencimiento, Cliente cliente, Banco banco) {
        this.numero = numero;
        this.fechaVencimiento = fechaVencimiento;
        this.banco = banco;
        this.setCliente(cliente); // Mantener relación bidireccional
    }

    // Getters y setters
    public String getNumero() { return numero; }
    public String getFechaVencimiento() { return fechaVencimiento; }
    public Cliente getCliente() { return cliente; }
    public Banco getBanco() { return banco; }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
        if (cliente.getTarjeta() != this) {
            cliente.setTarjeta(this);
        }
    }

    public void setBanco(Banco banco) { this.banco = banco; }

    @Override
    public String toString() {
        return "TarjetaDeCredito[numero=" + numero + ", fechaVencimiento=" + fechaVencimiento + 
               ", cliente=" + cliente + ", banco=" + banco + "]";
    }
}
