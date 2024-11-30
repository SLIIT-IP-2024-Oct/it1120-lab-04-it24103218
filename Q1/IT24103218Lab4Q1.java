import java.util.Scanner;

public class IT24103218Lab4Q1 {

    public static void main(String[] args) {

          // Create a Scanner object to read input

        Scanner scanner = new Scanner(System.in);
        
          // Prompt the user to enter a number

        System.out.print("Enter a number: ");

        int number = scanner.nextInt();
        
          // Check the number and display the result

        if (number > 0) {

            System.out.println("The number is Positive.");

        } else if (number < 0) {
            System.out.println("The number is Negative.");
        } else {
            System.out.println("The number is Zero.");
        }

          // Close the scanner

        scanner.close();
    }
}
