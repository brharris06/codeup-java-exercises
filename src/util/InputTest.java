
package util;


public class InputTest {

    public static void main(String[] args) {

        Input input = new Input();

        // We expect the user to have to type in yes or y to get true
        //     System.out.println("input = " + input.yesNo());


//        System.out.println("input.getInt = " + input.getInt());

//        System.out.println("input = " + input.getInt(5, 10));


//        System.out.println("input.getDouble() = " + input.getDouble());
//        System.out.println("input.getDouble() = " + input.getDouble(10.23, 19.98234333));


//        System.out.println(input.yesNo("Are you a programmer?"));

        System.out.println(input.getInt("Whats your favorite number",5,100));
    }


}
