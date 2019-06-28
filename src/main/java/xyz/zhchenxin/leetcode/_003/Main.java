package xyz.zhchenxin.leetcode._003;

import java.util.*;

/**
 *
 * https://leetcode-cn.com/problems/longest-substring-without-repeating-characters/
 *
 * 给定一个字符串，请你找出其中不含有重复字符的 最长子串 的长度。
 */
public class Main {

    public static void main(String[] args) throws Exception {
        if ((new Solution()).lengthOfLongestSubstring("abcabcbb") != 3) {
            throw new Exception("异常");
        }
        if ( (new Solution()).lengthOfLongestSubstring("bbbbb") != 1) {
            throw new Exception("异常");
        }

        if ( (new Solution()).lengthOfLongestSubstring("pwwkew") != 3) {
            throw new Exception("异常");
        }
        if ( (new Solution()).lengthOfLongestSubstring(" ") != 1) {
            throw new Exception("异常");
        }
        if ( (new Solution()).lengthOfLongestSubstring("dvdf") != 3) {
            throw new Exception("异常");
        }

        if ( (new Solution()).lengthOfLongestSubstring("abba") != 2) {
            throw new Exception("异常");
        }
    }

}

/**
 * 滑动窗口
 */
class Solution {
    public int lengthOfLongestSubstring(String s) {
        int maxLength = 0;
        Map<Character, Integer> map = new HashMap<Character, Integer>();

        for (int start=1, end=1; end <= s.length(); end++) {
            Character ch = s.charAt(end-1);

            if (map.containsKey(ch)) {
                start = Math.max(map.get(ch)+1, start);
            }
            maxLength = Math.max(maxLength, end-start+1);

            map.put(ch, end);
        }

        return maxLength;
    }
}