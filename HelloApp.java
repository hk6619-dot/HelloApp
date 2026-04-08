/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloApp UC1 by accepting a user's name as a command-line argument and displaying
 * a personalized greeting.
 *
 * UC 1: Display "Hello World" - The application should display the message
 * "Hello World" to the console when executed.
 * UC 2: Display User Name - The application should accept a user's name as
 * a command-line argument and display a personalized greeting.
 *
 * @author HK
 * @version 2.0
 * @since UC1
 */
public class HelloApp {
    
    // Main Method: Entry point for program execution
    public static void main(String[] args) {
        
        // Conditional Logic: Check if command-line arguments exist [cite: 311, 363]
        if (args.length > 0) {
            // Get the name from the first command-line argument [cite: 310, 341]
            String name = args[0];
            // String Concatenation: Output personalized greeting [cite: 313, 342, 343]
            System.out.println("Hello, " + name + "!");
        } else {
            // Default Value: Fallback message when no arguments are given [cite: 368]
            System.out.println("Hello World!");
        }
    }
}