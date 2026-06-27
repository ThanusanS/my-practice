// Main class to demonstrate Inheritance
public class Main {
    public static void main(String[] args) {

        // FullTimeEmployee object
        FullTimeEmployee fullTime = new FullTimeEmployee("Thanu", 201, 75000);
        System.out.println("=== Full-Time Employee ===");
        fullTime.displayInfo();
        fullTime.calculateSalary();

        System.out.println();

        // PartTimeEmployee object
        PartTimeEmployee partTime = new PartTimeEmployee("Nila", 202, 80, 500);
        System.out.println("=== Part-Time Employee ===");
        partTime.displayInfo();
        partTime.calculateSalary();
    }
}
