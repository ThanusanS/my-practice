import java.util.Scanner;
public class Task04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = input.nextInt();
        if (age >= 18) {
            System.out.println("Eligible for voting");
        } else {
            System.out.println("Not eligible for voting");
        }
        input.close();
    }
}
