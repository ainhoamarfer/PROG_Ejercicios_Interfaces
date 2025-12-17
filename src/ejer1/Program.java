package ejer1;

import java.util.Scanner;

public class Program {
    public static void main(String[] args) {

        ShapeFactory factory = new ShapeFactory();

        for(ShapeType st : ShapeType.values()){
            System.out.println(st.getText());
        }

        Scanner sc = new Scanner(System.in);
        int op = sc.nextInt();
        sc.nextLine();

        IShape shape = factory.getShape(ShapeType.values()[op - 1], 5, 4);

        logInfo(shape);
    }

    private static void logInfo(IShape shape){
        System.out.println(shape.getArea());
        System.out.println(shape.getPerimeter());
    }
}
