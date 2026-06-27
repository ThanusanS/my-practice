// Task 06: Check whether two strings are anagrams of each other
public class Task06 {
    public static void main(String[] args) {
        String str1 = "listen";
        String str2 = "silent";
        boolean isAnagram = true;

        if (str1.length() != str2.length()) {
            isAnagram = false;
        } else {
            int[] charCount = new int[256];

            for (int i = 0; i < str1.length(); i++) {
                charCount[str1.charAt(i)]++;
                charCount[str2.charAt(i)]--;
            }

            for (int i = 0; i < 256; i++) {
                if (charCount[i] != 0) {
                    isAnagram = false;
                    break;
                }
            }
        }

        if (isAnagram) {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are Anagrams");
        } else {
            System.out.println("\"" + str1 + "\" and \"" + str2 + "\" are not Anagrams");
        }
    }
}
