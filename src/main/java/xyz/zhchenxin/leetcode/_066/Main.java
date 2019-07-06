package xyz.zhchenxin.leetcode._066;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * https://leetcode-cn.com/problems/plus-one/
 *
 给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。

 最高位数字存放在数组的首位， 数组中每个元素只存储一个数字。

 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(new Solution().plusOne(new int[]{1,2,3}));
    }

}

class Solution {
    public int[] plusOne(int[] digits) {
        List<Integer> ret = new ArrayList<>();
        int tmp = (digits[digits.length-1] + 1);
        int plus = tmp >= 10 ? 1 : 0; // 进位
        ret.add(tmp % 10);
        for (int i = digits.length - 2; i>=0; i--) {
            tmp = digits[i]+plus;
            plus = tmp >= 10 ? 1 : 0; // 进位
            ret.add(tmp % 10);
        }
        if (plus != 0) {
            ret.add(plus);
        }
        Collections.reverse(ret);
        return ret.stream().mapToInt(Integer::valueOf).toArray();
    }
}


