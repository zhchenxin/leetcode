package xyz.zhchenxin.leetcode._002;

/**
 * https://leetcode-cn.com/problems/add-two-numbers
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 */
public class Main {
    public static void main(String[] args){
//        (2 -> 4 -> 3) + (5 -> 6 -> 4) == 7 -> 0 -> 8
    }
}


class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}

class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        ListNode node = new ListNode(0);
        ListNode head = node;
        while (l1 != null || l2 != null) {
            int sum = carry;
            if (l1 != null) {
                sum += l1.val;
                l1 = l1.next;
            }
            if (l2 != null) {
                sum += l2.val;
                l2 = l2.next;
            }
            int val = sum % 10;
            carry = sum / 10;
            node.next = new ListNode(val);
            node = node.next;
        }
        if (carry != 0) {
            node.next = new ListNode(carry);
        }
        return head.next;
    }
}