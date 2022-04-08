package Birds;

public class Bird {
    final String CLASS = "Aves";

    // can it fly?
    private boolean canFly;

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isCanFly() {
        return canFly;
    }

    // what kind of bird is it?
    protected String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void makeNoise(){
        System.out.println("Tweet tweet");
    }

    public void move(){
        System.out.println("Flap flap");
    }

    public Bird(){
        System.out.println("A bird just got created.");
    }

    public Bird(String nameOfThisBird, boolean canItFly){
        this.name = nameOfThisBird;
        this.canFly = canItFly;
    }

    public String toString(){
        return this.name;
    }

    public final void uCantOverrideThis(){
        System.out.println("I cannot be overridden");
    }

//    public void letsTryToChangeTheClassName(){
//        this.CLASS = "birdyBirdyBirdy";
//    }
}
