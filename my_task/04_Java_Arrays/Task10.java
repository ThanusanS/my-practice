// Task 10: Rotate an array to the right by one position
public class Task10 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 8, 19, 7, 2};
        int lastElement = numbers[numbers.length - 1];

        for (int i = numbers.length - 1; i > 0; i--) {
            numbers[i] = numbers[i - 1];
        }
        numbers[0] = lastElement;

        System.out.print("Rotated array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
