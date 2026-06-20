import java.util.Scanner;
public class Task10 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");
        double a = input.nextDouble();
        System.out.print("Enter second number: ");
        double b = input.nextDouble();
        System.out.print("Enter operator (+,-,*,/): ");
        char op = input.next().charAt(0);
        double result = 0;
        switch (op) {
            case '+': result = a + b; break;
            case '-': result = a - b; break;
            case '*': result = a * b; break;
            case '/': result = a / b; break;
            default: System.out.println("Invalid operator");
        }
        System.out.println("Result: " + result);
        input.close();
    }
}
