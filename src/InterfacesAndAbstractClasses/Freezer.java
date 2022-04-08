package InterfacesAndAbstractClasses;

public class Freezer extends Appliance implements StoresFood {

    @Override
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    }

    public void keepFresh() {
        System.out.println("Keeping your food below zero!");
    }
}
