package InterfacesAndAbstractClasses;

public class Microwave extends Appliance implements MakesFood {

    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void produceFood() {
        System.out.println("Warming up your food!");
    }
}
