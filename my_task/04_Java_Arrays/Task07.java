// Task 07: Reverse an array without using built-in methods
public class Task07 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 8, 19, 7, 2};
        int left = 0, right = numbers.length - 1;

        while (left < right) {
            int temp = numbers[left];
            numbers[left] = numbers[right];
            numbers[right] = temp;
            left++;
            right--;
        }

        System.out.print("Reversed array: ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
