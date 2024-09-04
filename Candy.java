// Link: https://leetcode.com/problems/candy/?envType=study-plan-v2&envId=top-interview-150

// There are n children standing in a line. Each child is assigned a rating value given in the integer array ratings.
// You are giving candies to these children subjected to the following requirements:
    // 1. Each child must have at least one candy.
    // 2. Children with a higher rating get more candies than their neighbors.
    // 3. Return the minimum number of candies you need to have to distribute the candies to the children.

// Example 1:
    // Input: ratings = [1,0,2]
    // Output: 5
    // Explanation: You can allocate to the first, second and third child with 2, 1, 2 candies respectively.

// Example 2:
    // Input: ratings = [1,2,2]
    // Output: 4
    // Explanation: You can allocate to the first, second and third child with 1, 2, 1 candies respectively.
    //              The third child gets 1 candy because it satisfies the above two conditions.

public class Candy {
    public static int candy(int[] ratings) {
        int n = ratings.length;

        // creating new arrays for left and right and Max numbers stores
        int[] leftArr = new int[n];
        int[] rightArr = new int[n];
        // int[] maxArr = new int[n];

        int left = 1;
        int right = 1;

        // for left side part
        leftArr[0] = left;
        for(int i = 1; i<n; i++) {
            if (ratings[i] > ratings[i-1]) {
                left++;
            } else {
                left = 1;
            }
            leftArr[i] = left;
        }

        // for right side part
        rightArr[n-1] = right;
        for(int i = n-2; i>=0; i--) {
            if (ratings[i] > ratings[i+1]) {
                right++;
            } else {
                right = 1;
            }
            rightArr[i] = right;

        }

        int sum = 0;
        for(int i = 0; i<n; i++) {
            sum = Math.max(leftArr[i], rightArr[i]) + sum;
        }

        // System.out.println(sum);

        // for max number between both array 
        //int sum = 0;
        // for(int i = 0; i<=n-1; i++) {
        //     int maxNo = Math.max(leftArr[i], rightArr[i]);

        //     maxArr[i] = maxNo;

        //     sum = maxArr[i] + sum;

        // }

        // for (int i : leftArr) {
        //     System.out.print(i + " ");
        // }

        // System.out.println();

        // for (int i : rightArr) {
        //     System.out.print(i + " ");
        // }

        // System.out.println();

        // for (int i : maxArr) {
        //     System.out.print(i + " ");
        // }

        // System.out.println(sum);

        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {0,2,4,3,2,1,1,3,5,6,4,0,0};

        // int[] arr = {1,2,3,1};

        int result = candy(arr);

        System.out.println(result);

        // candy(arr);
    }
}
