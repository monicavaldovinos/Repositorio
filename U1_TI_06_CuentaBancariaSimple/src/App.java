import model.CuentaBancaria;

public class App {
    public static void main(String[] args) throws Exception {

        CuentaBancaria cuenta = new CuentaBancaria();
        
        cuenta.setTitular("Monica");
        System.out.println("Titular: " + cuenta.getTitular());
        System.out.println("Realizar deposito de 1000 ");
        cuenta.depositar(1000);
        System.out.println("Tu saldo actual es de: " + cuenta.getSaldo());
        System.out.println("Realizar retiro de 200 ");   
        cuenta.retirar(200);
        System.out.println("Tu saldo actual es de: " + cuenta.getSaldo());
        System.out.println("Realizar retiro de 10000 ");    
        cuenta.retirar(10000);
        System.out.println("Tu saldo actual es de: " + cuenta.getSaldo());

    }
}
