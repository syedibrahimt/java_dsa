package com.syed.day5;

import java.util.*;

public class Revise {

    private static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> numberToIndexMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            int complement = target - nums[i];
            if(numberToIndexMap.containsKey(complement)) return new int[] {numberToIndexMap.get(complement), i};
            numberToIndexMap.put(nums[i], i);
        }
        return new int[] {};
    }

    private static boolean containsDuplicate(int[] nums) {
        Set<Integer> tracker = new HashSet<>();
        for(int i: nums) {
            if (tracker.contains(i)) return true;
            tracker.add(i);
        }
        return false;
    }

    private static int buySellStock(int[] stockPrices) {
        int maxProfit = 0;
        int minPrice = Integer.MAX_VALUE;
        for(int currentPrice: stockPrices) {
            if(currentPrice < minPrice) minPrice= currentPrice;
            else if(currentPrice - minPrice > maxProfit) maxProfit = currentPrice - minPrice;
        }
        return maxProfit;
    }

    private static String productOfArrayExceptSelf1(int[] nums) {
        int[] resultArray = new int[nums.length];
        int[] prefixArray = new int[nums.length];
        int[] suffixArray = new int[nums.length];
        prefixArray[0] = 1;
        for (int i = 1; i< nums.length; i ++) {
            prefixArray[i] = prefixArray[i-1] * nums[i-1];
        }
        suffixArray[nums.length-1] = 1;
        for (int i = nums.length-2; i >=0 ; i--) {
            suffixArray[i] = suffixArray[i+1] * nums[i+1];
        }
        for (int i = 0; i < nums.length; i++) {
            resultArray[i] = prefixArray[i] * suffixArray[i];
        }
        return Arrays.toString(resultArray);
    }

    private static String productOfArrayExceptSelf2(int[] nums) {
        int[] resultArray = new int[nums.length];
        int prefixProduct = 1;
        for (int i = 0; i < nums.length; i++) {
            resultArray[i] = prefixProduct;
            prefixProduct*=nums[i];
        }
        int suffixProduct = 1;
        for (int i = nums.length -1; i >= 0; i--) {
            resultArray[i] *= suffixProduct;
            suffixProduct*=nums[i];
        }
        return Arrays.toString(resultArray);
    }

    public static void main(String[] a) {
        // two sum
        int[] input1 = {2,4,5,6,8,9};
        int target = 9;
        System.out.println(Arrays.toString(twoSum(input1, target)));

        // contains duplicate
        int[] inputArr = new int[] {1,2,4,5,6,7,4};
        int[] inputArr2 = new int[] {1,2,4,5,6,7,8};
        System.out.println(containsDuplicate(inputArr));
        System.out.println(containsDuplicate(inputArr2));

        // maxProfit when buy/sell a stock
        int[] stockPrices1 = {7,1,5,3,6,4};
        int[] stockPrices2 = {7,6,5,4,3,2,1};
        System.out.println(buySellStock(stockPrices1));
        System.out.println(buySellStock(stockPrices2));

        // product of array element except self
        System.out.println(productOfArrayExceptSelf1(new int[] {1,2,3,4}));
        System.out.println(productOfArrayExceptSelf2(new int[] {1,2,3,4}));
    }
}
