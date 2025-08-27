import java.util.Scanner;

public class WordLength2D {

    // Method to find length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count); // will throw exception at end
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split string into words without using split()
    public static String[] splitWords(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        // Count spaces to find word count
        for (int i = 0; i < length; i++) {
            if (text.charAt(i) == ' ') {
                spaceCount++;
            }
        }
        int wordCount = spaceCount + 1;

        String[] words = new String[wordCount];
        String currentWord = "";
        int index = 0;

        for (int i = 0; i < length; i++) {
            if (text.charAt(i) != ' ') {
                currentWord += text.charAt(i);
            } else {
                words[index] = currentWord;
                currentWord = "";
                index++;
            }
        }
        words[index] = currentWord; // last word

        return words;
    }

    // Method to create 2D array of word and its length
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i])); // store length as String
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take user input
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        // Split into words
        String[] words = splitWords(text);

        // Create 2D array with lengths
        String[][] wordsWithLengths = getWordsWithLength(words);

        // Display result in table
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            System.out.println(wordsWithLengths[i][0] + "\t" + Integer.parseInt(wordsWithLengths[i][1]));
        }

        sc.close();
    }
}
