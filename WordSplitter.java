import java.util.Scanner;

public class WordSplitter {

    // Method to find length without using length()
    public static int findLength(String str) {
        int count = 0;
        for (char c : str.toCharArray()) { // loop over characters
            count++;
        }
        return count;
    }

    // Method to split text into words manually
    public static String[] splitWordsManual(String text) {
        int length = findLength(text);

        // Count spaces to know number of words
        int wordCount = 1;
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                wordCount++;
            }
        }

        String[] words = new String[wordCount];
        String word = "";
        int index = 0;

        // Extract words
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                words[index] = word;
                index++;
                word = "";
            }
        }
        words[index] = word; // last word

        return words;
    }

    // Compare two string arrays
    public static boolean compareArrays(String[] arr1, String[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        for (int i = 0; i < arr1.length; i++) {
            if (!arr1[i].equals(arr2[i])) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a sentence: ");
        String text = sc.nextLine();

        // Built-in split method
        String[] builtIn = text.split(" ");

        // Manual split method
        String[] manual = splitWordsManual(text);

        // Compare
        boolean same = compareArrays(builtIn, manual);

        // Output results
        System.out.println("\nBuilt-in split result:");
        for (String w : builtIn) {
            System.out.println(w);
        }

        System.out.println("\nManual split result:");
        for (String w : manual) {
            System.out.println(w);
        }

        System.out.println("\nBoth results same? " + same);
    }
}
