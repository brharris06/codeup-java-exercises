package InterfacesAndAbstractClasses;

public class IceChest implements StoresFood {

    @Override
    public void keepFresh() {
        System.out.println("Keeping your drinks and food cold or warm.");
    }
}