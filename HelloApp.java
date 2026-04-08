/**
 * HelloApp.java - A simple Java application that extends the functionality of
 * HelloApp UC2. It accepts a user's name as a command-line argument and displays
 * a personalized greeting. If no argument is provided, it safely defaults to "World".
 *
 * UC 3: Display "Hello" with Command-Line Argument or Default Message
 *
 * @author HK
 * @version 3.0
 * @since UC2
 */
public class HelloApp {
    
    public static void main(String[] args) {
        
        // Ternary Operator & Array Length Checking:
        // condition ? valueIfTrue : valueIfFalse
        // We check args.length to prevent ArrayIndexOutOfBoundsException
        String name = (args.length > 0) ? args[0] : "World"; 
        
        // String Concatenation: Output greeting
        System.out.println("Hello, " + name + "!");
    }
}