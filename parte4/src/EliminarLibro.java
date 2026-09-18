import javax.swing.JOptionPane;

public class EliminarLibro {

    public void eliminar() {

        String isbn = JOptionPane.showInputDialog(
                "Ingrese el ISBN del libro que desea eliminar:"
        );

        if (isbn == null || isbn.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Debe ingresar un ISBN."
            );
            return;
        }

        Libro libro = Crear_Libro.librosPorISBN.get(isbn.trim());

        if (libro == null) {
            JOptionPane.showMessageDialog(
                    null,
                    "No se encontró ningún libro con ese ISBN."
            );
            return;
        }

        int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Está seguro de eliminar?\n\n" +
                        "Título: " + libro.getTitulo() + "\n" +
                        "Autor: " + libro.getAutor() + "\n" +
                        "ISBN: " + libro.getIsbn(),
                "Confirmar eliminación",
                JOptionPane.YES_NO_OPTION
        );

        if (respuesta == JOptionPane.YES_OPTION) {

            Crear_Libro.libros.remove(libro);
            Crear_Libro.librosPorISBN.remove(isbn.trim());

            JOptionPane.showMessageDialog(
                    null,
                    "Libro eliminado correctamente."
            );
        }
    }
}