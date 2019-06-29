package xyz.zhchenxin.leetcode._009;


/**
 * https://leetcode-cn.com/problems/palindrome-number/
 *
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
        if (!(new Solution()).isPalindrome(121)) {
            throw new Exception("异常");
        }
        if ((new Solution()).isPalindrome(-121)) {
            throw new Exception("异常");
        }
        if ((new Solution()).isPalindrome(10)) {
            throw new Exception("异常");
        }
    }

}

class Solution {
    public boolean isPalindrome(int x) {
        if (x < 0 ){
            return false;
        }
        return reverse(x) == x;
    }

    /**
     * 将数字反转
     */
    public int reverse(int x) {
        int ret = 0;
        while (x != 0) {
            int pod = x % 10; // 取出最低位
            x = x / 10; // 降位
            if ((ret > Integer.MAX_VALUE / 10) || (ret == Integer.MAX_VALUE / 10 && pod > 7)) {
                return 0;
            }
            if ((ret < Integer.MIN_VALUE / 10)  || (ret == Integer.MIN_VALUE / 10 && pod < -8)){
                return 0;
            }
            ret = ret * 10 + pod; // 将pod添加到ret变量的最后一位
        }
        return ret;
    }
}
