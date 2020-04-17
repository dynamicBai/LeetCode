package com.dynamic.leetcode.day14;

import java.util.HashMap;

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/16
 * 找到两个链表的公共节点
 */
public class FindCommonNode {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        HashMap<ListNode,Integer> hashMap = new HashMap<>();
        ListNode curA = headA;
        while (curA!=null){
            hashMap.put(curA,0);
            curA = curA.next;
        }
        ListNode curB = headB;
        while (curB!=null){
            if(hashMap.containsKey(curB)){
                return curB;
            }
            curB = curB.next;
        }
        return null;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
