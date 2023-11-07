import java.util.Scanner;

public class QuotientRemainder {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Input: Dividend
        System.out.print("Enter the dividend: ");
        int dividend = scanner.nextInt();

        // Input: Divisor
        System.out.print("Enter the divisor: ");
        int divisor = scanner.nextInt();

        // Check if the divisor is not zero
        if (divisor == 0) {
            System.out.println("Cannot divide by zero. Please enter a non-zero divisor.");
            return;
        }

        // Compute Quotient and Remainder
        int quotient = dividend / divisor;
        int remainder = dividend % divisor;

        // Output the result
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);

        // Close the scanner
        scanner.close();
    }
}
