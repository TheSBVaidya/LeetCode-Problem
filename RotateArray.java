// Link: https://leetcode.com/problems/rotate-array/description/?envType=study-plan-v2&envId=top-interview-150

// Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.

// Example 1:
    // Input: nums = [1,2,3,4,5,6,7], k = 3
    // Output: [5,6,7,1,2,3,4]
        // Explanation:
        // rotate 1 steps to the right: [7,1,2,3,4,5,6]
        // rotate 2 steps to the right: [6,7,1,2,3,4,5]
        // rotate 3 steps to the right: [5,6,7,1,2,3,4]

// Example 2:
    // Input: nums = [-1,-100,3,99], k = 2
    // Output: [3,99,-1,-100]
        // Explanation: 
        // rotate 1 steps to the right: [99,-1,-100,3]
        // rotate 2 steps to the right: [3,99,-1,-100]

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k % n;
        int[] rotatedArr = new int[n];

        for(int i = 0; i < n; i++) {
            // 1st iteration 
            //  rotatedArr[(0 + 3) % 7] = 3 , nums[0] = 1
            // {0,0,0,1,0,0,0,0}

            // 2nd iteration
            //  rotatedArr[(1 + 3) % 7] = 4 , nums[1] = 2
            // {0,0,0,1,2,0,0}

            // 3rd iteration
            //  rotatedArr[(2 + 3) % 7] = 5 , nums[2] = 3
            // {0,0,0,1,2,3,0}

            // 4th iteration
            //  rotatedArr[(3 + 3) % 7] = 6 , nums[3] = 4
            // {0,0,0,1,2,3,4}

            // 5th iteration
            //  rotatedArr[(4 + 3) % 7] = 0 , nums[4] = 5
            // {5,0,0,1,2,3,4}

            // 6th iteration
            //  rotatedArr[(5 + 3) % 7] = 1 , nums[5] = 6
            // {5,6,0,1,2,3,4}

            // 7th iteration
            //  rotatedArr[(6 + 3) % 7] = 2 , nums[6] = 7
            // {5,6,7,1,2,3,4}

            rotatedArr[(i + k) % n] = nums[i];
        }

        for(int i = 0; i<n; i++) {
            nums[i] = rotatedArr[i];

            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        int rotation = 3;

        rotate(arr, rotation);
    }
}
