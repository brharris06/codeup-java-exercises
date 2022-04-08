package shapes;

public class Circle {
    private double radius;
    private static int total; // increases total number of circles.

    public Circle(double radius) {
        this.radius = radius; // this = specific instance
        total++; // static variable not instance, changes for the class as a whole. NOT instance.
    }

    public static int total() {
        return total;
    }


    public double getArea() {
        return Math.PI * (this.radius * this.radius);
    }

    public double getCircumference() {
        return 2 * Math.PI * this.radius;
    }

    public void displayData() {
        System.out.println("Radius: " + this.radius);
        System.out.println("area: " + this.getArea());
        System.out.println("circumference: " + this.getCircumference());
    }


}