// Task 04: Find the first non-repeated character in a string
public class Task04 {
    public static void main(String[] args) {
        String input = "programming";
        char result = '\0';

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            int count = 0;

            for (int j = 0; j < input.length(); j++) {
                if (input.charAt(j) == ch) {
                    count++;
                }
            }

            if (count == 1) {
                result = ch;
                break;
            }
        }

        if (result != '\0') {
            System.out.println("First non-repeated character: " + result);
        } else {
            System.out.println("No non-repeated character found");
        }
    }
}
