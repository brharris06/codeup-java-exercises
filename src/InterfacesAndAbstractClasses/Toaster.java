package InterfacesAndAbstractClasses;

public class Toaster extends Appliance implements MakesFood{
    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public void produceFood() {
        System.out.println("Heating up bread.");
    }
}