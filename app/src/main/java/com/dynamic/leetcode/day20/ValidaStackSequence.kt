package com.dynamic.leetcode.day20

import java.util.*

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/23
 *  输入两个整数序列，第一个序列表示栈的压入顺序，请判断第二个序列是否为该栈的弹出顺序。假设压入栈的所有数字均不相等。例如，序列 {1,2,3,4,5} 是某栈的压栈序列，序列 {4,5,3,2,1} 是该压栈序列对应的一个弹出序列，但 {4,3,5,1,2} 就不可能是该压栈序列的弹出序列。
 */
object ValidaStackSequence {
    fun validateStackSequences(pushed: IntArray, popped: IntArray): Boolean {
        val stack = Stack<Int>()
        var pushIndex = 0
        var popIndex = 0
        while (pushIndex < pushed.size) {
            stack.push(pushed[pushIndex])
            if (pushed[pushIndex] == popped[popIndex]) {
                //遇到push和pop相同的 表示进入了pop操作 可能会连续pop
                while (!stack.isEmpty() && stack.peek() == popped[popIndex]) {
                    stack.pop()
                    popIndex++
                }
            }
            pushIndex++
        }
        while (popIndex < popped.size) {
            if (stack.pop() != popped[popIndex]) {
                return false
            }
            popIndex++
        }
        return true
    }

    fun test() {
        validateStackSequences(intArrayOf(1, 2, 3, 4, 5), intArrayOf(4, 3, 5, 1, 2))
    }
}