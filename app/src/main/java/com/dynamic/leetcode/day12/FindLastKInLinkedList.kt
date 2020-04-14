package com.dynamic.leetcode.day12

import java.util.*

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/14
 *
 */
object FindLastKInLinkedList {
    fun getKthFromEnd(head: ListNode?, k: Int): ListNode? {
        if (head == null) {
            return null
        }
        var cur = head
        val stack = Stack<ListNode>()
        while (cur != null) {
            stack.push(cur)
            cur = cur.next
        }
        var count = 0
        while (!stack.empty()) {
            count++
            val node = stack.pop()
            if (count == k) {
                return node
            }
        }
        return null
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}