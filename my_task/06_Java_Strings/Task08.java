// Task 08: Count the frequency of each character in a string
public class Task08 {
    public static void main(String[] args) {
        String input = "hello";
        boolean[] visited = new boolean[256];

        System.out.println("Character frequencies:");

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (!visited[ch]) {
                int count = 0;
                for (int j = 0; j < input.length(); j++) {
                    if (input.charAt(j) == ch) {
                        count++;
                    }
                }
                System.out.println("'" + ch + "' : " + count);
                visited[ch] = true;
            }
        }
    }
}
