import Model.Square;
import Model.Triangle;
import Model.Circle;

public class App {
    public static void main(String[] args)throws Exception {
       
        Square sq = new Square();
        sq.setLado(10);
        sq.setMessage("Hola");
        System.out.println("Cuadrado");
        System.out.println(sq.getLado());
        double squarePerimeter = sq.getPerimeter();
        //System.out.println(squarePerimeter);
       // System.out.println(sq.getPerimeter());
        System.out.println(sq.getArea());

        Triangle tr = new Triangle();
        tr.setLado(8);
        tr.setBase(2);
        tr.setAltura(7);
        System.out.println("\nTriangulo ");
        System.out.print("Perimetro: ");
        System.out.println(tr.getPerimeter());
        System.out.print("Area: ");
        System.out.println(tr.getArea());
        
        Circle ci = new Circle();
        ci.setRadio(5);
        System.out.println("\nCirculo ");
        System.out.print("Perimetro: ");
        System.out.println(ci.getCircumference());
        System.out.print("Area: ");
        System.out.println(ci.getArea());

}
}
