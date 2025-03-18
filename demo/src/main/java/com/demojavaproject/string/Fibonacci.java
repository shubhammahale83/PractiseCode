package com.demojavaproject.string;

public class Fibonacci {
    public static int fibonacci(int n) {

        return (n <= 1) ? n : fibonacci(n - 1) + fibonacci( n - 2);
    }

    public static void main(String[] args) {
        for (int i = 1; i<2; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
        

}
