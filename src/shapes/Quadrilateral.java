package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {
    protected double length;
    protected double width;

    public Quadrilateral(double length, double width){
//        super(length, width);
        this.length = length;
        this.width = width;
    }

    public double getArea(){
        return this.length;
//        return length * width;
    }

    public double getPerimeter(){
        return this.width;
//        return (2 * length) + (2 * width);
    }

    public abstract void setLength(double length);



    public abstract void setWidth(double width);



}
