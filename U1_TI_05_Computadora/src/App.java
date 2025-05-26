import model.Computadora;

public class App {
    public static void main(String[] args)throws Exception {
        Computadora pc = new Computadora("Lenovo");
        pc.setModelo("Lenovo ThinkPad X1 Carbon");


        System.out.println("Marca: " + pc.getMarca());
        System.out.println("Modelo: " + pc.getModelo());
        pc.encender();  
        pc.encender();  
        pc.apagar();    
    }
}