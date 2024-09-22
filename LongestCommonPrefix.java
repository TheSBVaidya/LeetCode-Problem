// Link: https://leetcode.com/problems/longest-common-prefix/description/?envType=study-plan-v2&envId=top-interview-150

// Write a function to find the longest common prefix string amongst an array of strings.
// If there is no common prefix, return an empty string "".

// Example 1:
    // Input: strs = ["flower","flow","flight"]
    // Output: "fl"

// Example 2:
    // Input: strs = ["dog","racecar","car"]
    // Output: ""
    // Explanation: There is no common prefix among the input strings.

import java.util.Arrays;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        String commString = "";
        Arrays.sort(strs);

        String first = strs[0];
        String last = strs[strs.length - 1];

        // System.out.println(Arrays.toString(strs));

        for(int i = 0; i<first.length(); i++) {
            if (first.charAt(i) != last.charAt(i)) {
                break;
            } else {
                commString = commString + first.charAt(i);
            }
        }

        return commString;

    }
    public static void main(String[] args) {
        String[] arr = {"flower","flow","flight"};

        String result = longestCommonPrefix(arr);

        System.out.println(result);


    }
}
