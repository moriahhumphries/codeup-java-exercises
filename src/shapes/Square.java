package shapes;

public class Square extends Quadrilateral {
    public Square(double side) {
        super(side, side);
    }

    @Override
    public void setLength(double length) {
        this.length = length;
        this.width = length;
    }

    @Override
    public void setWidth(double width) {
        this.setLength(width);
    }

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }


    public double getArea() {
        return length * width;


    }
}

