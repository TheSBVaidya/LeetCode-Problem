// Link: https://leetcode.com/problems/set-matrix-zeroes/description/?envType=study-plan-v2&envId=top-interview-150

// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's.
// You must do it in place.

// Example 1:
    // Input: matrix = [[1,1,1],
    //                 [1,0,1],
    //                 [1,1,1]  ]

    // Output: [   [1,0,1],
    //             [0,0,0], 
    //             [1,0,1]  ]

// Example 2:
    // Input: matrix = [   [0,1,2,0],
    //                     [3,4,5,2],
    //                     [1,3,1,5]   ]

    // Output: [    [0,0,0,0],
    //              [0,4,5,0],
    //              [0,3,1,0]   ]

import java.util.Arrays;

public class SetMatrixZeroes {

    public static void setZeroes(int[][] matrix) {
        int n = matrix[0].length;
        int m = matrix.length;
        
        // OPTIMAL APPROACH
        int col0 = 1;
        for(int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++) {
                if (matrix[i][j] == 0) {
                    matrix[i][0] = 0;

                    if(j != 0) {
                        matrix[0][j] = 0;
                    } else {
                        col0 = 0;
                    }
                }
            }
        }

        for(int i = 1; i < m; i++) {
            for(int j = 1; j < n; j++) {
                if (matrix[i][j] != 0) {
                    if (matrix[0][j] == 0 || matrix[i][0] == 0) {
                        matrix[i][j] = 0;
                    }
                }
            }
        }

        // Edge cases 
        if (matrix[0][0] == 0) {
            for(int j = 0; j<n; j++) {
                matrix[0][j] = 0;
            }
        }

        if (col0 == 0) {
            for(int i = 0; i<m; i++) {
                matrix[i][0] = 0;
            }
        }

        // BETTER APPROACH
        // int[] rows = new int[n];
        // int[] cols = new int[m];

        // for(int i = 0; i < m; i++) {
        //     for(int j = 0; j < n; j++) {
        //         if (matrix[i][j] == 0) {
        //             rows[j] = 1;
        //             cols[i] = 1;
        //         }
        //     }
        // }

        // for(int i = 0; i < m; i++) {
        //     for(int j = 0; j < n; j++) {
        //         if (rows[i] == 1 || rows[j] == 1) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        // // System.out.println(Arrays.toString(rows));
        // // System.out.println(Arrays.toString(cols));

        // BRUTE FORCE APPROACHE
        // for(int i = 0; i<m; i++) {
        //     for(int j = 0; j<n; j++) {
        //         if (matrix[i][j] == 0) {
        //             //mark row
        //             for(int row = 0; row < n; row++) {
        //                 if (matrix[i][row] != 0) {
        //                     matrix[i][row] = -1;
        //                 }
        //             }

        //             // mark column
        //             for(int col = 0; col < m; col++) {
        //                 if (matrix[col][j] != 0) {
        //                     matrix[col][j] = -1;
        //                 }
        //             }
        //         }
        //     }
        // }

        // for(int i = 0; i<m; i++) {
        //     for(int j = 0; j<n; j++) {
        //         if (matrix[i][j] == -1) {
        //             matrix[i][j] = 0;
        //         }
        //     }
        // }

        System.out.println(Arrays.deepToString(matrix));
    }
    public static void main(String[] args) {
        // int[][] matrix = {  {1,1,1} ,
        //                     {1,0,1} , 
        //                     {1,1,1} };

        int[][] matrix = {  {0,1,2,0},
                            {3,4,5,2},
                            {1,3,1,5}   };

        setZeroes(matrix);

    }
}
