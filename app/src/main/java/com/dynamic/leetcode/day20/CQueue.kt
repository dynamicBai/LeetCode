package com.dynamic.leetcode.day20

import java.util.*

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/23
 *  用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 */
object CQueue {
    private val stack1 = Stack<Int>()
    private val stack2 = Stack<Int>()
    fun appendTail(value: Int) {
        stack1.push(value)
    }

    fun deleteHead(): Int {
        if (stack2.isEmpty()) {
            if (stack1.isEmpty()) {
                return -1
            }
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop())
            }
            return stack2.pop()

        } else {
            return stack2.pop()
        }
    }
}