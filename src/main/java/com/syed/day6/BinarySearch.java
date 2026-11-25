package com.syed.day6;

public class BinarySearch {
    private static int binarySearch(int[] arr, int target){
        int left = 0;
        int right = arr.length-1;
        while(left <= right) {
            int mid = (left + right) / 2;
            if (target == arr[mid]) return mid;
            else if(target < arr[mid]) right = mid-1;
            else left = mid+1;
        }
        return -1;
    }
    static void main() {
        System.out.println(binarySearch(new int[] {5,12,18,25,31,38,44,51,58,67,73,80,87}, 33));
    }
}
