import java.util.Scanner;
public class Task06 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter marks: ");
        int marks = input.nextInt();
        if (marks >= 40) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        input.close();
    }
}
