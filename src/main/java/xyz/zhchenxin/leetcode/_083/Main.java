package xyz.zhchenxin.leetcode._083;


import java.util.HashSet;
import java.util.Set;

/**
 https://leetcode-cn.com/problems/remove-duplicates-from-sorted-list/

 给定一个排序链表，删除所有重复的元素，使得每个元素只出现一次。
 */
public class Main {

    public static void main(String[] args) throws Exception {
    }

}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}


class Solution {

    public ListNode deleteDuplicates(ListNode head) {
        ListNode node = head;
        ListNode pre = head; // 前一个节点
        while (node!=null) {
            if (pre.val == node.val) {
                // 有重复的元素, 删除本节点
                pre.next = node.next;
            } else {
                pre = node;
            }
            node = node.next;
        }
        return head;
    }
}


