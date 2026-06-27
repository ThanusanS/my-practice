// Task 01: Find the largest element in an array
public class Task01 {
    public static void main(String[] args) {
        int[] numbers = {4, 17, 6, 9, 23, 11, 1};
        int largest = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }

        System.out.println("Largest element: " + largest);
    }
}
