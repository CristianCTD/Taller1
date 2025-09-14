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

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.mostrarDetalles();
    }
}
