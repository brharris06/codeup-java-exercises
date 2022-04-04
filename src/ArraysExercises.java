import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] persons, Person n00b){
        Person[] newBiggerArray = new Person[persons.length +1];
        for(int i = 0; i < persons.length; i++){
            newBiggerArray[i] = persons[i];
        }
        newBiggerArray[newBiggerArray.length -1] = n00b;
        return newBiggerArray;
    }

    public static Person[] addPersonWithCopyOf(Person[] persons, Person n00b){
        Person[] newPersonArray;
        newPersonArray = Arrays.copyOf(persons, persons.length + 1);
        newPersonArray[newPersonArray.length -1] = n00b;
        return newPersonArray;
    }



    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person[] persons = new Person[3];
        persons[0] = new Person("Justin");
        persons[1] = new Person("Dane");
        persons[2] = new Person("Javier");

//        for (Person person : persons) {
//            System.out.println(person.getName());
//        }

        Person[] newPersonsArray = ArraysExercises.addPersonWithCopyOf(persons, new Person("Jay"));
        for(Person person: newPersonsArray){
            person.sayHello();
        }
        System.out.println(Arrays.toString(newPersonsArray));
    }
}