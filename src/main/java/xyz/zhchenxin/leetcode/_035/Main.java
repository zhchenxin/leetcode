package xyz.zhchenxin.leetcode._035;


/**
 * https://leetcode-cn.com/problems/search-insert-position/
 *
 * 给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
 *
 * 你可以假设数组中无重复元素。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        if (2 != (new Solution()).searchInsert(new int[]{1,3,5,6}, 5)) {
            throw new Exception("异常");
        }
        if (4 != (new Solution()).searchInsert(new int[]{1,3,5,6}, 7)) {
            throw new Exception("异常");
        }
    }

}

/**
 * 二分查找
 */
class Solution {
    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        while (left <= right) {
            int mid = (left + right) / 2;
            if (nums[mid] == target) {
                return mid;
            } else if (nums[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return left;
    }
}