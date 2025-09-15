import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese los datos del libro:");
        System.out.println("Titulo: ");
        String titulo = sc.nextLine();
        System.out.println("Autor: ");
        String autor = sc.nextLine();
        System.out.println("Numero de paginas: ");
        int paginas = sc.nextInt();
        sc.nextLine(); // Consumir el salto de línea restante
        Libro libro = new Libro(titulo, autor, paginas);

        System.out.println("Ingrese los datos de una cuenta bancaria:");
        System.out.println("Numero de cuenta: ");
        String numeroCuenta = sc.nextLine();
        System.out.println("Tipo de cuenta: ");
        String tipoCuenta = sc.nextLine();
        CuentaBancaria cuenta = new CuentaBancaria(numeroCuenta, tipoCuenta);

        System.out.println("Ingrese los datos del Estudiante:");
        System.out.println("Nombre: ");
        String nombreEstudiante = sc.nextLine();
        System.out.println("Edad: ");
        int edadEstudiante = sc.nextInt();
        sc.nextLine();
        System.out.println("Carrera: ");
        String carreraEstudiante = sc.nextLine();
        Estudiante estudiante = new Estudiante(nombreEstudiante, edadEstudiante, carreraEstudiante);

        System.out.println("\n--- OBJETOS CREADOS ---");
        System.out.println("--- Libro ---");
        System.out.println(libro);
        System.out.println("\n--- Cuenta Bancaria ---");
        System.out.println(cuenta);
        System.out.println("\n--- Estudiante ---");
        System.out.println(estudiante);
    }
}
