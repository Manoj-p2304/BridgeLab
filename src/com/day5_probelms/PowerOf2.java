package com.day5_probelms;

public class PowerOf2 {
    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Please provide a single command-line argument (N).");
            return;
        }


        int N = Integer.parseInt(args[0]);

        // Validate the input range
        if (N < 0 || N >= 31) {
            System.out.println("N should be in the range 0 <= N < 31.");
            return;
        }

        // Print the table of powers of 2
        System.out.println("Powers of 2 up to 2^" + N + ":");
        for (int i = 0; i <= N; i++) {
            int result = (int) Math.pow(2, i);
            System.out.println("2^" + i + " = " + result);
        }
    }
}
