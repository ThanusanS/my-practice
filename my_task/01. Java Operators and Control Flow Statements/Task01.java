import java.util.Scanner;
public class Task01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = input.nextDouble();
        System.out.print("Enter second number: ");
        double b = input.nextDouble();
        System.out.println("Sum: " + (a + b));
        System.out.println("Difference: " + (a - b));
        System.out.println("Product: " + (a * b));
        System.out.println("Division: " + (a / b));
        input.close();
    }
}
