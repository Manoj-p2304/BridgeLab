package com.classProblems;

public class Review {
    public static void main(String[] args) {
        int[] numbers = {3,4,-2,1};
        int result = isMissing(numbers);
        System.out.println("The first missing element is" + result);
    }

    public static int isMissing(int[] numbers){
        int n = numbers.length;
        for(int i=0; i<=n; i++ ){
            if(numbers[i] > 0 && numbers[i] <= n){
                int temp = numbers[i];
                numbers[i] = numbers[i+1];
                numbers[i+1] = temp;
            }
        }
        for(int i=0; i<n; i++){
            if(numbers[i] != i+1){
                return i+1;
            }
        }
        return n+1;

    }

}
