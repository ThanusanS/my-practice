// Car class - extends Vehicle and implements FuelEfficiency
public class Car extends Vehicle implements FuelEfficiency {

    @Override
    public void start() {
        System.out.println("Car engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Car engine stopped.");
    }

    @Override
    public void calculateMileage() {
        System.out.println("Car mileage: 15 km per litre.");
    }
}
