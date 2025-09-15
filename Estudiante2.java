public class Estudiante2 {
    private String nombre;
    private int edad;

    public Estudiante2() {
        this("Desconocido", 0);
    }

    public Estudiante2(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Se reemplaza mostrarInfo() por el método estándar toString() para mayor flexibilidad.
     * Este método ahora devuelve una cadena con los datos reales del objeto,
     * eliminando los valores fijos "Cristian Torres" y "17".
     */
    @Override
    public String toString() {
        return "Estudiante: " + this.nombre + ", Edad: " + this.edad;
    }

    /**
     * Método main para probar la clase Estudiante2 de forma aislada.
     */
    public static void main(String[] args) {
        System.out.println("--- Probando la clase Estudiante2 ---");

        // Prueba 1: Usando el constructor con parámetros
        Estudiante2 estudianteConocido = new Estudiante2("Ana García", 21);
        System.out.println(estudianteConocido); // Imprime: Estudiante: Ana García, Edad: 21

        // Prueba 2: Usando el constructor por defecto
        Estudiante2 estudianteDesconocido = new Estudiante2();
        System.out.println(estudianteDesconocido); // Imprime: Estudiante: Desconocido, Edad: 0
    }
}
