import java.util.TreeMap;

public class SyntaxTypesAndVariablesLecture {

    public static void main(String[] args) {

        /**
         * statements
         */

        //
        System.out.println("this is a statement!");


        /**
         * Data Types
         */


        /**
         *         byte	    1	Very short integers from -128 to 127
         *         short	2	Short integers from -32,768 to 32,767
         *         int	    4	Integers from -2,147,483,648 to 2,147,483,647
         *         long	    8	Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
         *         float	4	Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits
         *         double	8	Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits
         *         char	    2	A single Unicode character that’s stored in two bytes
         *         boolean	1	A true or false value
         */


        // Variables
        /**
         * Must be defined before you can use them.
         *
         *  - Start w/ letter, underscore or dollar sign (java)
         *  - consist of letters, and underscores and digits.
         *  - but cant be more than 255 characters
         *
         *  intatiate when assigned value
         */


        /**
         * Casting
         *
         * JS -> parseInt() -> type cohersion ==== casting
         *
         * TWO Types:
         *
         *  Implicit - Imply, based on the situation. clearly
         *
         *  Explicit - TELLING the app that its specifically needs to change the data type
         *
         */


//  /*          *         byte	    1	Very short integers from -128 to 127

        byte myBite = 127;

        System.out.println("myBite = " + myBite);

//                *         short	2	Short integers from -32,768 to 32,767

        short myShort = -31000;

        System.out.println("myShort = " + myShort);

        myShort = 20000;

        System.out.println("myShort = " + myShort);

//                *         int	    4	Integers from -2,147,483,648 to 2,147,483,647

        int myInt = myShort; //implicit.

        System.out.println("myInt = " + myInt);

        myInt = (int) myBite; // explicit

        System.out.println("myInt = " + myInt);


        long myNewLong = 1234567890123456789L;

        myInt = (int) myNewLong;

        System.out.println("myInt = " + myInt);

//                *         long	    8	Long integers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807

        long myLong = 100_000_000;

        System.out.println("myLong = " + myLong);


//         *         float	4	Single-precision, floating-point numbers from -3.4E38 to 3.4E38 with up to 7 significant digits

        // Decimal value

        float myFloat = 1.234567890123F;
        //myFloat = 1.2345679 -> 7 digits of precion.
        System.out.println("myFloat = " + myFloat);

        myFloat = (float) myLong;

        System.out.println("myFloat = " + myFloat);

//         *         double	8	Double-precision, floating-point numbers from -1.7E308 to 1.7E308 with up to 16 significant digits

        double myDouble = 10.12122345352D;
        double myOtherDouble = 11.1234234234D;
        //myFloat = 11.123424
        System.out.println("myDouble = " + myDouble);

        myDouble = myFloat;
        System.out.println("myDouble = " + myDouble);

        myFloat = (float) myOtherDouble;

        System.out.println("myFloat = " + myFloat);

//         *         char	    2	A single Unicode character that’s stored in two bytes

        char myChar = 'C';

        // myChar = (char) "String"; //java: incompatible types: java.lang.String cannot be converted to char;




//                *         boolean	1	A true or false valu*/

        // in js = boolean  =  true or false (1 or 0)

        boolean isTrue = true;

        System.out.println("isTrue = " + isTrue);

        isTrue = !isTrue;

        System.out.println("isTrue = " + isTrue);



        // Reference Data Types
        // default to null if not assigned anything.

        // String

        String myString = "Double Quotes!!!! For Strings";

        System.out.println("myString = " + myString);

        // Escaspe Characters
        myString  = "  \"  Hello   \"  \\  ";

        System.out.println("myString = " + myString);

        /**
         * Reserved Keywords
         */

        // Certain words cant be used outside of the puropse they were defined by the
        // language for.


        // for continue, new, switch.....many more, class

        //long switch = 1232L;


        /**
         * Constants
         *
         * 1. Variable that can not change!
         * 2. Java uses a keyword called final
         * 3. Naming Conventions
         *  - 2 different ones:
         *      1. PascalCase => first Character is Cap.
         *      2. ALL CAPS! CONSTANT_NAME_IS_THIS;
         *
         */

        final int FINAL_VALUE = 11;
        System.out.println("FINAL_VALUE = " + FINAL_VALUE);

        final String FinalString = "First Letter Cap!";
        System.out.println("FinalString = " + FinalString);

        // can not change these values ever.

        /**
         * Arithmetic
         *
         * Operators are very similar to Javascript
         */

        int myValue = 10;

        System.out.println("myValue++ = " + myValue++);
        System.out.println("myValue = " + myValue); // current value
        System.out.println("++myValue = " + (++myValue)); // incrementing before


        int i = 10;
        int n = i++ % 5; // returns a remainder
        System.out.println("n = " + n); //


        int numberA = 100;
        int numberB = 10000000;

        long total =  (long) numberA * (long) numberB;

        System.out.println("total = " + total);


        // Statements require semicolon.
        // main method is how you start a java app
        // most operators are identical,
        // assigment of variables are similar to js
        // syntax is similar, semi-color like js, but required for JAVA.
        // single quotes  = single characters
        // double quotes = full string

        // assign a datatype in java, but not javascript!
        // implicit - implied by the context, but could be wrong?
        // explicit - clearly stated in your code. "convert this to that"

        //
        // System.out.println("total = " + total);

    }
}
