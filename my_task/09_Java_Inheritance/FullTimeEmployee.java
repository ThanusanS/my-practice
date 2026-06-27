// Child class: FullTimeEmployee (inherits from Employee)
public class FullTimeEmployee extends Employee {

    // Additional field
    double monthlySalary;

    // Constructor
    public FullTimeEmployee(String name, int id, double monthlySalary) {
        super(name, id);
        this.monthlySalary = monthlySalary;
    }

    // Method to calculate and display salary
    public void calculateSalary() {
        System.out.println("Monthly Salary: " + monthlySalary);
    }
}
