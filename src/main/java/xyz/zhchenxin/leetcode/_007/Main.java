package xyz.zhchenxin.leetcode._007;


/**
 * https://leetcode-cn.com/problems/reverse-integer/
 *
 * 给出一个 32 位的有符号整数，你需要将这个整数中每位上的数字进行反转。
 */
public class Main {

    public static void main(String[] args) throws Exception {
//        if ((new Solution()).reverse(123) != 321) {
//            throw new Exception("异常");
//        }
        if ((new Solution()).reverse( 1534236469) != 0) {
            throw new Exception("异常");
        }
        if ((new Solution()).reverse(120) != 21) {
            throw new Exception("异常");
        }
    }

}

/**
 * 数字的取最低位, 降位
 */
class Solution {
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

