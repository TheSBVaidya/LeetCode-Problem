//link: https://leetcode.com/problems/maximum-subarray/description/

public class MaximumSubarray {
    // Integer.MIN_VALUE - a constant in the Integer class that represents the minimum or least integer value that can be 
    // represented in 32 bits, which is -2147483648, -231


    // Brute Force -------------
    // public static int maxSubArray(int[] nums) {
    //     int n = nums.length;

    //     int maxi = Integer.MIN_VALUE; 
    //     for(int i = 0; i<n; i++) {
    //         for(int j = i; j<n; j++) {
    //             int sum = 0;
    //             for(int k = i; k<=j; k++) {
    //                 sum += nums[k];
    //             }
    //             maxi = Math.max(sum, maxi);
    //         }
    //     }
    //     return maxi;
    // }


    // Better Force -------------
    // public static int maxSubArray(int[] nums) {
    //     int n = nums.length;
    //     int maxi = Integer.MIN_VALUE;
        
    //     for(int i = 0; i<n; i++) {
    //         int sum = 0;
    //         for(int j = i; j<n; j++) {
    //             sum += nums[j];

    //             maxi = Math.max(sum, maxi);
    //         }
    //     }
    //     return maxi;
    // }

    public static int maxSubArray(int[] nums) {
        int n = nums.length;

        int maximum = Integer.MIN_VALUE;

        int sum = 0;
        for(int i = 0; i<n; i++) {
            sum += nums[i]; 

            if (sum > maximum) {
                maximum = sum;
            }

            if (sum < 0) {
                sum = 0;
            }
           // maximum = Math.max(maximum, sum);
        }
        
        return maximum;
    }
    public static void main(String[] args) {
        int[] arr = {-2,1,-3,4,-1,2,1,-5,4};

        int result = maxSubArray(arr);

        System.out.println(result);

    }
}
