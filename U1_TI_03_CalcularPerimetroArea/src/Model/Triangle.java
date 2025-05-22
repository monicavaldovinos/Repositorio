package Model;

public class Triangle {

    private double lado;
    private double base;
    private double altura;

    //Metodo para calcular el perimetro del trinagulo
    public double getPerimeter() {
        return lado + lado + base;
    }
    //Metodo para calcular el area del triangulo
    public double getArea() {
        return (base * altura) / 2;
    }
    //Metodo para establecer el valor del lado
    public void setLado(double lado){
        this.lado = lado;
    }
    //Metodo para establecer el valor de la base
    public void setBase(double base){
        this.base = base;
    }
    //Metodo para establecer el valor de la altura
    public void setAltura(double altura){
        this.altura = altura;
    }

}
