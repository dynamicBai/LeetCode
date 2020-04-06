package com.dynamic.leetcode.day5

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/6
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
Output: 7 -> 0 -> 8
Explanation: 342 + 465 = 807.
 *
 */
object AddTwoNumbers {
    fun addTwoNumbers(l1: ListNode?, l2: ListNode?): ListNode? {
        //1.可能链表长度不一样
        //2.进位
        var param1 = l1
        var param2 = l2
        val head = ListNode(-1)
        var cur: ListNode? = head
        //表示是否进位
        var hasAdd = false
        while (param1 != null && param2 != null) {
            var sum = param1.`val` + param2.`val`
            if (hasAdd) {
                sum += 1
            }
            if (sum >= 10) {
                cur?.next = ListNode(sum - 10)
                hasAdd = true
            } else {
                cur?.next = ListNode(sum)
                hasAdd = false
            }
            param1 = param1.next
            param2 = param2.next
            cur = cur?.next
        }
        if (param1 != null) {
            while (param1 != null) {
                val num = if (hasAdd) {
                    param1.`val` + 1
                } else {
                    param1.`val`
                }
                if (num >= 10) {
                    cur?.next = ListNode(num - 10)
                    hasAdd = true
                } else {
                    cur?.next = ListNode(num)
                    hasAdd = false
                }
                cur = cur?.next
                param1 = param1.next
            }
        }

        if (param2 != null) {
            while (param2 != null) {
                val num = if (hasAdd) {
                    param2.`val` + 1
                } else {
                    param2.`val`
                }
                if (num >= 10) {
                    cur?.next = ListNode(num - 10)
                    hasAdd = true
                } else {
                    cur?.next = ListNode(num)
                    hasAdd = false
                }
                cur = cur?.next
                param2 = param2.next
            }
        }
        //全部都加完了 还有进位
        if (hasAdd) {
            cur?.next = ListNode(1)
        }
        return head.next
    }

    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}