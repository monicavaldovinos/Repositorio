package Model;

public class Square {

    private double lado;
    private String message;

    public double getPerimeter() {
        //double perimeter = lado * 4;
        return lado * 4;
    }
    public double getArea() {
        //double area = lado * lado;
        //validar que this.message tenga un valor
        if(!this.message.isEmpty()){
            getSecretMessage();
        }
        return lado * lado;
        
    }
    public void setLado(double lado){
        this.lado = lado;
    }
    public double getLado(){
        return this.lado;
    }
    
    public void setMessage(String message){
        this.message = message;
    }
    
    public void getSecretMessage(){
        System.out.println("Este metodo solo es acceesible dentro de la clase, pero no desde afuera");
    }
    

}
