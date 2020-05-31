package com.dynamic.leetcode.day29;

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/20
 */
public class ReverseList {
    public ListNode reverseList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }
        ListNode node = reverseList(head.next);
        head.next.next = head;
        head.next = null;
        return node;
    }

    class ListNode{
        ListNode next;
    }
}
