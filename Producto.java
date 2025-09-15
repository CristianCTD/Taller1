public class Producto {
    private String nombre;
    private double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }
    
    public void mostrarProducto() {
        System.out.println("Producto: " + this.nombre + ", Precio: $" + this.precio);
    }
    public static void main(String[] args) {
        System.out.println("--- Probando la clase Producto ---");

        Producto miProducto = new Producto("Laptop Gamer", 1500.99);
 
        miProducto.mostrarProducto();
    }
}
