package ejer1;

public enum ShapeType {
    CIRCLE("Circle"), SQUARE("Square"), RECTANGLE("Rectangle");

    private String text; 

    ShapeType(String string) {
        this.text = string;
    }

    public String getText(){
        return text;
    }    
}
