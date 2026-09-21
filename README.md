# Sistema de Biblioteca

## Propósito del proyecto

Este proyecto consiste en una aplicación de gestión de biblioteca desarrollada en Java. Permite registrar libros, consultar todos los libros, buscar libros por autor y eliminar libros mediante su ISBN.

La aplicación utiliza interfaces gráficas con JOptionPane y mantiene los libros registrados durante la ejecución del programa.

## Integrantes

* Dylan Felipe Perez Villa
* Juan Pablo
* Mauro

## Funcionalidades

1. Crear libro
2. Mostrar todos los libros
3. Filtrar libros por autor
4. Eliminar libro
5. Salir de la aplicación

## Estructura del proyecto

El proyecto utiliza una única carpeta `src` que contiene las clases principales de la aplicación:

* `src/Crear_Libro.java` — Registra nuevos libros y valida sus datos.
* `src/MostrarTodosLosLibros.java` — Muestra todos los libros registrados.
* `src/FiltrarPorAutor.java` — Permite buscar libros por autor.
* `src/EliminarLibro.java` — Permite eliminar libros mediante su ISBN.
* `src/MainBiblioteca.java` — Contiene el menú principal de la aplicación.
* `src/MainFiltrarPorAutor.java` — Ejecuta la funcionalidad de filtrado por autor.
* `src/MainEliminarLibro.java` — Ejecuta la funcionalidad de eliminación de libros.

## Requisitos

* Java JDK 26.
* IntelliJ IDEA u otro entorno compatible con proyectos Java.

## Cómo compilar

Abrir el proyecto en IntelliJ IDEA y asegurarse de que la carpeta `src` esté configurada como fuente del proyecto.

También se puede compilar utilizando las herramientas de compilación de Java.

## Cómo ejecutar

Abrir la clase:

`MainBiblioteca.java`

y ejecutar su método `main`.

Desde el menú principal se puede acceder a las funcionalidades de la aplicación.

## Nota

Los libros registrados se mantienen en memoria mientras la aplicación está en ejecución. Al cerrar el programa, los datos registrados se pierden.

