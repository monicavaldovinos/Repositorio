package Model;

public class RightTriangle extends FigureAbs {
    private double cateto1;
    private double cateto2;


    public RightTriangle(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }

    public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
    @Override
    public double getArea() {
        return (cateto1 * cateto2) / 2;
    }
    @Override
    public double getPerimeter() {
        return (cateto1 + cateto2 + ((Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2)))));
    }


    

}
