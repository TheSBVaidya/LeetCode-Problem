// Link: https://leetcode.com/problems/trapping-rain-water/description/?envType=study-plan-v2&envId=top-interview-150

// Given n non-negative integers representing an elevation map where the width of each bar is 1, 
// compute how much water it can trap after raining.

// Example 1:
    // Input: height = [0,1,0,2,1,0,1,3,2,1,2,1]
    // Output: 6
    // Explanation: The above elevation map (black section) is represented by array [0,1,0,2,1,0,1,3,2,1,2,1]. 
    //              In this case, 6 units of rain water (blue section) are being trapped.

// Example 2:
    // Input: height = [4,2,0,3,2,5]
    // Output: 9


public class TrappingRainWater {
    public static void trap(int[] height) {
        int n = height.length;

            // Optimal Solution
        int left = 0, right = n-1;
        int leftMax = height[left] , rightMax = height[right];
        int sum = 0;

        while (left < right) {
            if (height[left] <= height[right]) {
                if (leftMax > height[left]) {
                    sum = (leftMax - height[left]) + sum;
                } else {
                    leftMax = height[left];
                }
                left = left + 1;
            } else {
                if (rightMax > height[right]) {
                    sum = (rightMax - height[right]) + sum;
                } else {
                    rightMax = height[right];
                }
    
                right = right - 1;
            }
        }

        System.out.println(sum);

            // Brute Force
        // int[] leftMax = new int[n];
        // int[] rightMax = new int[n];

        // // for leftMax
        // leftMax[0] = height[0];
        // for(int i = 1; i<n; i++) {
        //     leftMax[i] = Math.max(leftMax[i-1], height[i]);
        // }

        // //for rightMax
        // rightMax[n-1] = height[n-1];
        // for(int i = n-2; i>=0; i--) {
        //     rightMax[i] = Math.max(rightMax[i+1], height[i]);
        // }

        // int sum = 0;
        // for(int i = 0; i<n; i++) {
        //     if (height[i] < leftMax[i] && height[i] < rightMax[i]) {
        //         sum = (Math.min(leftMax[i], rightMax[i])  - height[i]) + sum; 
        //     }
        // }

        // System.out.println(sum);
    }
    public static void main(String[] args) {
        int arr[] = {0,1,0,2,1,0,1,3,2,1,2,1};

        // int  result = trap(arr);
        // System.out.println(result);

        trap(arr);
    }
}
