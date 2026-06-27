// Task 07: Remove duplicate characters from a string while preserving order
public class Task07 {
    public static void main(String[] args) {
        String input = "programming";
        String result = "";
        boolean[] seen = new boolean[256];

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!seen[ch]) {
                result += ch;
                seen[ch] = true;
            }
        }

        System.out.println("Original string: " + input);
        System.out.println("After removing duplicates: " + result);
    }
}
