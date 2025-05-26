package model;

public class Computadora {

    private String marca;
    private String modelo;
    private boolean encendida;

    public Computadora(String marca) {
    this.marca = marca;
    }
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public boolean getEncendida() {
        return encendida;
    }

    public void encender() {
        if (encendida == false) {
            encendida = true;
            System.out.println("Encendiendo...");
        } 
    }

    public void apagar() {
        if (encendida == true) {
            encendida = false;
            System.out.println("Apagando...");
        } 
    }
}
