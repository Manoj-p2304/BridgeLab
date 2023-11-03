package com.demo;
import java.util.Scanner;

public class Code1 {
    public static void main(String[] args) {
        String input = "I am ram";
        String[] words = input.split(" ");
        StringBuilder reversedString = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            StringBuilder reversedWord = new StringBuilder(word).reverse();
            reversedString.append(reversedWord);
            if (i < words.length - 1) {
                reversedString.append(" ");
            }
        }

        System.out.println("Input - " + input);
        System.out.println("Output - " + reversedString.toString());
    }
}
