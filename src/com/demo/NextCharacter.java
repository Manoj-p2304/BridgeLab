package com.demo;
import java.util.Scanner;

public class NextCharacter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String result = getNextCharacterString(input);
        System.out.println("Next character string: " + result);
    }

    public static String getNextCharacterString(String input) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);
            char nextChar = (char) (currentChar + 1);
            result.append(nextChar);
        }
        return result.toString();
    }
}
