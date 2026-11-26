package com.syed.day6;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    private static boolean isAnagram(String a, String b) {
        if(a.length() != b.length()) return false;
        Map<String, Integer> frequencyCounter = new HashMap<>();
        for(String s: a.split("")) {
            frequencyCounter.put(s, frequencyCounter.getOrDefault(s,0)+1);
        }
        for (String s: b.split("")) {
            frequencyCounter.put(s,frequencyCounter.getOrDefault(s,0)-1);
        }
        return frequencyCounter.values().stream().allMatch(i -> i==0);
    }

    static void main() {
        System.out.println(isAnagram("syed", "dyes"));
        System.out.println(isAnagram("syed", "gyes"));
        System.out.println(isAnagram("syed", "dys"));
        System.out.println(isAnagram("anagram", "nagaram"));
    }
}
