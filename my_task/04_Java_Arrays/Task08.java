// Task 08: Find the second largest element in an array
public class Task08 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 8, 19, 7, 2};
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] > largest) {
                secondLargest = largest;
                largest = numbers[i];
            } else if (numbers[i] > secondLargest && numbers[i] != largest) {
                secondLargest = numbers[i];
            }
        }

        System.out.println("Second largest element: " + secondLargest);
    }
}
