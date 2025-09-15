public class Estudiante {
    String nombre;
    int edad;
    String curso;

    public Estudiante(){
        this.nombre = "Desconocido";
        this.edad = 0;
        this.curso = "Desconocido";
    }

    public Estudiante(String nombre, int edad){
        this.nombre = nombre;
        this.edad = edad;
        this.curso = "no asignado";
    }
    public Estudiante(String nombre, int edad, String curso){
        this(nombre, edad);
        this.curso = curso;
    }
    public void mostrarDetalles(){
        System.out.println("Nombre: " + this.nombre);
        System.out.println("Edad: " + this.edad);
        System.out.println("Curso: " + this.curso);
    }
    public String toString(){
        return "Nombre: " + this.nombre + "\nEdad: " + this.edad + "\nCurso: " + this.curso;

    }

    public static void main(String[] args) {
        System.out.println("--- Probando la clase Estudiante ---");
        Estudiante estudianteDePrueba = new Estudiante("Cristian Torres", 17, "Ingeniería de Software");
        System.out.println(estudianteDePrueba);
    }
}
