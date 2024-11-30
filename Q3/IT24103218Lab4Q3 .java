import java.util.Scanner;

public class IT24103218Lab4Q3 {
    public static void main(String[] args) {

        // Create a scanner object to take input

        Scanner scanner = new Scanner(System.in);
        
        // Prompt user for input

        System.out.print("Enter a number: ");

        double number = scanner.nextDouble();
        
        // Use ternary operator to check if the number is positive, negative, or zero

        String result = (number > 0) ? "Positive" : (number < 0) ? "Negative" : "Zero";
        
        // Output the result

        System.out.println("The number is " + result);
        
        // Close the scanner

        scanner.close();
    }
}
