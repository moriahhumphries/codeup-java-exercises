package shapes;

public class ShapesTest {
    public static void main(String[] args) {


        Measurable myShape = new Measurable() {
            @Override
            public double getPerimeter() {
                return 0;
            }

            @Override
            public double getArea() {
                return 0;
            }



//            Rectangle box1 = new Rectangle(5, 4);
//        System.out.println("Box 1 area: "+box1.getArea());
//        System.out.println("Box 1 perimeter: "+box1.getPerimeter());

//            Rectangle box2 = new Square(5);
//        System.out.println("Box 2 area: "+box2.getArea());
//        System.out.println("Box 2 perimeter: "+box2.getPerimeter());


        };
    }
}
