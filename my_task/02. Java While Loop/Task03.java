import java.util.Scanner;
public class Task03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter n: ");
        int n = input.nextInt();
        int i = 1, sum = 0;
        while (i <= n) {
            if (i % 2 == 0) {
                sum += i;
            }
            i++;
        }
        System.out.println("Sum of even numbers: " + sum);
        input.close();
    }
}
