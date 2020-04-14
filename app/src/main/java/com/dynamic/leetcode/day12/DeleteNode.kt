package com.dynamic.leetcode.day12

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/14
 * 删除某个节点
 */
object DeleteNode {
    fun deleteNode(head: ListNode?, `val`: Int): ListNode? {
        if (head == null) {
            return null
        }
        if (head.`val` == `val`) {
            return head.next
        }
        var cur = head
        var pre: ListNode? = null
        while (cur != null) {
            if(cur.`val` == `val`){
                pre?.next = cur.next
                return head
            }
            pre = cur
            cur = cur.next
        }
        return head
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}