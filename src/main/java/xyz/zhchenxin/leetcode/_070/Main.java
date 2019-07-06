package xyz.zhchenxin.leetcode._070;


import java.util.HashMap;
import java.util.Map;

/**
 https://leetcode-cn.com/problems/climbing-stairs/

 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。

 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？

 注意：给定 n 是一个正整数。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(new Solution().climbStairs(1)); // 1
        System.out.println(new Solution().climbStairs(2)); // 2
        System.out.println(new Solution().climbStairs(3)); // 3
        System.out.println(new Solution().climbStairs(40)); // 165580141
        System.out.println(new Solution().climbStairs(45)); // 1836311903
    }

}

/**
 * 斐波那契数列
 */
class Solution {


    public int climbStairs(int n) {
        if (n == 1) return 1;
        int[] result = new int[n+1];
        result[1] = 1;
        result[2] = 2;
        for (int i=3;i<n;i++) {
            result[i] = result[i-1] + result[i-2];
        }
        if (n == 1 | n == 2) {
            return result[n];
        }
        return result[n-1] + result[n-2];
    }
}


