// Link: https://leetcode.com/problems/length-of-last-word/description/

// Given a string s consisting of words and spaces, return the length of the last word in the string.
// A word is a maximal substring consisting of non-space characters only.

// Example 1:
    // Input: s = "Hello World"
    // Output: 5
    // Explanation: The last word is "World" with length 5.

// Example 2:
    // Input: s = "   fly me   to   the moon  "
    // Output: 4
    // Explanation: The last word is "moon" with length 4.

// Example 3:
    // Input: s = "luffy is still joyboy"
    // Output: 6
    // Explanation: The last word is "joyboy" with length 6.

public class LengthOfLastWord {

    public static void lengthOfLastWord(String s) {

        // int n = s.length();
        int len = 0;
        
        String sarr[] = s.split(" ");

        int n = sarr.length;

        for(int i = n-1; i>n-2; i--) {
            // if (i == sarr.length-1) {
                len = sarr[i].length();
            // }
        }

        System.out.println(len);
        // return -1;                                                                                                                                                  
    }
    public static void main(String[] args) {
        String str = "luffy is still joyboy";

        // int result = 
        lengthOfLastWord(str);

        // System.out.println(result);
    }
}
