package InterfacesAndAbstractClasses;

abstract class Appliance {
    protected String brandName;

    public Appliance(){}

    public Appliance(String type, String brandName) {
        this.brandName = brandName;
    }

    public String getBrandName() {
        return brandName;
    }
    // Can be abstract, but would need to be defined in every subsequent class
    public void setBrandName(String brandName) {
        this.brandName = brandName;
    };
}