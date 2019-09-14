package xyz.zhchenxin.leetcode._088;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws Exception {
        int[] num1 = new int[]{1,0};
        new Solution().merge(num1, 1, new int[]{2}, 1);
        System.out.println(Arrays.asList(num1)); // 1
    }
}


class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int[] intput1 = Arrays.copyOf(nums1, m);
        int i = 0 , j = 0;
        int index = 0;
        while (true){
            if (i == m) {
                System.arraycopy(nums2, j, nums1, index, n-j);
                break;
            }
            if (j == n) {
                System.arraycopy(intput1, i, nums1, index, m-i);
                break;
            }

            if (intput1[i] < nums2[j]) {
                nums1[index] = intput1[i++];
            } else {
                nums1[index] = nums2[j++];
            }

            index++;

        }
    }
}