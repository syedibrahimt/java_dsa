package com.syed.day6;

public class MinRotatedSortArray {
    private static int bruteForceFindMinInRotatedSortedArray(int[] nums) {
        int min = Integer. MAX_VALUE;
        for(int i: nums) {
            if (i<min) min = i;
        }
        return min;
    }
    private static int optimalFindMinInRotatedSortedArray(int[] arr) {
        int left = 0;
        int right = arr.length-1;
        while(left < right) {
            int mid = left + (right - left) / 2;
            if(arr[mid] > arr[right]) left = mid+1;
            else right = mid;
        }
        return arr[right];
    }
    static void main() {
        System.out.println(bruteForceFindMinInRotatedSortedArray(new int[] {5,6,88,3,4}));
        System.out.println(optimalFindMinInRotatedSortedArray(new int[] {5,6,88,3,4}));
    }
}
