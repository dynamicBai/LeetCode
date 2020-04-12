package com.dynamic.leetcode.day11

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/12
 *  合并2个有序链表
 */
object MergeTwoSortLinkedList {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        var curL1 = l1
        var curL2 = l2
        val head = ListNode(-1)
        var cur: ListNode? = head
        while (curL1 != null && curL2 != null) {
            if (curL1.`val` < curL2.`val`) {
                cur?.next = curL1
                curL1 = curL1.next
            } else {
                cur?.next = curL2
                curL2 = curL2.next
            }
            cur = cur?.next
        }

        if (curL1 != null) {
            cur?.next = curL1
        }
        if (curL2 != null) {
            cur?.next = curL2
        }
        return head.next
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}