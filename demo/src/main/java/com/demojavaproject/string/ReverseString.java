package com.demojavaproject.string;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Shubham";
        String reversString = new StringBuilder(str).reverse().toString();
        System.out.println("Reversed: "+ reversString);

    } 
}