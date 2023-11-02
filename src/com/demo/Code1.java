package com.demo;
import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a word: ");
        String inputWord = scanner.nextLine();
        String reversedWord = reverseWord(inputWord);
        System.out.println("Reversed word: " + reversedWord);
        scanner.close();
    }
    private static String reverseWord(String word) {
        char[] charArray = word.toCharArray();
        int start = 0;
        int end = charArray.length - 1;
        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;
            start++;
            end--;
        }
        return new String(charArray);
    }
}
