package ejer1;

public class Rectangle implements IShape{

    private double b;
    private double h;

    public Rectangle(double b, double h){
        this.b = b;
        this.h = h;
    }

    @Override
    public double getArea() {
        return b * h;   
    }

    @Override
    public double getPerimeter() {
        return 2 * (b + h);
    }
    
}
