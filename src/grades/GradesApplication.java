package grades;

import java.util.*;

public class GradesApplication {

    public static void outputStudentInfo(String userInput, HashMap<String, Student> students){
        if (students.containsKey(userInput)){
            ArrayList<Integer> grades = students.get(userInput).getGrades();
            System.out.printf("Name: %s - GitHub Username: %s%n", students.get(userInput).getName() , userInput);
            System.out.printf("Current Average: %.2f%n", students.get(userInput).getGradeAverage());
            System.out.println("Grades:");
            for(int i = 0; i < grades.size(); i++){
                if (i == grades.size() -1){
                    System.out.println(grades.get(i));
                } else {
                    System.out.print(grades.get(i) + ", ");
                }
            }
        } else {
            System.out.println("Sorry, no student found with username " + userInput);
        }
    }

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student joe = new Student("Joe");
        joe.addGrade(75);
        joe.addGrade(85);
        joe.addGrade(95);
        students.put("Joe845", joe);

        Student olivia = new Student("Olivia");
        olivia.addGrade(100);
        olivia.addGrade(78);
        olivia.addGrade(84);
        students.put("Codelivia", olivia);

        Student mateo = new Student("Mateo");
        mateo.addGrade(94);
        mateo.addGrade(68);
        mateo.addGrade(90);
        students.put("Mateo2022", mateo);

        Student emma = new Student("Emma");
        emma.addGrade(79);
        emma.addGrade(84);
        emma.addGrade(89);
        students.put("EmmaWhatever", emma);

        System.out.println("Welcome!");
        System.out.println("");
        System.out.println("Here are the GitHub usernames of our students:");
        System.out.println("");

        Set<String> gitHubUserNames = students.keySet();
        for (String gitHubUserName : gitHubUserNames){
            System.out.printf(" |%s| ", gitHubUserName);
        }
        System.out.printf("%n%n");
        System.out.println("1 View individual student grades");
        System.out.println("2 View all student grades");
        Scanner scanner = new Scanner(System.in);
        String userSelection = scanner.nextLine();

        if (userSelection.equals("1")){
            System.out.println("What student would you like to see more information on?");
            System.out.println("");

            String userInput = scanner.nextLine();

            outputStudentInfo(userInput, students);

            while(true){
                System.out.println("Would you like to see another student?");
                System.out.println("");
                String userChoice = scanner.nextLine();
                if (userChoice.equalsIgnoreCase("no") || userChoice.equalsIgnoreCase("n")){
                    System.out.println("Goodbye, and have a wonderful day!");
                    break;
                } else {
                    System.out.println("What student would you like to see more information on?");
                    System.out.println("");
                    userInput = scanner.nextLine();
                    outputStudentInfo(userInput, students);
                }
            }
        } else {
            Object[] listOfStudents = students.values().toArray();
            for (Object student : listOfStudents){
                System.out.println(((Student) student).getName());
                ArrayList<Integer> studentGrades = ((Student) student).getGrades();
                for (int i = 0; i < studentGrades.size(); i++){
                    if (i == studentGrades.size()-1){
                        System.out.println(studentGrades.get(i));
                    } else {
                        System.out.print(studentGrades.get(i) + ",");
                    }
                }
            }
        }
    }
}
