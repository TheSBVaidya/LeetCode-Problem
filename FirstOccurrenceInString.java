// Link: https://leetcode.com/problems/find-the-index-of-the-first-occurrence-in-a-string/description/

// Given two strings needle and haystack, return the index of the first occurrence of needle in haystack, 
// or -1 if needle is not part of haystack.

// Example 1:
    // Input: haystack = "sadbutsad", needle = "sad"
    // Output: 0
    // Explanation: "sad" occurs at index 0 and 6.
    // The first occurrence is at index 0, so we return 0.

// Example 2:
    // Input: haystack = "leetcode", needle = "leeto"
    // Output: -1
    // Explanation: "leeto" did not occur in "leetcode", so we return -1.

public class FirstOccurrenceInString {

    public static int strStr(String str, String needle) {
        int heystackLen = str.length();
        int needleLen = needle.length();

        for(int i = 0; i<=heystackLen-needleLen; i++) {
            if (str.substring(i,  i + needleLen).equals(needle)) {
                return i;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        String str = "hello";
        String needle = "ll";

        int result = strStr(str, needle);

        System.out.println(result);
    }
}
