// Task 08: Remove duplicate elements from an array
public class Task08 {
    public static void main(String[] args) {
        int[] numbers = {4, 17, 6, 9, 4, 11, 6, 17};
        int[] temp = new int[numbers.length];
        int count = 0;

        for (int i = 0; i < numbers.length; i++) {
            boolean isDuplicate = false;
            for (int j = 0; j < count; j++) {
                if (numbers[i] == temp[j]) {
                    isDuplicate = true;
                    break;
                }
            }
            if (!isDuplicate) {
                temp[count] = numbers[i];
                count++;
            }
        }

        System.out.print("Array without duplicates: ");
        for (int i = 0; i < count; i++) {
            System.out.print(temp[i] + " ");
        }
        System.out.println();
    }
}
