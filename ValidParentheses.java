// Link: https://leetcode.com/problems/valid-parentheses/description/

// Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', 
// determine if the input string is valid.
// An input string is valid if:
    // 1. Open brackets must be closed by the same type of brackets.
    // 2. Open brackets must be closed in the correct order.
    // 3. Every close bracket has a corresponding open bracket of the same type.
 
// Example 1:
    // Input: s = "()"
    // Output: true

// Example 2:
    // Input: s = "()[]{}"
    // Output: true

// Example 3:
    // Input: s = "(]"
    // Output: false

// Example 4:
    // Input: s = "([])"
    // Output: true

import java.util.Stack;

public class ValidParentheses {

    public static boolean isValid(String s) {

        char[] chars = s.toCharArray();

        Stack<Character> stack1 = new Stack<>();

        for(char ele : chars) {
            if (ele == '{' || ele == '(' || ele == '[') {
                stack1.push(ele);
                continue;
            } else if (stack1.isEmpty()) {
                return false;
            }

            char top = stack1.pop();

            if (top == '{' && ele != '}') {
                return false;   
            } else if (top == '(' && ele != ')') {
                return false;
            } else if (top == '[' && ele != ']') {
                return false;
            } 
        }

        return (stack1.isEmpty() == true);
    }
    public static void main(String[] args) {
        
        String str = "([])";

        boolean result = isValid(str);

        System.out.println(result);
    }
}
