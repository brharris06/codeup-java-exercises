import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ExceptionsStudy {
    public String maybeAnInteger = "42";
    public String certainlyNotAnInteger = "I am NOT integer";


    public void askForAnInteger(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        String userInput = scanner.nextLine();

        try {
            int userInputInteger = Integer.parseInt(userInput, 2, 15, 15);
            System.out.println("The integer in your string is " + userInputInteger);
        } catch (NumberFormatException nfx){
            System.out.println("Uh oh, " + nfx.getMessage() + " there is no integer!");
        } catch (Exception ex){
            System.out.println("Dude, exception!");
        } finally {
            System.out.println("Thank you for using this complex and useful application.");
            System.out.println("Please come back and visit.");
        }
    }

    public void subListMaker(String sentence){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter an integer");
        int firstInt = scanner.nextInt();
        System.out.println("Please enter another integer");
        int secondInt = scanner.nextInt();
        System.out.println(sentence);
        ArrayList<String> wordArrayList = new ArrayList<String>();
        String[] stringArray = sentence.split(" ");
        for (String word : stringArray){
            wordArrayList.add(word);
        }
        try {
            List<String> shorterList =  wordArrayList.subList(firstInt, secondInt);
            String newSentence = String.join(" ", shorterList);
            System.out.println(newSentence);
        } catch (IllegalArgumentException iax){
            System.out.println("Seriously? Your endpoint indices are out of order");
        } catch (IndexOutOfBoundsException iobx){
            System.out.println("Index out of bounds!");
        }
    }

//    public void echoWord() throws IllegalArgumentException {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Say something");
//        String whatYouSaid = scanner.nextLine();
//        if (whatYouSaid.equals("curses")){
//            throw new IllegalArgumentException();
//        }
//        System.out.println(whatYouSaid);
//    }

    public void echoWordThrowCustomException() throws CusswordException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Say something");
        String whatYouSaid = scanner.nextLine();
        if (whatYouSaid.equals("curses")){
            throw new CusswordException("How dare you?");
        }
        System.out.println(whatYouSaid);
    }


}