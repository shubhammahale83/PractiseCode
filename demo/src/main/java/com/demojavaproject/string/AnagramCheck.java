package com.demojavaproject.string;

import java.util.Arrays;

public class AnagramCheck {
    public static boolean isAnagram(String str1, String str2) {
        char[] arr1 = str1.toCharArray();
        char[] arr2 = str2.toCharArray();

        Arrays.sort(arr1);
        Arrays.sort(arr2);
        return Arrays.equals(arr1, arr2);
    } 

    public static void main(String[] args) {
        System.out.println(isAnagram("apple", "plepa"));

    }

}
