package com.dynamic.leetcode.day3

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/4
 * 熟悉链表的使用
 * 特别是返回链表时，可以head(-1).next保证cur和head分开
 * Input: 1->2->4, 1->3->4
 * Output: 1->1->2->3->4->4
 *
 */
object MergeTwoSortedLinkedListSolution {

    fun buildListNode(intArray: IntArray): ListNode? {
        val head = ListNode(-1)
        var cur: ListNode? = head
        for (index in intArray.indices) {
            cur?.next = ListNode(intArray[index])
            cur = cur?.next
        }
        return head.next
    }


    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        val head = ListNode(-1)
        var cur: ListNode? = head
        var varL1 = l1
        var varL2 = l2
        while (varL1 != null && varL2 != null) {
            if (varL1.`val` < varL2.`val`) {
                cur?.next = varL1
                varL1 = varL1.next
            } else {
                cur?.next = varL2
                varL2 = varL2.next
            }
            cur = cur?.next
        }
        if (varL1 == null) {
            cur?.next = varL2
        }
        if (varL2 == null) {
            cur?.next = varL1
        }
        return head.next
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}