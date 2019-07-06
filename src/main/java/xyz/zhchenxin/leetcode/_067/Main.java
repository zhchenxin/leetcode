package xyz.zhchenxin.leetcode._067;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 https://leetcode-cn.com/problems/add-binary/

 给定两个二进制字符串，返回他们的和（用二进制表示）。

 输入为非空字符串且只包含数字 1 和 0。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(new Solution().addBinary("1111", "1111"));
        System.out.println(new Solution().addBinary("1010", "1011"));
        System.out.println(new Solution().addBinary("11", "1"));
    }

}

class Solution {
    public String addBinary(String a, String b) {
        int i = a.length()-1;
        int j = b.length()-1;
        int carry = 0; // 进位
        int sum = 0; // 每一位相加的和
        StringBuilder sb = new StringBuilder();

        while (i>=0 || j >=0) {
            sum = carry;
            if (i>=0) {
                sum += charToInt(a.charAt(i));
            }
            if (j>=0) {
                sum += charToInt(b.charAt(j));
            }
            carry = sum/2;
            sb.append(sum%2);

            i--;
            j--;
        }
        if (carry == 2) {
            sb.append("01");
        }else if(carry == 1) {
            sb.append("1");
        }
        return sb.reverse().toString();
    }

    private int charToInt(char c) {
        return c - '0';
    }
}


