// Link: https://leetcode.com/problems/product-of-array-except-self/description/?envType=study-plan-v2&envId=top-interview-150

// Given an integer array nums, 
// return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].
// The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.
// You must write an algorithm that runs in O(n) time and without using the division operation.

// Example 1:
    // Input: nums = [1,2,3,4]
    // Output: [24,12,8,6]

// Example 2:
    // Input: nums = [-1,1,0,-3,3]
    // Output: [0,0,9,0,0]

import java.util.Arrays;

public class ProductArrayExceptSelf {
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        //new arr
        int[] newArr = new int[n];
        // TC = O(n)2
        // SC = O(1)
        // for(int i = 0; i<n; i++) {
        //     int sum = 1;
        //     for(int j = 0; j<n; j++) {
        //         if (i == j) {
        //             continue;
        //         } else { 
        //             sum = sum * nums[j];
        //         }
        //     }
        //     newArr[i] = sum;
        // }

        // int[] prefix = new int[n];
        // // int[] suffix = new int[n];

        // //for suffix
        // suffix[n-1] = nums[0];
        // for(int i = n-2; i>=0; i--) {
        //     suffix[i] = suffix[i+1] * nums[i+1];
        // }

        // //for ans
        // for(int i = 0; i<n; i++) {
        //     newArr[i] = prefix[i] * suffix[i];
        // }

        // // for prefix
        newArr[0] = 1;
        for(int i = 1; i<n; i++) {
            newArr[i] = newArr[i-1] * nums[i-1];
        }

        //for suffix in same array
        int mul = 1;
        for(int i = n-1; i>=0; i--) {
            newArr[i] = newArr[i] * mul;
            mul = mul * nums[i];
        } 

        return newArr;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};

        int result[] = productExceptSelf(arr);

        System.out.println(Arrays.toString(result));
    }
}
