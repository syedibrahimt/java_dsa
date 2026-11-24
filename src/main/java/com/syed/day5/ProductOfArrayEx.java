package com.syed.day5;

import java.util.Arrays;

public class ProductOfArrayEx {

    private static String productExceptSelf(int[] nums) {
        int[] prefixArray = new int[nums.length];
        int[] suffixArray = new int[nums.length];
        int[] resultArray = new int[nums.length];
        prefixArray[0] = 1;
        for (int i = 1; i < nums.length; i ++) {
            prefixArray[i] = prefixArray[i-1] * nums[i-1];
        }
        suffixArray[nums.length-1] = 1;
        for (int i = nums.length - 2; i>=0; i--) {
            suffixArray[i] = suffixArray[i+1] * nums[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            resultArray[i] = prefixArray[i] * suffixArray[i];
        }
        return Arrays.toString(resultArray);
    }

    public static void main(String[] a) {
        System.out.println(productExceptSelf(new int[] {1,2,3,4}));
    }
}
