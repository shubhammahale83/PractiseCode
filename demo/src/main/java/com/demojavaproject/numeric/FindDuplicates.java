package com.demojavaproject.numeric;

import java.util.HashSet;
import java.util.Set;

public class FindDuplicates {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 3, 2, 1, 3};
        Set<Integer> seen = new HashSet<>();
        Set<Integer> duplicates = new HashSet<>();

        for (int num : arr) {
            if (!seen.add(num)) duplicates.add(num);
        }
        System.out.println("Duplicates: " + duplicates);

    }

}
