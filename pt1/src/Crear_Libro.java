import java.util.ArrayList;
import java.util.HashMap;
import javax.swing.JOptionPane;

public class Crear_Libro {

    static ArrayList<Libro> libros = new ArrayList<>();

    static HashMap<String, Libro> librosPorISBN = new HashMap<>();

    public static void main(String[] args){

        crearLibro();

    }

    //  crear  libro
    public static void crearLibro() {
        String titulo = JOptionPane.showInputDialog("Ingrese el titulo del libro");
        if (titulo == null || titulo.trim().isEmpty()){
            JOptionPane.showMessageDialog(null,"ERROR,ingrese un titulo");
        }
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

    // constructor libro
    public Libro(String titulo, String autor, String isbn, String genero, int año, int copias){
        this.titulo = titulo;
        this.autor = autor;
        this.isbn = isbn;
        this.genero = genero;
        this.año = año;
        this.copias = copias;
    }

    // getter
    public String getTitulo(){
        return titulo;
    }

    public String getAutor(){
        return autor;
    }

    public String getIsbn(){
        return isbn;
    }

    public String getGenero(){
        return genero;
    }

    public int getAño(){
        return año;
    }

    public int getCopias(){
        return copias;
    }
}