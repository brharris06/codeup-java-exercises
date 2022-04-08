package grades;

public class StudentTest {
    public static void main(String[] args) {
        Student joe = new Student("Joe");
        joe.addGrade(75);
        joe.addGrade(85);
        joe.addGrade(95);
        System.out.println(joe.getGrades());
        System.out.println(joe.getGradeAverage());
    }
}
