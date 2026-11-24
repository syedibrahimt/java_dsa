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
    }
}
