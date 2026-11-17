package com.syed.day1;

public class Gcd {
    private static int findGcd(int a, int b){
        if (a == 0) return b;
        if (b == 0) return a;
        return findGcd(b%a, a);
    }
    public static void main(String[] a) {
        System.out.println(findGcd(112, 14));
    }
}
