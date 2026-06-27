// Librarian class - extends Person (Inheritance)
public class Librarian extends Person {

    String employeeId;

    public Librarian(String name, int age, String employeeId) {
        super(name, age);
        this.employeeId = employeeId;
    }

    public void displayLibrarianInfo() {
        displayPersonInfo();
        System.out.println("Employee ID : " + employeeId);
    }
}
