/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloApp UC5. It accepts zero or more command-line arguments and prints a greeting.
 * It uses an enhanced for loop to process multiple names and the substring() method
 * to remove the trailing delimiter.
 *
 * UC 6: Display "Hello" with Multiple Command-Line Arguments using substring to Remove Trailing Delimiter
 *
 * @author HK
 * @version 6.0
 * @since UC5
 */
public class HelloApp {

    public static void main(String[] args) {

        // Array Length Check: Detect missing arguments
        if (args.length == 0) {
            // Default Handling: Graceful fallback when no arguments are provided
            System.out.println("Hello, World!");
        } else {
            // StringBuilder: Efficient string construction
            StringBuilder namesList = new StringBuilder();

            // Enhanced For Loop: Iterate through all arguments
            for (String name : args) {
                // Always append the name AND the delimiter
                namesList.append(name).append(", ");
            }

            // Conditional Cleanup: Ensure the builder isn't empty before using substring
            if (namesList.length() > 0) {
                // substring() Method: Extract all characters except the last two (", ")
                // Using length() - 2 points to the position just before the delimiter
                String finalNames = namesList.substring(0, namesList.length() - 2);
                
                // String Concatenation: Build the final greeting message
                System.out.println("Hello, " + finalNames + "!");
            }
        }
    }
}