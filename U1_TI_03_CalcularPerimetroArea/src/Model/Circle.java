package Model;

public class Circle {
    private double radio;
    
    //Metodo para calcular la circunferencia del circulo
    public double getCircumference() {
        return 2 * 3.1416 * radio;
    }
    //Metodo para calcular el area del circulo
    public double getArea() {
        return 3.1416 * radio * radio;
    }
    //Metodo para establecer el valor del radio
    public void setRadio(double radio) {
        this.radio = radio;
    }

}
