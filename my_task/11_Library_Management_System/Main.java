// Main class - Library Management System demonstrating all OOP concepts
public class Main {
    public static void main(String[] args) {

        // --- Encapsulation: Using getters and setters ---
        Book book = new Book();
        book.setBookId(1001);
        book.setTitle("Java Programming");
        book.setAuthor("James Gosling");
        book.setPrice(1500.00);

        System.out.println("=== Book Details (Encapsulation) ===");
        System.out.println("Book ID : " + book.getBookId());
        System.out.println("Title   : " + book.getTitle());
        System.out.println("Author  : " + book.getAuthor());
        System.out.println("Price   : " + book.getPrice());

        System.out.println();

        // --- Abstraction + Polymorphism: LibraryItem reference pointing to Book ---
        System.out.println("=== Display Info (Abstraction + Polymorphism) ===");
        LibraryItem item = new Book();
        ((Book) item).setBookId(1002);
        ((Book) item).setTitle("Data Structures");
        ((Book) item).setAuthor("Mark Allen Weiss");
        ((Book) item).setPrice(1200.00);
        item.displayInfo();

        System.out.println();

        // --- Inheritance: Student and Librarian from Person ---
        Student student = new Student("Thanu", 22, "S-101");
        System.out.println("=== Student Info (Inheritance) ===");
        student.displayStudentInfo();

        System.out.println();

        Librarian librarian = new Librarian("Nila", 35, "L-201");
        System.out.println("=== Librarian Info (Inheritance) ===");
        librarian.displayLibrarianInfo();

        System.out.println();

        // --- Interface: Borrowable implemented by Student and Book ---
        System.out.println("=== Borrow and Return (Interface) ===");
        student.borrowItem();
        book.borrowItem();
        student.returnItem();
        book.returnItem();
    }
}
