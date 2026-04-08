/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloApp UC6. It accepts zero or more command-line arguments and prints a greeting.
 * It uses the String.join() method to efficiently concatenate multiple names 
 * with a specified delimiter, removing the need for manual loops or cleanup.
 *
 * UC 7: Display "Hello" with Multiple Command-Line Arguments using String.join() Method
 *
 * @author HK
 * @version 7.0
 * @since UC6
 */
public class HelloApp {

    public static void main(String[] args) {

        // Array Length Check: Detect missing arguments
        if (args.length == 0) {
            // Default Handling: Graceful fallback when no arguments are provided
            System.out.println("Hello, World!");
        } else {
            // String.join() Method: Automatically concatenates the array elements 
            // with the ", " delimiter and handles placement perfectly.
            String finalNames = String.join(", ", args);
            
            // String Concatenation: Build the final greeting message
            System.out.println("Hello, " + finalNames + "!");
        }
    }
}