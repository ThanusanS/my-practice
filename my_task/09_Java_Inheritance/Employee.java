// Parent class: Employee
public class Employee {

    // Fields
    String name;
    int id;

    // Constructor
    public Employee(String name, int id) {
        this.name = name;
        this.id = id;
    }

    // Method to display employee info
    public void displayInfo() {
        System.out.println("Employee Name : " + name);
        System.out.println("Employee ID   : " + id);
    }
}
