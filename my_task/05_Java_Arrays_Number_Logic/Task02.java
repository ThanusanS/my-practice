// Task 02: Find the smallest element in an array
public class Task02 {
    public static void main(String[] args) {
        int[] numbers = {4, 17, 6, 9, 23, 11, 1};
        int smallest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] < smallest) {
                smallest = numbers[i];
            }
        }

        System.out.println("Smallest element: " + smallest);
    }
}
