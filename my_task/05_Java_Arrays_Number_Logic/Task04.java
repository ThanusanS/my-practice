// Task 04: Reverse an array
public class Task04 {
    public static void main(String[] args) {
        int[] numbers = {4, 17, 6, 9, 23, 11, 1};
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
