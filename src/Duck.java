package birds;

import birds.Bird;

public class Duck extends Bird {
    public void makeNoise(){
        System.out.println("Quack quack");
    }

    public void setName(String duckName){
        super.name = duckName;
    }
}