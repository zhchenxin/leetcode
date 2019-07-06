package xyz.zhchenxin.leetcode._058;


/**
 * https://leetcode-cn.com/problems/length-of-last-word/
 *
 * 最后一个单词的长度
 *
 * 给定一个仅包含大小写字母和空格 ' ' 的字符串，返回其最后一个单词的长度。
 *
 * 如果不存在最后一个单词，请返回 0 。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(new Solution().lengthOfLastWord("Hello World"));
        System.out.println(new Solution().lengthOfLastWord("Hello World"));
    }



}

class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        int length = 0;
        for (int i = s.length()-1; i>=0; i--) {
            if (s.charAt(i) == ' ') {
                return length;
            }
            length++;
        }
        return s.equals(" ") ? 0 : s.length();
    }
}


