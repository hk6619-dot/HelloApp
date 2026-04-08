/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloApp UC4. It accepts zero or more command-line arguments and prints a greeting.
 * It uses an enhanced for loop (for-each loop) to process multiple names.
 *
 * UC 5: Display "Hello" with Multiple Command-Line Arguments using Enhanced For Loop or Default Message
 *
 * @author HK
 * @version 5.0
 * @since UC4
 */
public class HelloApp {

    public static void main(String[] args) {

        // Array Length Check: Detect missing arguments
        if (args.length == 0) {
            // Default Handling: Graceful fallback when no arguments are provided
            System.out.println("Hello, World!");
        } else {
            // StringBuilder: Efficient concatenation
            StringBuilder namesList = new StringBuilder();

            // Enhanced For Loop: Iterate through all arguments
            for (String name : args) {
                // Conditional Delimiter Logic: Avoid leading comma
                if (namesList.length() > 0) {
                    namesList.append(", ");
                }
                namesList.append(name);
            }

            // String Concatenation: Build the final greeting message
            System.out.println("Hello, " + namesList.toString() + "!");
        }
    }
}