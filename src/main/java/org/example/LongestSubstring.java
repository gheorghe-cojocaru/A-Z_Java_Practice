package org.example;

import java.util.HashSet;

public class LongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        // Ein Set wird initialisiert
        HashSet<Character> set = new HashSet<>();
        int left = 0;
        int maxLength = 0; //Grösste Substring ohne wiederholung

        for (int right = 0; right < s.length(); right++) {
            char currentChar = s.charAt(right);

            while (set.contains(currentChar)) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(currentChar);

            maxLength = Math.max(maxLength, right - left + 1);
        }

        return maxLength;
    }

    public static void main(String[] args) {
        LongestSubstring solution = new LongestSubstring();

        System.out.println(solution.lengthOfLongestSubstring("absdaka"));
    }

}
