// Task: Java Constructors - Student class with Default, Parameterized, and Copy constructors

public class Student {

    // Attributes
    private int studentId;
    private String studentName;
    private String course;

    // Default Constructor - initializes with default values
    public Student() {
        studentId = 0;
        studentName = "Unknown";
        course = "Not Assigned";
    }

    // Parameterized Constructor - initializes with provided values
    public Student(int studentId, String studentName, String course) {
        this.studentId = studentId;
        this.studentName = studentName;
        this.course = course;
    }

    // Copy Constructor - creates a new object by copying another Student object
    public Student(Student other) {
        this.studentId = other.studentId;
        this.studentName = other.studentName;
        this.course = other.course;
    }

    // Method to display student details
    public void displayDetails() {
        System.out.println("Student ID   : " + studentId);
        System.out.println("Student Name : " + studentName);
        System.out.println("Course       : " + course);
        System.out.println("----------------------------");
    }

    // Main method
    public static void main(String[] args) {

        // Create student using default constructor
        Student student1 = new Student();
        System.out.println("Student 1 (Default Constructor):");
        student1.displayDetails();

        // Create student using parameterized constructor
        Student student2 = new Student(101, "Thanu", "HND Computer Science");
        System.out.println("Student 2 (Parameterized Constructor):");
        student2.displayDetails();

        // Create student using copy constructor
        Student student3 = new Student(student2);
        System.out.println("Student 3 (Copy Constructor - copied from Student 2):");
        student3.displayDetails();
    }
}
