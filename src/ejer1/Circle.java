package ejer1;

public class Circle implements IShape{

    private double r;

    public Circle(double r){
        this.r = r;
    }

    @Override
    public double getArea() {
        return Math.PI * Math.pow(r, 2);
    }

    @Override
    public double getPerimeter() {
        return Math.TAU * r;
    }

}