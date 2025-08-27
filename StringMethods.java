import java.util.Scanner;

public class StringMethods {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Ask for full name
        System.out.print("Enter your full name: ");
        String fullName = sc.nextLine();

        // Ask for favorite programming language
        System.out.print("Enter your favorite programming language: ");
        String favLang = sc.nextLine();

        // Ask for a sentence about programming experience
        System.out.print("Write a line about your coding experience: ");
        String experience = sc.nextLine();

        // 1. Extract first and last name
        String[] nameParts = fullName.trim().split("\\s+");
        String firstName = nameParts[0];
        String lastName = nameParts[nameParts.length - 1];

        // 2. Count total characters excluding spaces
        int charCount = 0;
        for (int i = 0; i < experience.length(); i++) {
            if (experience.charAt(i) != ' ') {
                charCount++;
            }
        }

        // 3. Convert programming language to uppercase
        String upperLang = favLang.toUpperCase();

        // 4. Display summary
        System.out.println("\n--- Summary ---");
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Favorite Language (UPPERCASE): " + upperLang);
        System.out.println("Total Characters in Experience (no spaces): " + charCount);

        sc.close();
    }
}
