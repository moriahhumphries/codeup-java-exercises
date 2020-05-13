package shapes;

public class ShapesTest {
    public static void main(String[] args) {


        Measurable myShape = new Square(5);
        System.out.println("Get area: " + myShape.getArea());
        System.out.println("Get Perimeter: " + myShape.getPerimeter());

        myShape = new Rectangle(2, 3);
        System.out.println("Get area: " + myShape.getArea());
        System.out.println("Get perimeter: " + myShape.getPerimeter());







    }
}
