package xyz.zhchenxin.leetcode._028;


/**
 * https://leetcode-cn.com/problems/implement-strstr/
 *
 * 实现 strStr() 函数。
 *
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        if (2 != (new Solution()).strStr("hello", "ll")) {
            throw new Exception("异常");
        }
    }

}


class Solution {
    public int strStr(String haystack, String needle) {
        return haystack.indexOf(needle);
    }
}