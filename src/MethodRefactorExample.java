import java.util.Scanner;

public class MethodRefactorExample {

    // public static String returnValue(int x, int y) {
    //     return "Do something!";
    // }
    //
    // public static int returnValue(int x) {
    //     return 7;
    // }
    //
    // public static void main(String[] args) {
    //     System.out.println(returnValue(2, 2));
    //     System.out.println(returnValue(329));
    // }
    //
    //
    //
    // public static void printThings() {
    //     System.out.println("Do something");
    // }
    //
    // public static void printThings(String s) {
    //     System.out.println(s);
    //     printThings();
    // }
    //
    // public static void printThings(String s1, String s2) {
    //     System.out.println(s1);
    //     System.out.println(s2);
    // }



    // public static void main(String[] args) {
    //     // printDoSomething();
    //     // printThings();
    //     // printThings("Something Else");
    //     printThings("Thing 1", "Thing 2");
    //     returnValue();
    // }


    public static void printEndMsgs() {
        System.out.println("Farewell!");
        System.out.println("You should run this again sometime.");
        System.out.println("Really.");
    }

    public static void printUserInfo(String userName, int userNum) {
        System.out.println("Your favorite number squared is: " + Math.pow(userNum, 2));
        System.out.println("Your favorite number cubed is: " + Math.pow(userNum, 3));
        if (userName.length() > userNum) {
            System.out.println("Your name is longer than your favorite number.");
        } else {
            System.out.println("Your name is shorter than your favorite number.");
        }
    }

    public static String getUsersName(Scanner sc) {
        System.out.println("Welcome! Please enter your name.");
        String userName = sc.nextLine();
        return userName;
    }

    public static int getUsersFavNum(Scanner sc) {
        System.out.println("Please enter your favorite number!");
        int userNum = Integer.parseInt(sc.nextLine());
        return userNum;
    }


    public static void init() {
        Scanner sc = new Scanner(System.in);
        String userName = getUsersName(sc);
        int userNum = getUsersFavNum(sc);
        printUserInfo(userName, userNum);
        printEndMsgs();
    }


    public static void main(String[] args) {
        init();
    }

}
