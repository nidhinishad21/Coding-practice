package com.Problems;

import java.util.HashSet;

public class DuplicatesInArray {

    public static boolean hasDuplicates(int[] arr) {
        HashSet<Integer> table = new HashSet<>();

        for (int i = 0; i < arr.length; i++) {
            if (table.contains(arr[i])) {
                return true;
            } else {
                table.add(arr[i]);
            }
        }

        return false;

    }

}
