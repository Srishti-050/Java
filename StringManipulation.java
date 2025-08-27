public class StringManipulation {
    public static void main(String[] args) {
        // Create string using different methods

        // Using string literal
        String line = "Java Programming";

        // Using string constructor
        String line2 = new String("Java Programming");

        // Using character array
        char[] line3 = {'J','a','v','a',' ','P','r','o','g','r','a','m','m','i','n','g'};
        String fromline = new String(line3);

        // Comparing strings

        // == checks memory location
        System.out.println("Comparing line and line2 using == : " + (line == line2));

        // .equals() checks content
        System.out.println("Comparing line and line2 using .equals(): " + line.equals(line2));
        System.out.println("Comparing line and fromline using .equals(): " + line.equals(fromline));

        // Printing string with escape sequences
        System.out.println("Programming Quote:\n\"Code is Poetry\" - Unknown");
        System.out.println("Path: C:\\Java\\Projects");
    }
}
