package com.day5_probelms;
import java.util.Scanner;
public class LeapYear {
    public static void main(String[] args) {
        // Scanner to take user input
        Scanner scanner = new Scanner(System.in);

        // Input: The year
        System.out.print("Enter a year (4 digits): ");
        int year = scanner.nextInt();

        // Validate input
        if (year < 1000 || year > 9999) {
            System.out.println("Please enter a 4-digit number for the year.");
            return;
        }

        // Check if it is a leap year
        boolean isLeapYear = false;

        if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
            isLeapYear = true;
        }

        // Output the result
        if (isLeapYear) {
            System.out.println(year + " is a Leap Year.");
        } else {
            System.out.println(year + " is not a Leap Year.");
        }

        // Close the scanner
        scanner.close();
    }
}
