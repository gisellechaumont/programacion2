📝 README – Trabajo Práctico Programación II

Este repositorio contiene las tres consignas del trabajo práctico, cada una en su carpeta correspondiente. Todas las consignas están desarrolladas en Java y funcionan desde una terminal o desde Visual Studio Code.

📁 Estructura del Proyecto
TP6-Programacion2/
│
├── Consigna1-Stock/
│ ├── MainInventario.java
│ ├── Producto.java
│ └── ..
│
├── Consigna2-Biblioteca/
│ ├── MainBiblioteca.java
│ └── ..
│
└── Consigna3-Universidad/
├── MainUniversidad.java
└── ..

⚠️ Los nombres pueden variar mientras respeten un archivo Main por consigna.

🚀 Cómo ejecutar cada consigna

Cada carpeta tiene su clase principal (Main...), que es la que debe ejecutarse.

Podés correrlas de dos formas:

✔️ OPCIÓN 1: Ejecutar desde TERMINAL

(Ejemplo con Consigna 1)

Abrir una terminal dentro de la carpeta de la consigna:

cd Consigna1-Stock

Compilar:

javac MainInventario.java

Ejecutar:

java MainInventario

✔️ OPCIÓN 2: Ejecutar desde VISUAL STUDIO CODE

Abrir la carpeta del proyecto en VS Code.

Abrir el archivo Main de la consigna (por ejemplo MainInventario.java).

En la esquina superior derecha, hacer clic en Run ▶️.

La terminal integrada ejecutará automáticamente el código.

⚙️ Requisitos

Tener instalado Java JDK (versión 17 recomendada).

VS Code + extensión Extension Pack for Java (opcional pero recomendado).

🧪 Pruebas realizadas

Se probó la ejecución de las tres consignas desde terminal y desde Visual Studio Code.

En cada consigna se validó la correcta compilación (.class generados automáticamente).

Se verificó el funcionamiento de las reglas de negocio específicas de cada caso.

Se probaron entradas válidas e inválidas para asegurar estabilidad.

📌 Notas finales

Todas las consignas están programadas con enfoque modular.

Las clases auxiliares (como Producto, Cliente, etc.) se compilan automáticamente cuando se compila el Main.

Se recomienda correr cada consigna desde su carpeta para evitar problemas de rutas.
