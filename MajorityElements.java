//link: https://leetcode.com/problems/majority-element/description/

// Given an array nums of size n, return the majority element.
// The majority element is the element that appears more than ⌊n / 2⌋ times. 
// You may assume that the majority element always exists in the array.

// Example 1:
    // Input: nums = [3,2,3]
    // Output: 3

// Example 2:
    // Input: nums = [2,2,1,1,1,2,2]
    // Output: 2

import java.util.HashMap;

public class MajorityElements {

    public static int majorityElements(int[] nums) {
        int n = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i<n; i++){
            int number = nums[i];
            if (map.containsKey(number)) {
                map.put(number, map.get(number) + 1);
            } else {
                map.put(number, 1);
            }
        }

        int times = n / 2;
        //checking which key is repeated more that n/2
        for(int i = 0; i<n; i++) {
            int number = nums[i];
            if (map.get(number) > times) {
                //System.out.println(nums[i]);
                //break;
                return nums[i];
            }
        }
        return 0;
    }
    public static void main(String[] args) {
        int[] arr = {11,33,33,11,33,11,33};
        
        int result = majorityElements(arr);

        System.out.println(result);
    }
}
