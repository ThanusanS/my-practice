// Child class: PartTimeEmployee (inherits from Employee)
public class PartTimeEmployee extends Employee {

    // Additional fields
    int hoursWorked;
    double hourlyRate;

    // Constructor
    public PartTimeEmployee(String name, int id, int hoursWorked, double hourlyRate) {
        super(name, id);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Method to calculate salary based on hours worked x hourly rate
    public void calculateSalary() {
        double totalSalary = hoursWorked * hourlyRate;
        System.out.println("Hours Worked  : " + hoursWorked);
        System.out.println("Hourly Rate   : " + hourlyRate);
        System.out.println("Total Salary  : " + totalSalary);
    }
}
