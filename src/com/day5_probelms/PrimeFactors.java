import java.util.Scanner;

public class PrimeFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to find its prime factors: ");
        int N = scanner.nextInt();

        // Validate input
        if (N <= 1) {
            System.out.println("Please enter a number greater than 1.");
            return;
        }

        // Compute the prime factors
        System.out.println("Prime factors of " + N + " are:");
        for (int i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                System.out.println(i);
                N /= i;
            }
        }

        // If N is still greater than 1, it is a prime number
        if (N > 1) {
            System.out.println(N);
        }

        // Close the scanner
        scanner.close();
    }
}
