public class Calculadora {
    // Dependencia de uso: usa Impuesto como parámetro pero no lo guarda
    public void calcular(Impuesto impuesto) {
        System.out.println("Calculando impuesto para " +
                impuesto.getContribuyente().getNombre() +
                " con monto: $" + impuesto.getMonto());
    }
