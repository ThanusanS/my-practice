// Task 01: Find the largest element in an array
public class Task01 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 8, 19, 7, 2};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }
}
