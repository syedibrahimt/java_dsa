package com.syed.day3;

public class ContainsDuplicate {

    private static boolean bruteForce(int[] arr) {
        for(int i=0; i<arr.length-1; i++) {
            for(int j = i+1; j< arr.length; j ++) {
                if(arr[i] == arr[j]) return true;
            }
        }
        return false;
    }

    public static void main(String[] a) {
        int[] inputArr = new int[] {1,2,4,5,6,7,4};
        int[] inputArr2 = new int[] {1,2,4,5,6,7,8};
        System.out.println(bruteForce(inputArr));
        System.out.println(bruteForce(inputArr2));
    }
}
