package com.syed.day2;

import java.util.Arrays;
import java.util.HashMap;

/**
 * Given an integer array and an integer target
 * Return the indices (in form of array) of the array whose elements adds up to the target
 * Example1:
 * input: [2,3,4,6,7], target: 7
 * output: [1,2]
 * Example2:
 * input: [3,3], target: 6
 * output: [0,1]
 */

public class TwoSum {
    /**
     * BRUTEFORCE approach
     * The time complexity is O(n^2)
     * The space complexity is O(1)
     *
     * @param nums The array of integers
     * @param target The target which the nums add up to
     * @return the indices of the nums which adds up to the target
     *
     */
    private static int[] bruteForce(int[] nums, int target) {
        for(int i=0; i<nums.length-1; i++) {
            for (int j = i+1;j< nums.length;j++) {
                if(nums[i] + nums[j] == target) {
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{};
    }

    /**
     * HashMap (single pass) approach
     * The time complexity is O(n)
     * The space complexity is O(n)
     *
     * @param nums The array of integers
     * @param target The target which the nums add up to
     * @return the indices of the nums which adds up to the target
     *
     */
    private static int[] optimized(int[] nums, int target){
        HashMap<Integer, Integer> cMap = new HashMap<>();
        for(int i=0; i<nums.length; i++) {
            if(!cMap.containsKey(nums[i])) {
                cMap.put(target-nums[i],i);
            } else {
                return new int[]{cMap.get(nums[i]),i};
            }
        }
        return new int[]{};
    }

    public static void main(String[] a){
        System.out.println(Arrays.toString(bruteForce(new int[]{4, 5, 1, 7, 2}, 3)));
        System.out.println(Arrays.toString(bruteForce(new int[]{2,3,4,6,7}, 7)));

        System.out.println(Arrays.toString(optimized(new int[]{4, 5, 1, 7, 2}, 3)));
        System.out.println(Arrays.toString(optimized(new int[]{2,3,4,6,7}, 7)));
    }
}
