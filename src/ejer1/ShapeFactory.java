package ejer1;

public class ShapeFactory {

    public IShape getShape(ShapeType shapeType, double ...data){
        if(shapeType == ShapeType.SQUARE)
            return new Square(data[0]);
        if(shapeType == ShapeType.CIRCLE)
            return new Circle(data[0]);
        if(shapeType == ShapeType.RECTANGLE)
            return new Rectangle(data[0], data[1]);
        return null;
    }

}
