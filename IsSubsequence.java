// Link: https://leetcode.com/problems/is-subsequence/?envType=study-plan-v2&envId=top-interview-150

// Given two strings s and t, return true if s is a subsequence of t, or false otherwise.
// A subsequence of a string is a new string that is formed from the original string by deleting some 
// (can be none) of the characters without disturbing the relative positions of the remaining characters. (i.e., "ace" is a subsequence of "abcde" while "aec" is not).

// Example 1:
    // Input: s = "abc", t = "ahbgdc"
    // Output: true

// Example 2:
    // Input: s = "axc", t = "ahbgdc"
    // Output: false

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        
        int n = s.length();
        int m = t.length();

        int i = 0;
        int j = 0;

        while (i < n && j < m) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            } 
            
            j++;
            
        }
        return (i == n);
    }
    public static void main(String[] args) {
        String str = "aaaaaa";
        String str1 = "bbaaaa";

        boolean resuls = isSubsequence(str, str1);

        System.out.println(resuls);
    }
}
