public class Libro {
String titulo;
String autor;
int paginas;

public Libro(){
    this.titulo = "sin titulo";
    this.autor = "Desconocido";
    this.paginas = 0;
}
    public void mostrarDetalles(){
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Paginas: " + this.paginas);
    }
    public Libro (String titulo, String autor, int paginas){
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }
    public String toString(){
        return "Titulo: " + this.titulo + "\nAutor: " + this.autor + "\nPaginas: " + this.paginas;
    }

    /**
     * Método main para probar la clase Libro de forma aislada.
     * Este es el "jefe de obra" que da la orden de construir y mostrar.
     */
    public static void main(String[] args) {
        // 1. CONSTRUIMOS un libro usando el plano (la clase) y los datos.
        Libro miLibro = new Libro("Cien Años de Soledad", "Gabriel García Márquez", 496);

        // 2. MOSTRAMOS la "foto" del libro que acabamos de construir.
        System.out.println(miLibro);
    }
}
