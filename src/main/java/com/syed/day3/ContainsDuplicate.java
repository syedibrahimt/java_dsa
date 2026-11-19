package com.syed.day3;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    /**
     * Time complexity is O(n^2)
     * Space complexity is O(1)
     * @param arr
     * @return
     */
    private static boolean bruteForce(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j = i+1; j< arr.length; j ++) {
                if(arr[i] == arr[j]) return true;
            }
        }
        return false;
    }

    /**
     * Time complexity is O(nlogn)
     * Space complexity is O(n)
     * @param arr
     * @return
     */

    private static boolean sortingMethod(int[] arr) {
        Arrays.sort(arr);
        for (int i=0; i< arr.length-1; i++) {
            if(arr[i] == arr[i+1]) return true;
        }
        return false;
    }

    /**
     * Time complexity is O(n)
     * Space complexity is O(n)
     * @param arr
     * @return
     */
    private static boolean optimalHashSet(int[] arr) {
        Set<Integer> visited = new HashSet<>();
        for (int j : arr) {
            if (visited.contains(j)) return true;
            visited.add(j);
        }
        return false;
    }

    public static void main(String[] a) {
        int[] inputArr = new int[] {1,2,4,5,6,7,4};
        int[] inputArr2 = new int[] {1,2,4,5,6,7,8};
        // bruteforce
        System.out.println(bruteForce(inputArr));
        System.out.println(bruteForce(inputArr2));
        // sorting and adjacent check
        System.out.println(sortingMethod(inputArr));
        System.out.println(sortingMethod(inputArr2));
        // optimal method using hashset
        System.out.println(optimalHashSet(inputArr));
        System.out.println(optimalHashSet(inputArr2));
    }
}
