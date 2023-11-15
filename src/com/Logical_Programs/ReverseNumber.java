import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to reverse: ");
        int number = scanner.nextInt();

        int reversedNumber = reverseNumber(number);

        System.out.println("Reversed number: " + reversedNumber);

        scanner.close();
    }

    // Function to reverse a number
    private static int reverseNumber(int num) {
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;  // Get the last digit
            reversed = reversed * 10 + digit;  // Multiply current result by 10 and add the last digit
            num = num / 10;  // Move to the next digit
        }

        return reversed;
    }
}
