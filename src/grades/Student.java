package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    private ArrayList<Integer> grades;

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrades() {
        return grades;
    }


    public void addGrade(int grade){
        grades.add(grade);
    }

    public double getGradeAverage(){
        double total = 0;
        for (Integer grade : grades){
            total += grade;
        }
        return total/grades.size();
    }

    public Student(String name){
        this.name = name;
        this.grades = new ArrayList<>();
    }
}
