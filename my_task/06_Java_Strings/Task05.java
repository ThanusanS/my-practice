// Task 05: Find all duplicate characters and their occurrence counts
public class Task05 {
    public static void main(String[] args) {
        String input = "programming";
        boolean[] visited = new boolean[256];

        System.out.println("Duplicate characters and their counts:");

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!visited[ch]) {
                int count = 0;
                for (int j = i; j < input.length(); j++) {
                    if (input.charAt(j) == ch) {
                        count++;
                    }
                }
                if (count > 1) {
                    System.out.println("'" + ch + "' appears " + count + " times");
                }
                visited[ch] = true;
            }
        }
    }
}
