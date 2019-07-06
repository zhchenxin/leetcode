package xyz.zhchenxin.leetcode._069;


/**
 https://leetcode-cn.com/problems/sqrtx/

 实现 int sqrt(int x) 函数。

 计算并返回 x 的平方根，其中 x 是非负整数。

 由于返回类型是整数，结果只保留整数的部分，小数部分将被舍去。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(new Solution().mySqrt(4)); // 2
        System.out.println(new Solution().mySqrt(8)); // 2
    }

}

class Solution {
    public int mySqrt(int x) {
        long l = 0;
        long r = x / 2 + 1;
        while (l < r) {
            // 注意：这里一定取右中位数，如果取左中位数，代码可能会进入死循环
            long mid = l + (r - l + 1) / 2;
            long square = mid * mid;
            if (square > x) {
                r = mid - 1;
            } else {
                l = mid;
            }
        }
        return (int) l;
    }
}


