// Book class - Encapsulation + extends LibraryItem + implements Borrowable
public class Book extends LibraryItem implements Borrowable {

    // Private attributes (Encapsulation)
    private int bookId;
    private String title;
    private String author;
    private double price;

    // Getters and Setters
    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }

    public String getTitle() { return title; }
    public void setTitle(String title) { this.title = title; }

    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }

    public double getPrice() { return price; }
    public void setPrice(double price) { this.price = price; }

    // Overriding abstract method from LibraryItem (Abstraction + Polymorphism)
    @Override
    public void displayInfo() {
        System.out.println("Book ID  : " + bookId);
        System.out.println("Title    : " + title);
        System.out.println("Author   : " + author);
        System.out.println("Price    : " + price);
    }

    // Implementing Borrowable interface
    @Override
    public void borrowItem() {
        System.out.println("Book \"" + title + "\" has been borrowed.");
    }

    @Override
    public void returnItem() {
        System.out.println("Book \"" + title + "\" has been returned.");
    }
}
