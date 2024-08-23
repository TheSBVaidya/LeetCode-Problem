// link : https://leetcode.com/problems/max-consecutive-ones/description/

// Given a binary array nums, return the maximum number of consecutive 1's in the array.

// Example 1:
    // Input: nums = [1,1,0,1,1,1]
    // Output: 3
// Explanation: The first two digits or the last three digits are consecutive 1s. The maximum number of consecutive 1s is 3.

// Example 2:
    // Input: nums = [1,0,1,1,0,1]
    // Output: 2


public class MaxConsecutiveOnes {

    public static int findMaxConsecutiveOnes(int[] nums) {
        int n = nums.length;

        int sum = 0;
        int maximum = Integer.MIN_VALUE;
        for(int i = 0; i<n; i++) {
            if (nums[i] == 1) {
                sum++;
            } else {
                maximum = Math.max(maximum, sum);
                sum = 0;
            }

        }

        if (maximum > sum) {
            return maximum;
        }
        
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,1,0,1,1,1};

        int result = findMaxConsecutiveOnes(arr);

        System.out.println(result);
    }
}
