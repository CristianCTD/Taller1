public class CuentaBancaria {
    String numeroCuenta;
    String tipoCuenta;
    double saldo;

    public CuentaBancaria(){
        this.numeroCuenta = "0000";
        this.tipoCuenta = "Ahorros";
        this.saldo = 0.0;
    }
    public CuentaBancaria(String numeroCuenta, String tipoCuenta){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = 0.0;
    }
    public CuentaBancaria(String numeroCuenta, String tipoCuenta, double saldo){
        this.numeroCuenta = numeroCuenta;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }
    public void mostrarDetalles(){
        System.out.println("Numero de cuenta: " + this.numeroCuenta);
        System.out.println("Tipo de cuenta: " + this.tipoCuenta);
        System.out.println("Saldo: " + this.saldo);
    }
    public String toString(){
        return "Cuenta: " + this.numeroCuenta + "\nTipo: " + this.tipoCuenta + "\nSaldo: " + this.saldo;
    }
    public static void main(String[] args) {
        System.out.println("--- Probando la clase CuentaBancaria ---");
        CuentaBancaria cuentaDePrueba = new CuentaBancaria("9876-5432", "Ahorros", 1250.50);

        System.out.println("\nLlamando a mostrarDetalles():");
        cuentaDePrueba.mostrarDetalles();

        System.out.println("\nImprimiendo el objeto (usa toString()):");
        System.out.println(cuentaDePrueba);
    }
}
