// Bike class - extends Vehicle and implements FuelEfficiency
public class Bike extends Vehicle implements FuelEfficiency {

    @Override
    public void start() {
        System.out.println("Bike engine started.");
    }

    @Override
    public void stop() {
        System.out.println("Bike engine stopped.");
    }

    @Override
    public void calculateMileage() {
        System.out.println("Bike mileage: 40 km per litre.");
    }
}
