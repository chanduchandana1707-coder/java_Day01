import java.util.Scanner;

public class StudentResultAnalyzer {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Ask for student's name
        System.out.print("Enter student's name: ");
        String name = sc.nextLine();

        // Ask for marks in 3 subjects
        System.out.print("Enter marks for Subject 1: ");
        double mark1 = sc.nextDouble();

        System.out.print("Enter marks for Subject 2: ");
        double mark2 = sc.nextDouble();

        System.out.print("Enter marks for Subject 3: ");
        double mark3 = sc.nextDouble();

        // Calculate total marks
        double total = mark1 + mark2 + mark3;

        // Calculate average
        double average = total / 3;

        // Check whether student passed
        boolean passed = mark1 >= 40 && mark2 >= 40 && mark3 >= 40;

        // Check distinction
        boolean distinction = passed && average >= 75;

        // Check special award
        boolean specialAward = passed
                && average >= 90
                && mark1 >= 85
                && mark2 >= 85
                && mark3 >= 85;

        // Display final result
        System.out.println("\n----- Student Result -----");
        System.out.println("Name: " + name);
        System.out.println("Subject 1: " + mark1);
        System.out.println("Subject 2: " + mark2);
        System.out.println("Subject 3: " + mark3);

        System.out.println("Total Marks: " + total);
        System.out.println("Average: " + average);

        if (passed) {
            System.out.println("Result: PASSED");
        } else {
            System.out.println("Result: FAILED");
        }

        if (distinction) {
            System.out.println("Distinction: YES");
        } else {
            System.out.println("Distinction: NO");
        }

        if (specialAward) {
            System.out.println("Special Award: YES");
        } else {
            System.out.println("Special Award: NO");
        }

        sc.close();
    }
}