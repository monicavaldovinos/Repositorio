package model;
public class CuentaBancaria {

    private String titular;
    private double saldo;

    public double getSaldo() {
        return saldo;
    }
    public String getTitular() {
        return titular;
    }
    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void depositar(double monto) {
        if(monto > 0){
            saldo += monto;
            System.out.println("El deposito se realizo correctamente."); 
        }else {
            System.out.println("No se puede realizar el deposito, vuelve a intentarlo.");
        }
    }
    public boolean retirar (double monto) {
        if(monto > 0 && saldo >= monto){
            saldo -= monto;
            return true;
        }else {
            System.out.println("No se puede realizar el retiro, vuelve a intentarlo.");
            return false;
        }
    }

    
}
