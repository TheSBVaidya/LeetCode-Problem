//link: https://leetcode.com/problems/rotate-image/description/

// You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
// You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. 
// DO NOT allocate another 2D matrix and do the rotation.

// Example 1:
    // Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
    // Output: [[7,4,1],[8,5,2],[9,6,3]]

// Example 2:
    // Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
    // Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]

public class RotateImage {

    public static void rotate(int[][] matrix) {
        int n = matrix.length;


        // Step 1: Transpose 
        // 1, 5, 9,  13
        // 2, 6, 10, 14
        // 3, 7, 11, 15
        // 4, 8, 12, 16
        for(int i = 0; i<n; i++) {
            for(int j = i; j<n; j++) {
                //swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }

        for(int i = 0; i<n; i++) {
            for(int j = 0; j<n/2; j++) {
                //swap
                int temp = matrix[i][j];
                matrix[i][j] = matrix[i][n-1-j];
                matrix[i][n-1-j] = temp;
            }
        }

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
    public static void main(String[] args) {
        int[][] arr = { {1,  2,  3,  4} ,       // 13, 9,  5, 1 
                        {5,  6,  7,  8} ,       // 14, 10, 6, 2
                        {9,  10, 11, 12} ,      // 15, 11, 7, 3 
                        {13, 14, 15, 16}};      // 16, 12, 8, 4

        
        rotate(arr);
    }
}
