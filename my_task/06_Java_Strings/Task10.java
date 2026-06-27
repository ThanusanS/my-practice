// Task 10: Find the longest word in a given sentence
public class Task10 {
    public static void main(String[] args) {
        String sentence = "Java is a powerful programming language";
        String[] words = sentence.split(" ");
        String longestWord = words[0];

        for (int i = 1; i < words.length; i++) {
            if (words[i].length() > longestWord.length()) {
                longestWord = words[i];
            }
        }

        System.out.println("Sentence: " + sentence);
        System.out.println("Longest word: " + longestWord);
    }
}
