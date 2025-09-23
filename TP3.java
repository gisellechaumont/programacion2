public class TP3 {

    // 1. Registro de Estudiantes
    static class Estudiante {
        String nombre;
        String apellido;
        String curso;
        double calificacion;

        public Estudiante(String nombre, String apellido, String curso, double calificacion) {
            this.nombre = nombre;
            this.apellido = apellido;
            this.curso = curso;
            this.calificacion = calificacion;
        }

        public void mostrarInfo() {
            System.out.println("Estudiante: " + nombre + " " + apellido +
                    ", Curso: " + curso + ", Calificación: " + calificacion);
        }

        public void subirCalificacion(double puntos) {
            calificacion += puntos;
        }

        public void bajarCalificacion(double puntos) {
            calificacion -= puntos;
        }
    }

    // 2. Registro de Mascotas
    static class Mascota {
        String nombre;
        String especie;
        int edad;

        public Mascota(String nombre, String especie, int edad) {
            this.nombre = nombre;
            this.especie = especie;
            this.edad = edad;
        }

        public void mostrarInfo() {
            System.out.println("Mascota: " + nombre + ", Especie: " + especie + ", Edad: " + edad + " años");
        }

        public void cumplirAnios() {
            edad++;
        }
    }

    // 3. Encapsulamiento con la Clase Libro
    static class Libro {
        private String titulo;
        private String autor;
        private int anioPublicacion;

        public Libro(String titulo, String autor, int anioPublicacion) {
            this.titulo = titulo;
            this.autor = autor;
            setAnioPublicacion(anioPublicacion); // uso el setter con validación
        }

        // Getters
        public String getTitulo() {
            return titulo;
        }

        public String getAutor() {
            return autor;
        }

        public int getAnioPublicacion() {
            return anioPublicacion;
        }

        // Setter con validación
        public void setAnioPublicacion(int anio) {
            if (anio > 0 && anio <= 2025) {
                this.anioPublicacion = anio;
            } else {
                System.out.println("⚠ Año inválido: " + anio);
            }
        }

        public void mostrarInfo() {
            System.out.println("Libro: \"" + titulo + "\" de " + autor + " (" + anioPublicacion + ")");
        }
    }

    // 4. Gestión de Gallinas en Granja Digital
    static class Gallina {
        int idGallina;
        int edad;
        int huevosPuestos;

        public Gallina(int idGallina, int edad) {
            this.idGallina = idGallina;
            this.edad = edad;
            this.huevosPuestos = 0;
        }

        public void ponerHuevo() {
            huevosPuestos++;
        }

        public void envejecer() {
            edad++;
        }

        public void mostrarEstado() {
            System.out.println("Gallina #" + idGallina + " | Edad: " + edad + " | Huevos puestos: " + huevosPuestos);
        }
    }

    // 5. Simulación de Nave Espacial
    static class NaveEspacial {
        String nombre;
        int combustible;
        final int MAX_COMBUSTIBLE = 100;

        public NaveEspacial(String nombre, int combustible) {
            this.nombre = nombre;
            this.combustible = combustible;
        }

        public void despegar() {
            if (combustible >= 10) {
                combustible -= 10;
                System.out.println(nombre + " ha despegado 🚀");
            } else {
                System.out.println(nombre + " no tiene suficiente combustible para despegar.");
            }
        }

        public void avanzar(int distancia) {
            int consumo = distancia * 2; // ejemplo: cada unidad de distancia gasta 2 de combustible
            if (combustible >= consumo) {
                combustible -= consumo;
                System.out.println(nombre + " avanzó " + distancia + " unidades.");
            } else {
                System.out.println("⚠ No hay suficiente combustible para avanzar " + distancia + " unidades.");
            }
        }

        public void recargarCombustible(int cantidad) {
            if (combustible + cantidad <= MAX_COMBUSTIBLE) {
                combustible += cantidad;
                System.out.println(nombre + " recargó " + cantidad + " de combustible.");
            } else {
                combustible = MAX_COMBUSTIBLE;
                System.out.println(nombre + " está con el tanque lleno (máximo " + MAX_COMBUSTIBLE + ").");
            }
        }

        public void mostrarEstado() {
            System.out.println("Nave: " + nombre + " | Combustible: " + combustible + "/" + MAX_COMBUSTIBLE);
        }
    }

    // Main para probar todos los ejercicios
    public static void main(String[] args) {
        // 1. Estudiante
        Estudiante e1 = new Estudiante("Ana", "López", "Programación", 7.5);
        e1.mostrarInfo();
        e1.subirCalificacion(1.5);
        e1.bajarCalificacion(0.5);
        e1.mostrarInfo();

        System.out.println("\n---");

        // 2. Mascota
        Mascota m1 = new Mascota("Firulais", "Perro", 3);
        m1.mostrarInfo();
        m1.cumplirAnios();
        m1.mostrarInfo();

        System.out.println("\n---");

        // 3. Libro
        Libro l1 = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 1967);
        l1.mostrarInfo();
        l1.setAnioPublicacion(3000); // inválido
        l1.setAnioPublicacion(1985); // válido
        l1.mostrarInfo();

        System.out.println("\n---");

        // 4. Gallinas
        Gallina g1 = new Gallina(1, 2);
        Gallina g2 = new Gallina(2, 1);
        g1.ponerHuevo();
        g1.envejecer();
        g2.ponerHuevo();
        g2.ponerHuevo();
        g1.mostrarEstado();
        g2.mostrarEstado();

        System.out.println("\n---");

        // 5. Nave Espacial
        NaveEspacial nave = new NaveEspacial("Apollo", 50);
        nave.mostrarEstado();
        nave.avanzar(10); // sin recargar, debería fallar
        nave.recargarCombustible(40);
        nave.despegar();
        nave.avanzar(15);
        nave.mostrarEstado();
    }
}
