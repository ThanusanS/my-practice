// Task 11: Check whether a number is Armstrong (using while loop)
public class Task11 {
    public static void main(String[] args) {
        int number = 153;
        int original = number;
        int sum = 0;

        // Count digits
        int digitCount = 0;
        int temp = number;
        while (temp != 0) {
            digitCount++;
            temp /= 10;
        }

        // Calculate sum of digits raised to the power of digitCount
        temp = number;
        while (temp != 0) {
            int digit = temp % 10;
            int power = 1;
            for (int i = 0; i < digitCount; i++) {
                power *= digit;
            }
            sum += power;
            temp /= 10;
        }

        if (sum == original) {
            System.out.println(original + " is an Armstrong number");
        } else {
            System.out.println(original + " is not an Armstrong number");
        }
    }
}
