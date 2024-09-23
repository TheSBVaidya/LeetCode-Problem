// Link: https://leetcode.com/problems/longest-substring-without-repeating-characters/description/?envType=study-plan-v2&envId=top-interview-150

// Given a string s, find the length of the longest substring without repeating characters.

// Example 1:
    // Input: s = "abcabcbb"
    // Output: 3
        // Explanation: The answer is "abc", with the length of 3.

// Example 2:
    // Input: s = "bbbbb"
    // Output: 1
        // Explanation: The answer is "b", with the length of 1.

// Example 3:
    // Input: s = "pwwkew"
    // Output: 3
        // Explanation: The answer is "wke", with the length of 3.

// Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.

import java.util.HashMap;

public class LongestSubstringWithoutRepeatingCharacters {

    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();

        int left = 0;
        int right = 0;
        int len = 0;
        int maxLen = Integer.MIN_VALUE;

        HashMap<Character , Integer> map = new HashMap<>();

        while (right < n) {
            if (map.containsKey(s.charAt(right))) {
                if (map.get(s.charAt(right)) >= left) {
                    left = map.get(s.charAt(right)) + 1;
                }
            }
            len = right - left + 1;
            maxLen = Math.max(len, maxLen);

            map.put(s.charAt(right), right);

            right++;
        }

        return maxLen;
    }
    public static void main(String[] args) {
        String str = "abcabcbb";

        int result = lengthOfLongestSubstring(str);

        System.out.println(result);
    }
}
