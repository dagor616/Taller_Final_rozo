import javax.swing.JOptionPane;

public class FiltrarPorAutor {

    public void filtrar() {

        String autor = JOptionPane.showInputDialog(
                "Ingrese el autor que desea buscar:"
        );

        if (autor == null || autor.trim().isEmpty()) {
            JOptionPane.showMessageDialog(
                    null,
                    "Debe ingresar un autor."
            );
            return;
        }

        String resultado = "LIBROS ENCONTRADOS\n\n";
        boolean encontrado = false;

        for (Libro libro : Crear_Libro.libros) {

            if (libro.getAutor().equalsIgnoreCase(autor.trim())) {

                resultado += "Título: " + libro.getTitulo() + "\n";
                resultado += "Autor: " + libro.getAutor() + "\n";
                resultado += "ISBN: " + libro.getIsbn() + "\n";
                resultado += "Género: " + libro.getGenero() + "\n";
                resultado += "Año: " + libro.getAño() + "\n";
                resultado += "Copias: " + libro.getCopias() + "\n\n";

                encontrado = true;
            }
        }

        if (!encontrado) {
            resultado = "No se encontraron libros de ese autor.";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}