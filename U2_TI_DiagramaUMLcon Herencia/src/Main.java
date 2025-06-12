public class Main {
    public static void main(String[] args) throws Exception {
        Cuenta cuentaComun = new CuentaComun("EDV123456-CC", "Monica", 1000);
        cuentaComun.depositar(500);
        cuentaComun.retirar(500);


        CuentaAhorros cuentaAhorros = new CuentaAhorros("EDV654321-CA", "Mariana", 1500, 5);
        cuentaAhorros.depositar(700);
        cuentaAhorros.retirar(700);
        cuentaAhorros.aplicarInteres();

        

    }
}
