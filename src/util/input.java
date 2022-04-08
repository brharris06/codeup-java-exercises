package util;

import java.util.Scanner;

public class Input {
    private Scanner input; // scanner object, lets us take inputs in

    public Input () {
        input = new Scanner(System.in); // creates a new instance of scanner
    }

    public String getString() {
        return input.nextLine();
    }

    public boolean yesNo() {
        input.nextLine(); //clear prevents next line issues from auto moving to input
        String userInput = getString();

        // returns true or false if values meet criteria for either
        // using or conditional.
        return (
                userInput.equalsIgnoreCase("y")
                        ||
                        userInput.equalsIgnoreCase("yes")
        );
    }


    public boolean yesNo(String prompt) {
        System.out.print(prompt);
        return yesNo(); // calling itself and using method overloading to call the other version of itself
    }

    public int getInt() {

        try { // use try catch to handle exceptions that would otherwise crash this application.
            int inputInt = input.nextInt();
            return inputInt;

        } catch (Exception e) {
            System.out.println("Must enter a valid integer: ");
            input.nextLine(); //ensures that the scanner doesent loop thinking its not a newline on catch block
            return getInt();
        }

    }

    public int getInt(String prompt) {
        System.out.println(prompt);
        return getInt();
    }

    public int getInt(int min, int max) {
        int userInt = getInt();

        if(userInt > max || userInt < min) {
            return getInt(min, max);
        }

        return userInt;

    }

    public int getInt(String prompt, int min, int max) {
        System.out.println(prompt + " between " + min + " and " + max + ": ");
        return getInt(min, max);
    }
    //
//
    public double getDouble () {
        try {
            double userInput = input.nextDouble();
            return userInput;
        } catch (Exception e) {
            System.out.println("Must enter a valid double: ");
            input.nextLine();
            return getDouble();
        }

    }

    public double getDouble (String prompt) {
        System.out.println(prompt);
        return getDouble();
    }
    //
    public double getDouble(double min, double max) {
        System.out.println("Please input a number between " + min + " and " + max + ": ");

        double userInput = getDouble(); // this double already handles the error handling.

        if(userInput > max || userInput < min) {
            return getDouble(min,max);
        }

        return userInput;

    }



}
