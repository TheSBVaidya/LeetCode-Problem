// Link: https://leetcode.com/problems/container-with-most-water/?envType=study-plan-v2&envId=top-interview-150

// You are given an integer array height of length n. 
// There are n vertical lines drawn suchhe that the two endpoints of the ith line are (i, 0) and (i, height[i]).
// Find two lines that together with the x-axis form a container, such that the container contains the most water.
// Return the maximum amount of water a container can store.
// Notice that you may not slant the container.

// Example 1:
    // Input: height = [1,8,6,2,5,4,8,3,7]
    // Output: 49
    // Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.

// Example 2:
    // Input: height = [1,1]
    // Output: 1

public class ContainerWithMostWater {
    public static void maxArea(int[] height) {
        int n = height.length;
        int left = 0 , right = n-1;
        int maxValue = 0;

        while (left < right) {
            int minValur = Math.min(height[left], height[right]) * (right - left);
            maxValue = Math.max(maxValue, minValur);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(maxValue);
    }
    public static void main(String[] args) {
        int[] arr = {1,8,6,2,5,4,8,3,7};
        
        maxArea(arr);
    }
}
