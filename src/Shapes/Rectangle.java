package Shapes;

public class Rectangle {
    protected int length;
    protected int width;

    Rectangle(){

    }
    Rectangle(int length, int width){
        this.length = length;
        this.width = width;
    }

    public int getArea(int length, int width){
        return length * width;
    }

    public int getPerimeter(int length, int width){
        return (2 * length) + (2 * width);
    }
}
