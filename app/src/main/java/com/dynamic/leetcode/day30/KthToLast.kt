package com.dynamic.leetcode.day30

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/31
 *实现一种算法，找出单向链表中倒数第 k 个节点。返回该节点的值。

注意：本题相对原题稍作改动

示例：

输入： 1->2->3->4->5 和 k = 2
输出： 4
说明：

给定的 k 保证是有效的。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/kth-node-from-end-of-list-lcci
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
object KthToLast {
    fun kthToLast(head: ListNode?, k: Int): Int {
        var fast = head
        var slow = head
        for (i in 0 until k) {
            fast = fast?.next
        }
        while (fast != null) {
            fast = fast.next
            slow = slow?.next
        }
        return slow?.`val` ?: -1
    }


    class ListNode(var `val`: Int) {
        var next: ListNode? = null
    }
}