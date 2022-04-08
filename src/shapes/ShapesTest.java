package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Measurable myShape;

        myShape = new Square(5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
        myShape = new Rectangle(4, 5);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());
//        myShape.getLength(); Can't do this: myShape reference type is Measurable, not Quadrilateral or Rectangle or Square


//        Rectangle box1 = new Rectangle(4, 5);
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
    }
}
