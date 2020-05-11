package com.dynamic.leetcode.day27

import java.util.*

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/11
 *-2,0,-3
 */
class MinStack {
    private val stack = Stack<Int>()
    private val supStack = Stack<Int>()

    fun push(x: Int) {
        stack.push(x)
        if (supStack.isEmpty() || supStack.peek() > x) {
            supStack.push(x)
        } else {
            supStack.push(supStack.peek())
        }
    }

    fun pop() {
        val x = stack.pop()
        supStack.pop()
    }

    fun top(): Int {
        return stack.peek()
    }

    fun min(): Int {
        return supStack.peek()
    }

    companion object {
        fun test() {
            val minStack = MinStack()
            minStack.push(-2);
            minStack.push(0);
            minStack.push(-3);
            minStack.min();
            minStack.pop();
            minStack.top();
            minStack.min();
        }
    }
}