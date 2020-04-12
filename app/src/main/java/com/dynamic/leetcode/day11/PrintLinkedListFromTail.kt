package com.dynamic.leetcode.day11

import java.util.*
import kotlin.collections.ArrayList

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/12
 * 逆向遍历链表 输出为数组
 */
object PrintLinkedListFromTail {
    fun reversePrint(head: ListNode?): IntArray {
        val stack = Stack<ListNode>()
        var cur = head
        while (cur != null) {
            stack.push(cur)
            cur = cur.next
        }
        val list = ArrayList<Int>()
        while (!stack.isEmpty()) {
            list.add(stack.pop().`val`)
        }
        return list.toIntArray()
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}