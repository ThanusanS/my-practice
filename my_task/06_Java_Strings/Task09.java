// Task 09: Reverse the order of words in a sentence without reversing the words themselves
public class Task09 {
    public static void main(String[] args) {
        String sentence = "Java is fun to learn";
        String[] words = sentence.split(" ");
        String result = "";

        for (int i = words.length - 1; i >= 0; i--) {
            result += words[i];
            if (i != 0) {
                result += " ";
            }
        }

        System.out.println("Original sentence: " + sentence);
        System.out.println("Reversed word order: " + result);
    }
}
