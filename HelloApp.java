/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloApp UC3. It accepts multiple names as command-line arguments and displays
 * a personalized greeting for all names. If no names are provided, it defaults to "World".
 *
 * UC 4: Display "Hello" with Multiple Command-Line Arguments or Default Message
 *
 * @author HK
 * @version 4.0
 * @since UC3
 */
public class HelloApp {

    public static void main(String[] args) {

        // Conditional Logic: Check if any command-line arguments were provided
        if (args.length > 0) {
            
            // StringBuilder: Efficiently building a string from multiple parts
            StringBuilder namesList = new StringBuilder();

            // For Loop: Iterate through the args array to collect all names
            for (int i = 0; i < args.length; i++) {
                namesList.append(args[i]);
                
                // Add a comma and space if it's not the last name in the array
                if (i < args.length - 1) {
                    namesList.append(", ");
                }
            }

            // Display the personalized greeting with all names
            System.out.println("Hello, " + namesList.toString() + "!");

        } else {
            // Default Value: Fallback message when no arguments are given
            System.out.println("Hello, World!");
        }
    }
}