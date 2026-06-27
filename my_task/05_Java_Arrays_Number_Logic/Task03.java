// Task 03: Count even and odd numbers in an array
public class Task03 {
    public static void main(String[] args) {
        int[] numbers = {4, 17, 6, 9, 23, 11, 2};
        int evenCount = 0, oddCount = 0;

        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Even count: " + evenCount);
        System.out.println("Odd count: " + oddCount);
    }
}
