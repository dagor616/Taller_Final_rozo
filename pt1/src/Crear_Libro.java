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
            JOptionPane.showMessageDialog(null,"ERROR, ingrese un titulo");
            return;
        }
        String autor = JOptionPane.showInputDialog("Ingrese el autor del libro");
        if (autor == null || autor.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "ERROR, ingrese un autor");
            return;
        }
        String isbn = JOptionPane.showInputDialog("Ingrese el ISBN del libro");

        if (isbn == null || isbn.trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "ERROR, ingrese un ISBN");
            return;
        }

        if (librosPorISBN.containsKey(isbn)){
            JOptionPane.showMessageDialog(null, "ERROR, ese ISBN ya existe");
            return;
        }
        String genero = JOptionPane.showInputDialog("Ingrese el genero del libro");
        if (genero == null || genero.trim() .isEmpty()){
            JOptionPane.showMessageDialog(null,"ERROR, ingrese un genero");
        return;
        }
        String añoTexto = JOptionPane.showInputDialog("Ingrese el año de publicación");

        int año;
// try es para que intente el codigo leer de numero a letras sin que salga error
        try {
            año = Integer.parseInt(añoTexto);
            //catch es si falla  y mande el mensaje
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR, ingrese un año válido");
            return;
        }

        int añoActual = java.time.Year.now().getValue();

        if (año > añoActual) {
            JOptionPane.showMessageDialog(null, "ERROR, el año no puede ser mayor al año actual");
            return;
        }
        String copiasTexto = JOptionPane.showInputDialog("Ingrese las copias disponibles");

        int copias;

        try {
            copias = Integer.parseInt(copiasTexto);
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "ERROR, ingrese un número válido");
            return;
        }

        if (copias < 0) {
            JOptionPane.showMessageDialog(null, "ERROR, las copias no pueden ser menores que 0");
            return;
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