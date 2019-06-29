package xyz.zhchenxin.leetcode._026;


import java.util.HashSet;

/**
 *
 *
 * 给定一个排序数组，你需要在原地删除重复出现的元素，使得每个元素只出现一次，返回移除后数组的新长度。
 *
 * 不要使用额外的数组空间，你必须在原地修改输入数组并在使用 O(1) 额外空间的条件下完成。
 *
 * 来源：力扣（LeetCode）
 * 链接：https://leetcode-cn.com/problems/remove-duplicates-from-sorted-array
 * 著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        if (3 != (new Solution()).removeDuplicates(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4})) {
            throw new Exception("异常");
        }
    }

}


class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int  j = 0; j < nums.length; j++) {
            if (nums[i] != nums[j]) {
                nums[i+1] = nums[j];
                i++;
            }
        }
        return i+1;
    }
}
