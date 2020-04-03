package com.dynamic.leetcode.day1

import java.util.*

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/1
 *  (,),[,],{,}
 *  开心消消乐？
 */
object ParentheseSolution {
    fun isValid(s: String): Boolean {
        if (s.isEmpty()) {
            return true
        }
        val mStack = Stack<Char>()
        mStack.push(s[0])
        for (index in 1 until s.length) {
            //注意这里stack可能为null
            if (!mStack.isEmpty() && checkEqual(s[index], mStack.peek())) {
                mStack.pop()
            } else {
                mStack.push(s[index])
            }
        }
        return mStack.isEmpty()
    }

    /**
     * 判断括号相消
     * 只有在右符号时才判断是否抵消，否则直接入栈
     */
    fun checkEqual(candidate: Char, stackTop: Char): Boolean {
        if (candidate == ')' && stackTop == '(') {
            return true
        }

        if (candidate == ']' && stackTop == '[') {
            return true
        }

        if (candidate == '}' && stackTop == '{') {
            return true
        }

        return false
    }
}