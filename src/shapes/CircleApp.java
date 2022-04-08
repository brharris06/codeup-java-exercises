package shapes;

import util.Input;

public class CircleApp {

    public static void main(String[] args) {

        Input input = new Input(); // new input instance
        boolean keepAdding = true;


        // this will keep looping until the keep adding boolean is false.
        do {

            double radius = input.getDouble("Enter the radius of the circle: ");

            Circle userCircle = new Circle(radius);

            userCircle.displayData();

            keepAdding =  input.yesNo("Do you want to keep adding circles? "); // keep adding changes to false if anything but y or yes is input

        } while(keepAdding);


        // Total circles
        System.out.println("Total Circles: " + Circle.total());





    }

}