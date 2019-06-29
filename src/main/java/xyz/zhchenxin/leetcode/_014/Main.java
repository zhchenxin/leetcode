package xyz.zhchenxin.leetcode._014;


/**
 * https://leetcode-cn.com/problems/longest-common-prefix/
 *
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
//        if (!(new Solution()).longestCommonPrefix(new String[]{"flower", "flow", "flight"}).equals("fl")) {
//            throw new Exception("异常");
//        }
        if (!(new Solution()).longestCommonPrefix(new String[]{"dog","racecar","car"}).equals("")) {
            throw new Exception("异常");
        }
    }

}

class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0){
            return "";
        }
        // 找到长度最短的字符串
        String minLengthStr = strs[0];
        for (int i = 1; i < strs.length; i++) {
            if (minLengthStr.length() > strs[i].length()) {
                minLengthStr = strs[i];
            }
        }

        // 找到最长的公共前缀
        for (int i = minLengthStr.length(); i > 0; i--) {
            String prefix = minLengthStr.substring(0, i);

            boolean res = true;
            for (int j = 0; j < strs.length; j++) {
                if (!prefix.equals(strs[j].substring(0,i))) {
                    res = false;
                    break;
                }
            }
            if (res) {
                return prefix;
            }
        }
        return "";
    }
}
