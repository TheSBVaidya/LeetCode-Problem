// Link: https://leetcode.com/problems/valid-sudoku/description/?envType=study-plan-v2&envId=top-interview-150

// Determine if a 9 x 9 Sudoku board is valid. Only the filled cells need to be validated according to the following rules:
    // Each row must contain the digits 1-9 without repetition.
    // Each column must contain the digits 1-9 without repetition.
    // Each of the nine 3 x 3 sub-boxes of the grid must contain the digits 1-9 without repetition.

// Note:
    // A Sudoku board (partially filled) could be valid but is not necessarily solvable.
    // Only the filled cells need to be validated according to the mentioned rules.

// Example 1:
    // Input: board = 
        // [["5","3",".",".","7",".",".",".","."]
        // ,["6",".",".","1","9","5",".",".","."]
        // ,[".","9","8",".",".",".",".","6","."]
        // ,["8",".",".",".","6",".",".",".","3"]
        // ,["4",".",".","8",".","3",".",".","1"]
        // ,["7",".",".",".","2",".",".",".","6"]
        // ,[".","6",".",".",".",".","2","8","."]
        // ,[".",".",".","4","1","9",".",".","5"]
        // ,[".",".",".",".","8",".",".","7","9"]]
    // Output: true

// Example 2:
    // Input: board = 
        // [["8","3",".",".","7",".",".",".","."]
        // ,["6",".",".","1","9","5",".",".","."]
        // ,[".","9","8",".",".",".",".","6","."]
        // ,["8",".",".",".","6",".",".",".","3"]
        // ,["4",".",".","8",".","3",".",".","1"]
        // ,["7",".",".",".","2",".",".",".","6"]
        // ,[".","6",".",".",".",".","2","8","."]
        // ,[".",".",".","4","1","9",".",".","5"]
        // ,[".",".",".",".","8",".",".","7","9"]]
    // Output: false

// Explanation: Same as Example 1, except with the 5 in the top left corner being modified to 8. 
//              Since there are two 8's in the top left 3x3 sub-box, it is invalid.

import java.util.HashSet;

public class ValidSudoku {
    public static boolean isValidSudoku(char[][] board) {
        
        // we are using hashset it does not add duplicate value
        HashSet<String> set = new HashSet<>();

        for(int row = 0; row < 9; row++) {
            for(int col = 0; col < 9; col++) {
                char current = board[row][col];

                if (current != '.') {
                    if (set.contains(current + " in row " + row) || 
                        set.contains(current + " in column " + col) || 
                        set.contains(current + " in block " + row/3 + "," + col/3)) {

                            return false;
                    } else {
                        set.add(current + " in row " + row);
                        set.add(current + " in column " + col);
                        set.add(current + " in block " + row/3 + "," + col/3);

                    }
                }
            }
        }
        return true;
    }
    public static void main(String[] args) {
        char[][] board = {
            {'5', '3', '.', '.', '7', '.', '.', '.', '.'},
            {'6', '.', '.', '1', '9', '5', '.', '.', '.'},
            {'.', '9', '8', '.', '.', '.', '.', '6', '.'},
            {'8', '.', '.', '.', '6', '.', '.', '.', '3'},
            {'4', '.', '.', '8', '.', '3', '.', '.', '1'},
            {'7', '.', '.', '.', '2', '.', '.', '.', '6'},
            {'.', '6', '.', '.', '.', '.', '2', '8', '.'},
            {'.', '.', '.', '4', '1', '9', '.', '.', '5'},
            {'.', '.', '.', '.', '8', '.', '.', '7', '9'}
        };

        boolean result = isValidSudoku(board);

        System.out.println(result);
    }
}
