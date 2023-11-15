package com.day6_problems;

import java.util.Scanner;

public class PerfectNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a Perfect Number: ");
        int number = scanner.nextInt();

        // Validate input
        if (number <= 0) {
            System.out.println("Please enter a positive number.");
            return;
        }

        // Check if the number is a Perfect Number
        if (isPerfectNumber(number)) {
            System.out.println(number + " is a Perfect Number.");
        } else {
            System.out.println(number + " is not a Perfect Number.");
        }

        scanner.close();
    }

    // Function to check if a number is a Perfect Number
    private static boolean isPerfectNumber(int num) {
        int sum = 0;

        // Loop to find the divisors and calculate their sum
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        // Check if the sum of divisors is equal to the number
        return sum == num;
    }
}
