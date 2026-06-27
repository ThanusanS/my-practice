// Task 07: Find duplicate elements in an array
public class Task07 {
    public static void main(String[] args) {
        int[] numbers = {4, 17, 6, 9, 4, 11, 6, 17};

        System.out.print("Duplicate elements: ");
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] == numbers[j]) {
                    System.out.print(numbers[i] + " ");
                    break;
                }
            }
        }
        System.out.println();
    }
}
