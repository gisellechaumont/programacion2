public class MainUniversidad {
    public static void main(String[] args) {

        Universidad uni = new Universidad("Universidad Nacional");

        Profesor p1 = new Profesor("P1", "Ana Torres", "Matemática");
        Profesor p2 = new Profesor("P2", "Luis Gómez", "Programación");
        Profesor p3 = new Profesor("P3", "María Ruiz", "Física");

        uni.agregarProfesor(p1);
        uni.agregarProfesor(p2);
        uni.agregarProfesor(p3);

        Curso c1 = new Curso("C101", "Álgebra");
        Curso c2 = new Curso("C102", "Cálculo");
        Curso c3 = new Curso("C201", "Programación I");
        Curso c4 = new Curso("C202", "Programación II");
        Curso c5 = new Curso("C301", "Electromagnetismo");

        uni.agregarCurso(c1);
        uni.agregarCurso(c2);
        uni.agregarCurso(c3);
        uni.agregarCurso(c4);
        uni.agregarCurso(c5);

        System.out.println("=== Asignar profesores ===");
        uni.asignarProfesorACurso("C101", "P1");
        uni.asignarProfesorACurso("C102", "P1");
        uni.asignarProfesorACurso("C201", "P2");
        uni.asignarProfesorACurso("C202", "P2");
        uni.asignarProfesorACurso("C301", "P3");

        System.out.println("\n=== Listar cursos ===");
        uni.listarCursos();

        System.out.println("\n=== Listar profesores ===");
        uni.listarProfesores();

        System.out.println("\n=== Cambiar profesor de un curso ===");
        uni.asignarProfesorACurso("C101", "P3");

        uni.listarCursos();
        p1.listarCursos();
        p3.listarCursos();

        System.out.println("\n=== Eliminar curso C202 ===");
        uni.eliminarCurso("C202");
        p2.listarCursos();

        System.out.println("\n=== Eliminar profesor P1 ===");
        uni.eliminarProfesor("P1");
        uni.listarCursos();

        System.out.println("\n=== Reporte: Cursos por profesor ===");
        for (Profesor p : new Profesor[]{p2, p3}) {
            System.out.println(p.getNombre() + ": " + p.getCursos().size() + " cursos");
        }
    }
}
