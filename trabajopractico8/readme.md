📄 README — TP 8: Interfaces y Excepciones en Java
Programación II — Trabajo Práctico Nº8

Tema: Interfaces y Manejo de Excepciones
Carrera: Tecnicatura Universitaria en Programación
Modalidad: A distancia

🧠 Objetivos del Trabajo Práctico

Comprender y aplicar interfaces como contratos de comportamiento.

Implementar herencia múltiple mediante interfaces.

Utilizar excepciones para manejar errores en tiempo de ejecución.

Diferenciar entre excepciones checked y unchecked.

Crear y usar excepciones personalizadas.

Aplicar buenas prácticas: try, catch, finally y try-with-resources.

Integrar interfaces y excepciones para generar código más robusto y mantenible.

📁 Estructura del Proyecto
TP8-Interfaces-Excepciones/
│
├── Parte1-Ecommerce/
│   ├── interfaces/
│   │   ├── Pagable.java
│   │   ├── Pago.java
│   │   ├── PagoConDescuento.java
│   │   ├── Notificable.java
│   │
│   ├── modelos/
│   │   ├── Producto.java
│   │   ├── Cliente.java
│   │   ├── Pedido.java
│   │
│   ├── pagos/
│   │   ├── TarjetaCredito.java
│   │   ├── PayPal.java
│   │
│   ├── Main.java
│
├── Parte2-Excepciones/
│   ├── DivisionSegura.java
│   ├── StringToNumber.java
│   ├── LeerArchivo.java
│   ├── EdadInvalidaException.java
│   ├── VerificarEdad.java
│   ├── LeerArchivoConTWR.java
│   └── texto.txt
│
└── README.md

🛒 Parte 1 — Sistema de E-commerce (Interfaces)

En esta sección se implementa un pequeño sistema de compra compuesto por productos, pedidos, clientes y medios de pago, aplicando el concepto de interfaces como contrato.

✔ Interfaces definidas

Pagable: define calcularTotal().

Pago: define procesarPago(double monto).

PagoConDescuento: permite aplicar descuentos.

Notificable: permite que un cliente reciba notificaciones.

✔ Clases

Producto: implementa Pagable.

Pedido: implementa Pagable, contiene productos y notifica al cliente.

Cliente: implementa Notificable.

TarjetaCredito: implementa Pago y PagoConDescuento.

PayPal: implementa Pago.

✔ Cómo ejecutarlo

Ubicarse en la carpeta Parte1-Ecommerce/ y compilar:

javac interfaces/*.java modelos/*.java pagos/*.java Main.java


Ejecutar:

java Main


Deberías ver notificaciones, total del pedido, pago con descuento y cambio de estado.

⚠️ Parte 2 — Manejo de Excepciones

Incluye pequeños programas independientes para mostrar el uso de distintos tipos de excepciones:

✔ Ejercicios incluidos

DivisionSegura: captura ArithmeticException.

StringToNumber: captura NumberFormatException.

LeerArchivo: maneja FileNotFoundException.

EdadInvalidaException: excepción personalizada.

VerificarEdad: uso de la excepción personalizada.

LeerArchivoConTWR: lectura con try-with-resources y manejo de IOException.

✔ Cómo ejecutarlos

Ejemplo:

javac DivisionSegura.java
java DivisionSegura


Probá con diferentes entradas (como divisor cero o texto no numérico) para ver cómo funcionan las excepciones.

📝 Conclusiones Esperadas

Las interfaces permiten un diseño desacoplado, flexible y extensible.

La herencia múltiple mediante interfaces permite combinar comportamientos sin heredar estado.

El uso adecuado de excepciones evita caídas del programa y mejora la robustez.

Las excepciones personalizadas permiten validar reglas de negocio específicas.

try-with-resources garantiza cierre seguro de recursos (archivos, buffers).

🛠️ Tecnologías Utilizadas

Java 8+

Paradigma Orientado a Objetos

📚 Fuentes / Herramientas

Apuntes de la cátedra

Documentación oficial de Java

ChatGPT (asistencia para estructura y generación de código)
