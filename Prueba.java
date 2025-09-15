public class Prueba {
    private String texto = "Hola";

    public static void mostrarTexto() {
        // Error: No se puede usar this en un contexto estático
        System.out.println(this.texto);
    }
}
public class Prueba {
    private String texto = "Hola";

    public void mostrarTexto() {
        // Aquí sí funciona, porque this se refiere al objeto actual
        System.out.println(this.texto);
    }
}

