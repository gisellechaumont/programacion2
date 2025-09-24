public class Main {
    public static void main(String[] args) {

        // Crear empleados con distintos constructores
        Empleado empleado1 = new Empleado(101, "Ana López", "Gerente", 120000);
        Empleado empleado2 = new Empleado("Carlos Pérez", "Desarrollador");
        Empleado empleado3 = new Empleado("María Gómez", "Diseñadora");

        // Aplicar aumentos de salario
        e1.actualizarSalario(10); // aumento del 10%
        e2.actualizarSalario(5000); // aumento fijo de $5000
        e3.actualizarSalario(15); // aumento del 15%

        // Mostrar información de cada empleado
        System.out.println(empleado1.toString());
        System.out.println(empleado2.toString());
        System.out.println(empleado3.toString());

        // Mostrar total de empleados creados
        System.out.println("Total de empleados: " + Empleado.mostrarTotalEmpleados());
    }
}
