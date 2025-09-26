public class GeneradorQR {
    // Método que crea un CódigoQR sin guardarlo como atributo (dependencia de creación)
    public void generar(String valor, Usuario usuario) {
        CodigoQR qr = new CodigoQR(valor, usuario);
        System.out.println("QR generado para " + usuario.getNombre() + " con valor: " + valor);
    }
