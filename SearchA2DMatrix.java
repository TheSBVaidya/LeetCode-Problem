//link: https://leetcode.com/problems/search-a-2d-matrix/description/

// You are given an m x n integer matrix matrix with the following two properties:
    // Each row is sorted in non-decreasing order.
    // The first integer of each row is greater than the last integer of the previous row.
// Given an integer target, return true if target is in matrix or false otherwise.

// You must write a solution in O(log(m * n)) time complexity.

// Example 1:
    // Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 3
    // Output: true

// Example 2:
    // Input: matrix = [[1,3,5,7],[10,11,16,20],[23,30,34,60]], target = 13
    // Output: false

public class SearchA2DMatrix {

    public static void searchMatrix(int[][] matrix , int target) {
        int n = matrix[0].length;
        int m = matrix.length;  

        int low = 0;
        int high = n*m - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            int midMatrix = matrix[mid / n][mid % n];

            if (midMatrix == target) {
                System.out.println("row: " + mid / n + " column: " +mid % n );
                break;
            } else if (midMatrix < target) {
                low = mid + 1;
            } else if (midMatrix > target) {
                high = mid - 1;
            } else {
                System.out.println("Not Found!");
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,3,5,7},{10,11,16,20},{23,30,34,60}};
        int target = 10;

        searchMatrix(arr,target);
    }
}
