import javax.swing.JOptionPane;
import java.util.ArrayList;

public class EliminarLibro {

    public void eliminar() {

        ArrayList<String[]> libros = new ArrayList<>();

        libros.add(new String[]{"Cien años de soledad", "123"});
        libros.add(new String[]{"El principito", "456"});
        libros.add(new String[]{"Harry Potter", "789"});

        String isbn = JOptionPane.showInputDialog(
                "Ingrese el ISBN del libro que desea eliminar:"
        );

        boolean encontrado = false;

        for (int i = 0; i < libros.size(); i++) {

            if (libros.get(i)[1].equals(isbn)) {

                int respuesta = JOptionPane.showConfirmDialog(
                        null,
                        "¿Está seguro de eliminar?\n\n" +
                                libros.get(i)[0],
                        "Confirmar eliminación",
                        JOptionPane.YES_NO_OPTION
                );

                if (respuesta == JOptionPane.YES_OPTION) {

                    libros.remove(i);

                    JOptionPane.showMessageDialog(
                            null,
                            "Libro eliminado correctamente."
                    );
                }

                encontrado = true;
                break;
            }
        }

        if (!encontrado) {

            JOptionPane.showMessageDialog(
                    null,
                    "No se encontró el libro."
            );
        }
    }
}