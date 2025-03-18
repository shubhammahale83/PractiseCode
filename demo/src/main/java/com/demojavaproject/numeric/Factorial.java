package com.demojavaproject.numeric;

public class Factorial {
    public static int factorial(int n) {
    return (n == 0) ? 1 : n * factorial(n-1);
    }

    public static void main (String[] args) {
        System.out.println("Factorial is: " + factorial(5));
    }

}
