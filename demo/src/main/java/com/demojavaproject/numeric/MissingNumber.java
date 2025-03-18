package com.demojavaproject.numeric;

public class MissingNumber {
    public static int findMissingNumber(int[] arr, int n) {
       int expectedSum = n * (n + 1)/2;
       int actualSum = 0;

       for (int num : arr) {
        actualSum += num;
       }
       return expectedSum - actualSum;
    }

    public static void main(String[] args) {
          int[] arr = {1, 2, 3, 4, 5, 7};
          int n = 7;

          System.out.println("Missing Number: " + findMissingNumber(arr, n));
    }

}
