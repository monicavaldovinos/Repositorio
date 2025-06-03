package Model;

public class EquilateralTriangle extends FigureAbs {
    private double base;
    private double height;

    public EquilateralTriangle(double base, double height) {
        this.base = base;
        this.height = height;
    }
    public double getBase() {
        return base;
    }
    public void setBase(double base) {
        this.base = base;
    }
     public double getHeight() {
        return height;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public double getArea() {
        return (base * height) / 2;
    }
    @Override
    public double getPerimeter() {
        return 3 * base;
    }
}
