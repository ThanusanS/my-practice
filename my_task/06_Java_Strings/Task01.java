// Task 01: Reverse a given string without using built-in reverse methods
public class Task01 {
    public static void main(String[] args) {
        String input = "HelloWorld";
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        System.out.println("Original string: " + input);
        System.out.println("Reversed string: " + reversed);
    }
}
