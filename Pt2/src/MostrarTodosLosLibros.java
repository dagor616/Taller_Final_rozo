import java.util.ArrayList;

public class MostrarTodosLosLibros {
    private ArrayList<Libro> libros;

    // Constructor
    public MostrarTodosLosLibros() {
        libros = new ArrayList<>();
    }

    // Agregar un libro
    public void agregarLibro(Libro libro) {
        libros.add(libro);
    }
}
