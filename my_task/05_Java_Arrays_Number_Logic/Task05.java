// Task 05: Print array elements in reverse order
public class Task05 {
    public static void main(String[] args) {
        int[] numbers = {4, 17, 6, 9, 23, 11, 1};

        System.out.print("Array in reverse order: ");
        for (int i = numbers.length - 1; i >= 0; i--) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
