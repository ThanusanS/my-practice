import java.util.Scanner;
public class Task09 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = input.nextInt();
        int a = 0, b = 1, count = 1;
        while (count <= n) {
            System.out.print(a + " ");
            int next = a + b;
            a = b;
            b = next;
            count++;
        }
        System.out.println();
        input.close();
    }
}
