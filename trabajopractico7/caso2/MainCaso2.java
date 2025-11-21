public class MainCaso2 {
    public static void main(String[] args) {
        Figura[] figuras = new Figura[] {
                new Circulo(3),
                new Rectangulo(4, 5)
        };

        for (Figura f : figuras) {
            System.out.println(f.nombre + " - Área: " + f.calcularArea());
        }
    }
}
