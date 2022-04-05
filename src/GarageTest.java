package vehicles;

public class GarageTest {
    public static void main(String[] args) {
        Car lexus = new Car();
        lexus.setName("Lexus");
        Car lambo = new Car();
        lambo.setName("Lambo");
        Car ferrari = new Car();
        ferrari.setName("Ferrari");
//
        Vehicle[] carsInTheGarage = new Vehicle[3];
        carsInTheGarage[0] = lexus;
        carsInTheGarage[1] = lambo;
        carsInTheGarage[2] = ferrari;
        Garage garage = new Garage();
        garage.vehicles = carsInTheGarage;
        garage.alarmCascade();
//    carsInTheGarage[0] = lexus;
//    carsInTheGarage[1] = lambo;
////        carsInTheGarage[2] = ferrari;
    }

}
