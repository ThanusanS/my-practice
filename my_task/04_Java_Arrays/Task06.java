// Task 06: Search for a specific element in an array
public class Task06 {
    public static void main(String[] args) {
        int[] numbers = {5, 12, 3, 8, 19, 7, 2};
        int target = 8;
        boolean found = false;
        int foundIndex = -1;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == target) {
                found = true;
                foundIndex = i;
                break;
            }
        }

        if (found) {
            System.out.println(target + " found at index " + foundIndex);
        } else {
            System.out.println(target + " not found in the array");
        }
    }
}
