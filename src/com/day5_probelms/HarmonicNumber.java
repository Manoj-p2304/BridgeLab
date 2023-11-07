package com.day5_probelms;

import java.util.Scanner;

public class HarmonicNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the Harmonic Value N (N != 0): ");
        int N = scanner.nextInt();

        // Validate input
        if (N == 0) {
            System.out.println("N should be a non-zero value.");
            return;
        }

        // Compute the Nth harmonic number
        double harmonicNumber = 0.0;
        for (int i = 1; i <= N; i++) {
            harmonicNumber += 1.0 / i;
        }

        // Output the result
        System.out.println("The " + N + "th Harmonic Number is: " + harmonicNumber);

        // Close the scanner
        scanner.close();
    }
}
