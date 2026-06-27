// Main class - Vehicle Management System
public class Main {
    public static void main(String[] args) {

        // Car object
        Car car = new Car();
        System.out.println("=== Car ===");
        car.start();
        car.stop();
        car.calculateMileage();

        System.out.println();

        // Bike object
        Bike bike = new Bike();
        System.out.println("=== Bike ===");
        bike.start();
        bike.stop();
        bike.calculateMileage();
    }
}
