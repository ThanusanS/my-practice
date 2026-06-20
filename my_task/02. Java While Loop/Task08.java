import java.util.Scanner;
public class Task08 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = input.nextInt();
        int original = n;
        int reverse = 0;
        while (n != 0) {
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n /= 10;
        }
        if (original == reverse) {
            System.out.println("Palindrome");
        } else {
            System.out.println("Not a Palindrome");
        }
        input.close();
    }
}
