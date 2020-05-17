package com.dynamic.leetcode.day29

import java.lang.StringBuilder
import java.util.*

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/17
 *比较含退格的字符串
 */
object BackspaceCompare {
    fun backspaceCompare(S: String, T: String): Boolean {
        val stack = Stack<Char>()
        for (index in S.indices) {
            if (S[index] == '#') {
                if (!stack.isEmpty()) {
                    stack.pop()
                }
            } else {
                stack.push(S[index])
            }
        }
        val sb = StringBuilder()
        while (!stack.isEmpty()) {
            sb.append(stack.pop())
        }
        val resultS = sb.toString()

        stack.clear()
        sb.clear()

        for (index in T.indices) {
            if (T[index] == '#') {
                if (!stack.isEmpty()) {
                    stack.pop()
                }
            } else {
                stack.push(T[index])
            }
        }
        while (!stack.isEmpty()) {
            sb.append(stack.pop())
        }
        val resultT = sb.toString()
        return resultS == resultT
    }
}