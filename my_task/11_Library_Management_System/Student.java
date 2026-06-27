// Student class - extends Person, implements Borrowable (Inheritance + Interface)
public class Student extends Person implements Borrowable {

    String studentId;

    public Student(String name, int age, String studentId) {
        super(name, age);
        this.studentId = studentId;
    }

    @Override
    public void borrowItem() {
        System.out.println("Student " + name + " borrowed a book.");
    }

    @Override
    public void returnItem() {
        System.out.println("Student " + name + " returned a book.");
    }

    public void displayStudentInfo() {
        displayPersonInfo();
        System.out.println("Student ID : " + studentId);
    }
}
