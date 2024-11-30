import java.util.Scanner;

public class IT24103218Lab4Q2 {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
          // Input exam marks

        double examMarks = -1;

        while (examMarks < 0 || examMarks > 100) {

            System.out.print("Enter the exam marks (out of 100): ");

            examMarks = scanner.nextDouble();

            if (examMarks < 0 || examMarks > 100) {

                System.out.println("Invalid input. Marks must be between 0 and 100.");
            }
        }

          // Input lab submission marks

        double labMarks = -1;

        while (labMarks < 0 || labMarks > 100) {

            System.out.print("Enter the lab submission marks (out of 100): ");

            labMarks = scanner.nextDouble();

            if (labMarks < 0 || labMarks > 100) {

                System.out.println("Invalid input. Marks must be between 0 and 100.");
            }
        }

          // Input percentages for exam and lab

        double examPercentage = -1;
        double labPercentage = -1;

        while (examPercentage + labPercentage != 100) {

            System.out.print("Enter the percentage weight for the exam (out of 100): ");

            examPercentage = scanner.nextDouble();

            System.out.print("Enter the percentage weight for the lab submission (out of 100): ");

            labPercentage = scanner.nextDouble();
            
            if (examPercentage + labPercentage != 100) {

                System.out.println("The percentages must add up to 100. Please enter again.");
            }
        }

          // Calculate final mark
        double finalExamMarks = (examMarks * examPercentage) / 100;
        double finalLabMarks = (labMarks * labPercentage) / 100;
        double finalMark = finalExamMarks + finalLabMarks;

          // Output the final mark
        System.out.println("Final exam marks: " + finalExamMarks);
        System.out.println("Final lab marks: " + finalLabMarks);
        System.out.println("Final overall mark: " + finalMark);
        
        scanner.close();
    }
}
