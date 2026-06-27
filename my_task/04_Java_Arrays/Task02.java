// Task 02: Find the smallest element in an array
public class Task02 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 8, 19, 7, 2};
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
    }
}
