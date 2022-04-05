public class Person {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public void sayHello(){
        System.out.println(name + " says Hello!");
    }

    public String toString(){
        return name;
    }
}