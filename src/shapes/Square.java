package shapes;

public class Square extends Quadrilateral {
    public Square(int length, int width) {
        super(length, width);
    }

    @Override
    public double setLength() {
        return 0;
    }

    @Override
    public double setWidth() {
        return 0;
    }
}


//public class Square extends Rectangle {
//
//
//
//    public Square(int side){
//    super(side, side);
//
//    }
//
//    public int getArea(){
//        return (int) Math.pow(super.length, 2);
//    }
//
//    public int getPerimeter() {
//        return super.length * 4;
//
//
//
//    }
//}
