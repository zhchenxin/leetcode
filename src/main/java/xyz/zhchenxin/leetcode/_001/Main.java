package xyz.zhchenxin.leetcode._001;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode-cn.com/problems/two-sum/
 *
 * 给定一个整数数组 nums 和一个目标值 target，请你在该数组中找出和为目标值的那 两个 整数，并返回他们的数组下标。
 *
 * 你可以假设每种输入只会对应一个答案。但是，你不能重复利用这个数组中同样的元素
 *
 */
public class Main {

    public static void main(String[] args){
        Solution solution = new Solution();
        int[] result = solution.twoSum(new int[]{2, 7, 11, 15}, 9);
        assert Arrays.equals(new int[]{0,1}, result);

        Solution1 solution1 = new Solution1();
        result = solution1.twoSum(new int[]{2, 7, 11, 15}, 9);
        assert Arrays.equals(new int[]{0,1}, result);
    }

}

/**
 * 双重循环
 */
class Solution {
    public int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }
        return result;
    }
}

/**
 * 使用map
 */
class Solution1 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target-nums[i])) {
                return new int[]{map.get(target-nums[i]), i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("未找到");
    }
}

