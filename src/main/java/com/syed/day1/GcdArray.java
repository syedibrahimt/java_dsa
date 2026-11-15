package com.syed.day1;

public class GcdArray {

    private static int gcd(int a, int b){
        if(a==0) return b;
        if(b == 0) return a;
        return gcd(b%a, a);
    }

    private static int gcdArr(int[] arr) {
        int ans = Math.abs(arr[0]);
        for(int i=1; i<arr.length; i++) {
            ans=gcd(ans, Math.abs(arr[i]));
        }
        return ans;
    }

    static void main() {

        System.out.println(gcdArr(new int[] {12,32,44,60, 144}));

    }
}
