package shapes;

public class Rectangle extends Quadrilateral implements Measurable {
    @Override
    public double getPerimeter() {
        return (2 * width) + (2 * length);
    }

    @Override
    public double getArea() {
        return length * width;
    }

    @Override
    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public void setWidth(double width) {
        this.width = width;
    }

    public Rectangle(){}

    public Rectangle(double length, double width) {
        this.width = width;
        this.length = length;
    }

//    protected double length;
//    protected double width;
//
//    public Rectangle(){}
//
//    public Rectangle(double length, double width) {
//        this.width = width;
//        this.length = length;
//    }
//
//
//
//    public double getPerimeter() {
//        return (2 * this.length) + (2 * this.width);
//    }
//
//    public double getArea() {
//        return this.length * this.width;
//    }

}
