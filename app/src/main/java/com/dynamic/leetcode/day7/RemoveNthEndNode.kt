package com.dynamic.leetcode.day7

import com.dynamic.leetcode.day3.MergeTwoSortedLinkedListSolution
import java.util.*

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/8
 * 单项链表 移除倒数n node
 */
object RemoveNthEndNode {
    fun removeNthFromEnd(head: ListNode?, n: Int): ListNode? {
        //1.先找到倒数n 在正数的位置
        //2.移除m node
        //这里采用stack实现

        val stack = Stack<ListNode>()
        var headVar = head
        while (headVar != null) {
            stack.push(headVar)
            headVar = headVar.next
        }
        if (stack.isEmpty()) {
            return null
        }

        //n+1.next = n-1
        var nNextNode: ListNode? = null
        var nPreNode: ListNode? = null

        for (index in 0 until stack.size) {
            if (stack.isEmpty()) {
                break
            }
            if (index == n - 2) {
                nNextNode = stack.peek()
            }
            if (index == n) {
                nPreNode = stack.peek()
            }
            stack.pop()
        }

        nPreNode?.next = nNextNode

        if (nPreNode == null) {
            //说明删的是倒数第一个 即为head
            return head?.next
        }
        return head
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }

    fun buildListNode(intArray: IntArray): ListNode? {
        val head = ListNode(-1)
        var cur: ListNode? = head
        for (index in intArray.indices) {
            cur?.next = ListNode(intArray[index])
            cur = cur?.next
        }
        return head.next
    }
}