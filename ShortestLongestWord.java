import java.util.Scanner;

public class ShortestLongestWord {

    // Method to find length of a string without using length()
    public static int findLength(String str) {
        int count = 0;
        try {
            while (true) {
                str.charAt(count);
                count++;
            }
        } catch (StringIndexOutOfBoundsException e) {
            return count;
        }
    }

    // Method to split text into words without using split()
    public static String[] splitWords(String text) {
        int length = findLength(text);
        int spaceCount = 0;

        // Count spaces to know word count
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

    // Method to make 2D array of word and its length
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }
        return result;
    }

    // Method to find shortest and longest words
    public static int[] findShortestAndLongest(String[][] wordsWithLength) {
        int shortestIndex = 0;
        int longestIndex = 0;

        for (int i = 1; i < wordsWithLength.length; i++) {
            int currentLength = Integer.parseInt(wordsWithLength[i][1]);
            int shortestLength = Integer.parseInt(wordsWithLength[shortestIndex][1]);
            int longestLength = Integer.parseInt(wordsWithLength[longestIndex][1]);

            if (currentLength < shortestLength) {
                shortestIndex = i;
            }
            if (currentLength > longestLength) {
                longestIndex = i;
            }
        }
        return new int[]{shortestIndex, longestIndex};
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Take input
        System.out.println("Enter a sentence:");
        String text = sc.nextLine();

        // Step 2: Split into words
        String[] words = splitWords(text);

        // Step 3: Make 2D array with word and length
        String[][] wordsWithLengths = getWordsWithLength(words);

        // Step 4: Find shortest and longest
        int[] indexes = findShortestAndLongest(wordsWithLengths);

        // Step 5: Display all words with lengths
        System.out.println("\nWord\tLength");
        System.out.println("----------------");
        for (int i = 0; i < wordsWithLengths.length; i++) {
            System.out.println(wordsWithLengths[i][0] + "\t" + wordsWithLengths[i][1]);
        }

        // Step 6: Display shortest and longest
        System.out.println("\nShortest Word: " + wordsWithLengths[indexes[0]][0] +
                " (Length: " + wordsWithLengths[indexes[0]][1] + ")");
        System.out.println("Longest Word: " + wordsWithLengths[indexes[1]][0] +
                " (Length: " + wordsWithLengths[indexes[1]][1] + ")");

        sc.close();
    }
}
