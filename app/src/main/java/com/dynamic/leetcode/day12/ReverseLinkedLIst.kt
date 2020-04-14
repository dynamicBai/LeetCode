package com.dynamic.leetcode.day12

import java.util.*

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/14
 * 翻转链表
 */
object ReverseLinkedLIst {
    fun reverseList(head: ListNode?): ListNode? {
        val stack = Stack<ListNode>()
        var cur = head
        while (cur != null) {
            stack.push(cur)
            cur = cur.next
        }
        val newHead = ListNode(-1)
        var newCur: ListNode? = newHead
        while (!stack.isEmpty()) {
            val node = stack.pop()
            node.next = null
            newCur?.next = node
            newCur = newCur?.next
        }
        return newHead.next
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}