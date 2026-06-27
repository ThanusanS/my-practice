// Task 10: Check whether a number is Palindrome
public class Task10 {
    public static void main(String[] args) {
        int number = 121;
        int original = number;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }

        if (original == reversed) {
            System.out.println(original + " is a Palindrome number");
        } else {
            System.out.println(original + " is not a Palindrome number");
        }
    }
}
