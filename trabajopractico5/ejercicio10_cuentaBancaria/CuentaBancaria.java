public class CuentaBancaria {
    private String cbu;
    private double saldo;
    private ClaveSeguridad clave; // Composición
    private Titular titular;       // Asociación

    public CuentaBancaria(String cbu, double saldo, ClaveSeguridad clave, Titular titular) {
        this.cbu = cbu;
        this.saldo = saldo;
        this.clave = clave;
        this.titular = titular;
    }

    // Getters y setters
    public String getCbu() {
        return cbu;
    }
    public double getSaldo() {
        return saldo;
    }

    public ClaveSeguridad getClave() {
        return clave;
    }

    public Titular getTitular() {
        return titular;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setClave(ClaveSeguridad clave) {
        this.clave = clave;
    }

    public void setTitular(Titular titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "CuentaBancaria {" +
               "cbu='" + cbu + '\'' +
               ", saldo=" + saldo +
               ", clave=" + clave + 
               ", titular=" + titular + 
               '}';
    }
}
