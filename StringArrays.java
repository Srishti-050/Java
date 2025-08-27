public class StringArrays {

    // Method 1: Find the longest name
    public static String findLongestName(String[] names) {
        String longest = names[0]; // start with first name
        for (String name : names) {
            if (name.length() > longest.length()) {
                longest = name;
            }
        }
        return longest;
    }

    // Method 2: Count names starting with a given letter (case-insensitive)
    public static int countNamesStartingWith(String[] names, char letter) {
        int count = 0;
        char target = Character.toLowerCase(letter); // make lowercase for comparison
        for (String name : names) {
            if (Character.toLowerCase(name.charAt(0)) == target) {
                count++;
            }
        }
        return count;
    }

    // Method 3: Format names to "Last, First"
    public static String[] formatNames(String[] names) {
        String[] formatted = new String[names.length];
        for (int i = 0; i < names.length; i++) {
            String[] parts = names[i].split(" "); // split into first and last
            if (parts.length >= 2) {
                formatted[i] = parts[1] + ", " + parts[0];
            } else {
                formatted[i] = names[i]; // if no last name, keep as is
            }
        }
        return formatted;
    }

    public static void main(String[] args) {
        String[] students = {
            "John Smith",
            "Alice Johnson",
            "Bob Brown",
            "Carol Davis",
            "David Wilson"
        };

        // Test Method 1
        System.out.println("Longest name: " + findLongestName(students));

        // Test Method 2
        System.out.println("Names starting with 'D': " + countNamesStartingWith(students, 'D'));

        // Test Method 3
        String[] formatted = formatNames(students);
        System.out.println("Formatted names:");
        for (String name : formatted) {
            System.out.println(name);
        }
    }
}
