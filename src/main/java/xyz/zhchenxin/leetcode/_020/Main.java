package xyz.zhchenxin.leetcode._020;


import java.util.*;

/**
 * https://leetcode-cn.com/problems/valid-parentheses
 *
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 */
public class Main {

    public static void main(String[] args) throws Exception {
//        if (!(new Solution()).isValid("()[]{}")) {
//            throw new Exception("异常");
//        }
        if ((new Solution()).isValid("([)]")) {
            throw new Exception("异常");
        }
    }

}

class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<Character>();
        Set<Character> config = new HashSet<Character>(Arrays.asList('(', ')', '{', '}', '[', ']'));

        for (int i = 0; i < s.length(); i++) {
            Character ch = s.charAt(i);
            if (config.contains(ch)) {
                if (stack.empty()) {
                    stack.add(ch);
                    continue;
                }
                // 取出队列中最后一位
                Character c = stack.peek();
                if ((c == '(' && ch == ')') || (c == '{' && ch == '}') || (c == '[' && ch == ']')) {
                    stack.pop();
                } else {
                    stack.add(ch);
                }
            }
        }
        return stack.isEmpty();
    }
}
