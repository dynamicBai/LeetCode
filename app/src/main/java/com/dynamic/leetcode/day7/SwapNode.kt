package com.dynamic.leetcode.day7

import com.dynamic.leetcode.day3.MergeTwoSortedLinkedListSolution

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/8
 *  Given 1->2->3->4, you should return the list as 2->1->4->3.
 */
object SwapNode {
    fun swapPairs(head: ListNode?): ListNode? {
        //1.pre.next = second  注意second==null的case
        //2.second.next = first
        //3.pre = first
        var cur: ListNode?
        cur = head

        var pre: ListNode? = ListNode(-1)
        pre?.next = head
        var headPre = pre


        var secondNode: ListNode?
        var firstNode: ListNode?


        while (cur != null) {
            firstNode = cur
            secondNode = cur.next

            cur = secondNode?.next

            //兼容second为null的情况
            if (secondNode == null) {
                pre?.next = firstNode
            } else {
                pre?.next = secondNode
                secondNode.next = firstNode
            }
            firstNode.next = null
            pre = firstNode
        }
        return headPre?.next
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    private fun buildListNode(intArray: IntArray): ListNode? {
        val head = ListNode(-1)
        var cur: ListNode? = head
        for (index in intArray.indices) {
            cur?.next = ListNode(intArray[index])
            cur = cur?.next
        }
        return head.next
    }

    fun test() {
        swapPairs(buildListNode(intArrayOf(1, 2, 3, 4)))
    }
}