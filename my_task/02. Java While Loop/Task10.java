import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        while (true) {
            System.out.println("Menu: 1.Add 2.Subtract 3.Multiply 4.Divide 5.Exit");
            System.out.print("Enter choice: ");
            choice = input.nextInt();
            if (choice == 5) {
                System.out.println("Exiting...");
                break;
            }
            System.out.print("Enter first number: ");
            double a = input.nextDouble();
            System.out.print("Enter second number: ");
            double b = input.nextDouble();
            switch (choice) {
                case 1: System.out.println("Result: " + (a + b)); break;
                case 2: System.out.println("Result: " + (a - b)); break;
                case 3: System.out.println("Result: " + (a * b)); break;
                case 4: System.out.println("Result: " + (a / b)); break;
                default: System.out.println("Invalid choice");
            }
        }
        input.close();
    }
}
