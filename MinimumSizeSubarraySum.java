// Link: https://leetcode.com/problems/minimum-size-subarray-sum/description/?envType=study-plan-v2&envId=top-interview-150

// Given an array of positive integers nums and a positive integer target, return the minimal length of a subarray
// whose sum is greater than or equal to target. If there is no such subarray, return 0 instead.

// Example 1:
    // Input: target = 7, nums = [2,3,1,2,4,3]
    // Output: 2
        // Explanation: The subarray [4,3] has the minimal length under the problem constraint.

// Example 2:
    // Input: target = 4, nums = [1,4,4]
    // Output: 1

// Example 3:
    // Input: target = 11, nums = [1,1,1,1,1,1,1,1]
    // Output: 0

public class MinimumSizeSubarraySum {

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        
        int left = 0;
        int sum = 0;
        int minimum = Integer.MAX_VALUE;

        for(int i = 0; i<n; i++) {
            sum += nums[i];
            while (sum >= target) {
                int tempCal = i - left + 1;
                minimum = Math.min(tempCal , minimum);
                sum -= nums[left];
                left += 1;
            }
        }
        
        return minimum;

        // int maximum = Integer.MIN_VALUE;
        // int sum = 0;

        // for(int i = 0; i<n; i++) {
        //     if (nums[i] == target) {
        //         sum++;
        //         return sum;
        //     }
        //     for(int j = i; j<n; j++) {
        //         if (nums[i] + nums[j] == target) {
        //             sum++;
        //         } else {
        //             maximum = Math.max(maximum, sum);
        //         }
        //     }
        // }
        // return maximum;
    }
    public static void main(String[] args) {
        int[] arr = {2,3,1,2,4,3};
        int target = 7;

        int result = minSubArrayLen(target, arr);

        System.out.println(result);


    }
}
