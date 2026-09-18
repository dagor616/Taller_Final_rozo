# Sistema de Biblioteca

## Propósito del proyecto

Este proyecto consiste en una aplicación de gestión de biblioteca desarrollada en Java. Permite registrar libros, consultar todos los libros, buscar libros por autor y eliminar libros mediante su ISBN.

La aplicación utiliza interfaces gráficas con JOptionPane y mantiene los libros registrados durante la ejecución del programa.

## Integrantes

- Dylan Felipe Perez Villa
- Juan Pablo
- Mauro

## Funcionalidades

1. Crear libro
2. Mostrar todos los libros
3. Filtrar libros por autor
4. Eliminar libro
5. Salir de la aplicación

## Estructura del proyecto

- `pt1/src/Crear_Libro.java` — Registro de libros.
- `Pt2/src/MostrarTodosLosLibros.java` — Muestra todos los libros registrados.
- `parte3/src/FiltrarPorAutor.java` — Busca libros por autor.
- `parte4/src/EliminarLibro.java` — Elimina libros mediante ISBN.
- `parte4/src/MainBiblioteca.java` — Menú principal de la aplicación.

## Requisitos

- Java JDK instalado.
- IntelliJ IDEA u otro entorno compatible con proyectos Java.

## Cómo compilar

Abrir el proyecto en IntelliJ IDEA y asegurarse de que las carpetas `src` de las diferentes partes estén configuradas como fuentes del proyecto.

También se puede compilar utilizando las herramientas de compilación de Java.

## Cómo ejecutar

Abrir la clase:

`MainBiblioteca.java`

y ejecutar su método `main`.

Desde el menú principal se puede acceder a las cuatro funcionalidades de la aplicación.

## Nota

Los libros registrados se mantienen en memoria mientras la aplicación está en ejecución. Al cerrar el programa, los datos registrados se pierden.
