import javax.swing.JOptionPane;
import java.util.ArrayList;

public class FiltrarPorAutor {

    public void filtrar() {

        ArrayList<String[]> libros = new ArrayList<>();

        libros.add(new String[]{
                "Cien años de soledad",
                "Gabriel García Márquez"
        });

        libros.add(new String[]{
                "El amor en los tiempos del cólera",
                "Gabriel García Márquez"
        });

        libros.add(new String[]{
                "El principito",
                "Antoine de Saint-Exupéry"
        });

        String autor = JOptionPane.showInputDialog(
                "Ingrese el autor que desea buscar:"
        );

        String resultado = "LIBROS ENCONTRADOS\n\n";

        boolean encontrado = false;

        for (String[] libro : libros) {

            if (libro[1].equalsIgnoreCase(autor)) {

                resultado += "Título: " + libro[0] + "\n";
                resultado += "Autor: " + libro[1] + "\n\n";

                encontrado = true;
            }
        }

        if (!encontrado) {
            resultado = "No se encontraron libros de ese autor.";
        }

        JOptionPane.showMessageDialog(null, resultado);
    }
}