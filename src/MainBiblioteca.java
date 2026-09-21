import javax.swing.JOptionPane;

public class MainBiblioteca {

    public static void main(String[] args) {

        boolean continuar = true;

        while (continuar) {

            String opcion = JOptionPane.showInputDialog(
                    "BIBLIOTECA\n\n" +
                            "1. Crear libro\n" +
                            "2. Mostrar todos los libros\n" +
                            "3. Filtrar por autor\n" +
                            "4. Eliminar libro\n" +
                            "5. Salir\n\n" +
                            "Seleccione una opción:"
            );

            if (opcion == null) {
                break;
            }

            switch (opcion) {

                case "1":
                    Crear_Libro.crearLibro();
                    break;

                case "2":
                    new MostrarTodosLosLibros();
                    break;

                case "3":
                    FiltrarPorAutor filtrar = new FiltrarPorAutor();
                    filtrar.filtrar();
                    break;

                case "4":
                    EliminarLibro eliminar = new EliminarLibro();
                    eliminar.eliminar();
                    break;

                case "5":
                    continuar = false;

                    JOptionPane.showMessageDialog(
                            null,
                            "Programa finalizado."
                    );
                    break;

                default:
                    JOptionPane.showMessageDialog(
                            null,
                            "Opción no válida."
                    );
            }
        }
    }
}