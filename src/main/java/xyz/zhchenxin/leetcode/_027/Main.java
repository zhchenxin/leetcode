package xyz.zhchenxin.leetcode._027;



public class Main {

    public static void main(String[] args) throws Exception {
        if (8 != (new Solution()).removeElement(new int[]{0, 0, 1, 1, 1, 2, 2, 3, 3, 4}, 0)) {
            throw new Exception("异常");
        }
    }

}


class Solution {
    public int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int i = 0;
        for (int j = 0; j < nums.length; j++) {
            if (nums[j] == val) {
                continue;
            }
            nums[i+1] = nums[j];
            i++;
        }
        return i+1;
    }
}