import java.util.ArrayList;
import java.util.HashMap;

public class Crear_Libro {

    static ArrayList<Libro> libros = new ArrayList<>();

    static HashMap<String, Libro> librosPorISBN = new HashMap<>();

    public static void main(String[] args){

    }

}

// aquí empieza la clase Libro
class Libro {

    private String titulo;
    private String autor;
    private String isbn;
    private String genero;
    private int año;
    private int copias;

}