// Link: https://leetcode.com/problems/zigzag-conversion/description/?envType=study-plan-v2&envId=top-interview-150

// The string "PAYPALISHIRING" is written in a zigzag pattern on a given number of rows like this: 
// (you may want to display this pattern in a fixed font for better legibility)

// P   A   H   N
// A P L S I I G
// Y   I   R
// And then read line by line: "PAHNAPLSIIGYIR"

// Write the code that will take a string and make this conversion given a number of rows:

// string convert(string s, int numRows);
 

// Example 1:
    // Input: s = "PAYPALISHIRING", numRows = 3
    // Output: "PAHNAPLSIIGYIR" PAHNAPLSIIG

// Example 2:
    // Input: s = "PAYPALISHIRING", numRows = 4
    // Output: "PINALSIGYAHRPI"
        // Explanation:
            // P     I    N
            // A   L S  I G
            // Y A   H R
            // P     I

// Example 3:
    // Input: s = "A", numRows = 1
    // Output: "A"
 
public class ZigzagConversion {
    public static String convert(String s, int numRows) {
        int n = s.length();
        String c = "";

        if (numRows == 1) {
            return s;
        }

        for(int i = 0; i<numRows; i++) {
            int tempNo = 2*  (numRows - 1);
            for(int j = i; j<n; j += tempNo) {
                c += s.charAt(j);
                if (i > 0 && i < numRows - 1 && (j + tempNo - 2 * i) < n) {
                    c += s.charAt(j + tempNo - 2 * i);
                } 
            }
         }

         return c;

        //  System.out.println(c);
        //  for (char d : c) {
        //     System.out.print(d + " ");
        //  }
    }
    public static void main(String[] args) {
        String str = "PAYPALISHIRING";
        int row = 3;

        String result = convert(str, row);


        System.out.println(result);


    }
}
