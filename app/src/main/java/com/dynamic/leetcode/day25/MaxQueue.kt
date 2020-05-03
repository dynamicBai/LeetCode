package com.dynamic.leetcode.day25

import java.util.*

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/3
 *
 */
object MaxQueue {
    private val queue = LinkedList<Int>()
    private val slideWindow = LinkedList<Int>()

    fun max_value(): Int {
        if (queue.isEmpty()) {
            return -1
        }
        return slideWindow.peekFirst()
    }

    fun push_back(value: Int) {
        queue.offer(value)
        while (!slideWindow.isEmpty() && slideWindow.peekLast() < value) {
            slideWindow.pollLast()
        }
        slideWindow.offer(value)

    }

    fun pop_front(): Int {
        if (queue.isEmpty()) {
            return -1
        }
        val value = queue.pollFirst()
        if (slideWindow.peekFirst() == value) {
            slideWindow.pollFirst()
        }
        return value
    }
}