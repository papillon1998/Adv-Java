package functional_programming_java.method_references;

public class Main {

    public static void main(String[] args) {

        Square square1 = new Square(5);

        Shapes shape1 = (shape) -> {
            return shape.calculateArea();
        };
        Shapes shape2 = Square::calculateArea;

        System.out.println(shape2.getArea(square1));

    }


}
