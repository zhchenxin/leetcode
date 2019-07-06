package xyz.zhchenxin.leetcode._038;


/**
 * https://leetcode-cn.com/problems/count-and-say/
 */
public class Main {

    public static void main(String[] args) throws Exception {
        System.out.println(new Solution().countAndSay(1));
        System.out.println(new Solution().countAndSay(2));
        System.out.println(new Solution().countAndSay(3));
        System.out.println(new Solution().countAndSay(4));
        System.out.println(new Solution().countAndSay(5));
    }

}

/**
 * 递归
 */
class Solution {
    public String countAndSay(int n) {
        if (n == 1){
            return "1";
        }
        String ret =  countAndSay(n-1);
        StringBuilder sb = new StringBuilder();
        Character last = ret.charAt(0);
        int count = 0;
        for (int i = 0; i < ret.length(); i++) {
            if (ret.charAt(i) != last) {
                // 上一个字符串到头了
                sb.append(count).append(last);
                count = 1;
            } else {
                count++;
            }
            last = ret.charAt(i);
        }
        sb.append(count).append(last);
        return sb.toString();
    }
}
