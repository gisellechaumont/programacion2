import java.util.Scanner;

public class TrabajoPractico2 {
    static Scanner sc = new Scanner(System.in);

    // Variable global para el ejercicio 11
    static double DESCUENTO_ESPECIAL = 0.10;

    public static void main(String[] args) {
        int opcion;
        do {
            System.out.println("\n=== TRABAJO PRÁCTICO 2: PROGRAMACIÓN ESTRUCTURADA ===");
            System.out.println("1. Verificación de Año Bisiesto");
            System.out.println("2. Determinar el Mayor de Tres Números");
            System.out.println("3. Clasificación de Edad");
            System.out.println("4. Calculadora de Descuento según Categoría");
            System.out.println("5. Suma de Números Pares (while)");
            System.out.println("6. Contador de Positivos, Negativos y Ceros (for)");
            System.out.println("7. Validación de Nota entre 0 y 10 (do-while)");
            System.out.println("8. Cálculo de Precio Final con impuesto y descuento");
            System.out.println("9. Costo de envío y Total de Compra");
            System.out.println("10. Actualización de Stock");
            System.out.println("11. Descuento Especial con variable global");
            System.out.println("12. Arrays: modificación de precios");
            System.out.println("13. Recursividad: impresión de arrays");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1: ejercicio1(); break;
                case 2: ejercicio2(); break;
                case 3: ejercicio3(); break;
                case 4: ejercicio4(); break;
                case 5: ejercicio5(); break;
                case 6: ejercicio6(); break;
                case 7: ejercicio7(); break;
                case 8: ejercicio8(); break;
                case 9: ejercicio9(); break;
                case 10: ejercicio10(); break;
                case 11: ejercicio11(); break;
                case 12: ejercicio12(); break;
                case 13: ejercicio13(); break;
                case 0: System.out.println("Saliendo del programa..."); break;
                default: System.out.println("Opción inválida. Intente de nuevo.");
            }
        } while (opcion != 0);
    }

    // ================= Ejercicios =================

    // 1. Verificación de Año Bisiesto
    public static void ejercicio1() {
        System.out.print("Ingrese un año: ");
        int anio = sc.nextInt();
        if ((anio % 4 == 0 && anio % 100 != 0) || (anio % 400 == 0)) {
            System.out.println("El año " + anio + " es bisiesto.");
        } else {
            System.out.println("El año " + anio + " no es bisiesto.");
        }
    }

    // 2. Determinar el mayor de tres números
    public static void ejercicio2() {
        System.out.print("Ingrese el primer número: ");
        int a = sc.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int b = sc.nextInt();
        System.out.print("Ingrese el tercer número: ");
        int c = sc.nextInt();
        int mayor = Math.max(a, Math.max(b, c));
        System.out.println("El mayor es: " + mayor);
    }

    // 3. Clasificación de edad
    public static void ejercicio3() {
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        if (edad < 12) {
            System.out.println("Eres un Niño.");
        } else if (edad < 18) {
            System.out.println("Eres un Adolescente.");
        } else if (edad < 60) {
            System.out.println("Eres un Adulto.");
        } else {
            System.out.println("Eres un Adulto mayor.");
        }
    }

    // 4. Calculadora de Descuento según categoría
    public static void ejercicio4() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese la categoría (A, B o C): ");
        char cat = sc.next().toUpperCase().charAt(0);
        double descuento = 0;

        switch (cat) {
            case 'A': descuento = 0.10; break;
            case 'B': descuento = 0.15; break;
            case 'C': descuento = 0.20; break;
            default: System.out.println("Categoría inválida"); return;
        }

        double precioFinal = precio - (precio * descuento);
        System.out.println("Descuento aplicado: " + (descuento * 100) + "%");
        System.out.println("Precio final: " + precioFinal);
    }

    // 5. Suma de números pares (while)
    public static void ejercicio5() {
        int suma = 0, num;
        do {
            System.out.print("Ingrese un número (0 para terminar): ");
            num = sc.nextInt();
            if (num % 2 == 0 && num != 0) suma += num;
        } while (num != 0);
        System.out.println("La suma de los números pares es: " + suma);
    }

    // 6. Contador de positivos, negativos y ceros (for)
    public static void ejercicio6() {
        int pos = 0, neg = 0, ceros = 0;
        for (int i = 1; i <= 10; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            int num = sc.nextInt();
            if (num > 0) pos++;
            else if (num < 0) neg++;
            else ceros++;
        }
        System.out.println("Positivos: " + pos);
        System.out.println("Negativos: " + neg);
        System.out.println("Ceros: " + ceros);
    }

    // 7. Validación de nota entre 0 y 10 (do-while)
    public static void ejercicio7() {
        int nota;
        do {
            System.out.print("Ingrese una nota (0-10): ");
            nota = sc.nextInt();
            if (nota < 0 || nota > 10) {
                System.out.println("Error: Nota inválida.");
            }
        } while (nota < 0 || nota > 10);
        System.out.println("Nota guardada correctamente.");
    }

    // 8. Cálculo del precio final con impuesto y descuento
    public static double calcularPrecioFinal(double base, double impuesto, double descuento) {
        return base + (base * impuesto) - (base * descuento);
    }
    public static void ejercicio8() {
        System.out.print("Ingrese el precio base: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese el impuesto (%): ");
        double imp = sc.nextDouble() / 100;
        System.out.print("Ingrese el descuento (%): ");
        double desc = sc.nextDouble() / 100;
        System.out.println("El precio final es: " + calcularPrecioFinal(base, imp, desc));
    }

    // 9. Costo de envío y total de compra
    public static double calcularCostoEnvio(double peso, String zona) {
        if (zona.equalsIgnoreCase("Nacional")) return peso * 5;
        else return peso * 10;
    }
    public static double calcularTotalCompra(double precio, double costoEnvio) {
        return precio + costoEnvio;
    }
    public static void ejercicio9() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        System.out.print("Ingrese el peso en kg: ");
        double peso = sc.nextDouble();
        System.out.print("Ingrese la zona (Nacional/Internacional): ");
        String zona = sc.next();
        double envio = calcularCostoEnvio(peso, zona);
        System.out.println("El costo de envío es: " + envio);
        System.out.println("El total a pagar es: " + calcularTotalCompra(precio, envio));
    }

    // 10. Actualización de stock
    public static int actualizarStock(int stock, int vendidos, int recibidos) {
        return stock - vendidos + recibidos;
    }
    public static void ejercicio10() {
        System.out.print("Ingrese el stock actual: ");
        int stock = sc.nextInt();
        System.out.print("Ingrese cantidad vendida: ");
        int vendidos = sc.nextInt();
        System.out.print("Ingrese cantidad recibida: ");
        int recibidos = sc.nextInt();
        System.out.println("El nuevo stock es: " + actualizarStock(stock, vendidos, recibidos));
    }

    // 11. Descuento especial con variable global
    public static void calcularDescuentoEspecial(double precio) {
        double descuentoAplicado = precio * DESCUENTO_ESPECIAL;
        double finalConDescuento = precio - descuentoAplicado;
        System.out.println("El descuento especial aplicado es: " + descuentoAplicado);
        System.out.println("El precio final con descuento es: " + finalConDescuento);
    }
    public static void ejercicio11() {
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        calcularDescuentoEspecial(precio);
    }

    // 12. Arrays: modificación de precios
    public static void ejercicio12() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        for (double p : precios) System.out.println("Precio: $" + p);
        // Modificamos el índice 2
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        for (double p : precios) System.out.println("Precio: $" + p);
    }

    // 13. Recursividad: impresión de arrays
    public static void imprimirArrayRecursivo(double[] arr, int i) {
        if (i < arr.length) {
            System.out.println("Precio: $" + arr[i]);
            imprimirArrayRecursivo(arr, i + 1);
        }
    }
    public static void ejercicio13() {
        double[] precios = {199.99, 299.5, 149.75, 399.0, 89.99};
        System.out.println("Precios originales:");
        imprimirArrayRecursivo(precios, 0);
        precios[2] = 129.99;
        System.out.println("Precios modificados:");
        imprimirArrayRecursivo(precios, 0);
    }
}
