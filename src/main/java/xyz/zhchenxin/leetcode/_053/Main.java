package xyz.zhchenxin.leetcode._053;


/**
 * https://leetcode-cn.com/problems/maximum-subarray/
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(new Solution().maxSubArray(new int[]{-2,1,-3,4,-1,2,1,-5,4}));
    }

}

/**
 * 优化思路法
 */
class Solution {
    public int maxSubArray(int[] nums) {
        int sum = 0,maxSum = nums[0];
        for (int i = 0; i < nums.length; i++) {
            sum = sum > 0 ? sum+nums[i] : nums[i];
            maxSum = Math.max(sum, maxSum);
        }
        return maxSum;
    }
}
