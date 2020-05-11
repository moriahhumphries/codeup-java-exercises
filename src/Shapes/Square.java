package Shapes;

public class Square extends Rectangle {

    private int side;

    public Square(int side){
    this.side = side;
    }

//    public Square(int length, int width, int side) {
//        super(length, width);
//
//    }
    public int getArea(int side){
        return this.side = side ^ 2;
//        return side ^ 2;
    }

    public int getPerimeter(int side) {
        return this.side = 4 * side;
//        return 4 * side;


    }
}
