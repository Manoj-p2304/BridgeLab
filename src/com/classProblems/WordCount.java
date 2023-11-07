package com.classProblems;

public class WordCount {
    public static void main(String[] args) {
        String inputString = "HI how are you";
        int charCount = inputString.length();
        String[] words = inputString.split("\\s+");
        int wordCount = words.length;

        System.out.println("Character count is " + charCount);
        System.out.println("Word count is " + wordCount);
    }
}
