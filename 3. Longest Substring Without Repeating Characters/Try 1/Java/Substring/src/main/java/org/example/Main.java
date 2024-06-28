package org.example;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String a = "pwwkew";
        System.out.println(lengthOfLongestSubstring(a));
    }

    public static int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        char[] arr = s.toCharArray();
        int max = 0;

        for(int count = 0, j = 0; j < arr.length; j++) {
            if (map.containsKey(arr[j]) && map.get(arr[j]) >= count) {
                count = map.get(arr[j]) + 1;
            }
            int curr = j-count+1;
            max = Math.max(curr, max);
            map.put(arr[j], j);
        }

        return max;
    }
}