package InterfacesAndAbstractClasses;

public class Refrigerator extends Appliance implements StoresFood, MakesFood{
    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    @Override
    public void produceFood() {
        System.out.println("Have some ice!");
    }

    @Override
    public void keepFresh() {
        System.out.println("Keeping your items at a steady 38 degrees.");
    }
}