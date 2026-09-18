import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MostrarTodosLosLibros {

    private JFrame ventana;
    private JTable tabla;
    private DefaultTableModel modelo;

    public MostrarTodosLosLibros() {

        ventana = new JFrame("Todos los libros");
        ventana.setSize(800, 400);
        ventana.setLocationRelativeTo(null);
        ventana.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);

        modelo = new DefaultTableModel(
                new Object[]{"Título", "Autor", "ISBN", "Género", "Año", "Copias"}, 0
        );

        tabla = new JTable(modelo);

        cargarLibros();

        ventana.add(new JScrollPane(tabla), BorderLayout.CENTER);

        ventana.setVisible(true);
    }

    private void cargarLibros() {

        modelo.setRowCount(0);

        for (Libro libro : Crear_Libro.libros) {

            modelo.addRow(new Object[]{
                    libro.getTitulo(),
                    libro.getAutor(),
                    libro.getIsbn(),
                    libro.getGenero(),
                    libro.getAño(),
                    libro.getCopias()
            });
        }
    }

    public static void main(String[] args) {
        new MostrarTodosLosLibros();
    }
}



