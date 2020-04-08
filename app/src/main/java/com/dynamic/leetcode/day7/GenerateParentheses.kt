package com.dynamic.leetcode.day7

import java.util.*
import kotlin.collections.ArrayList

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/8
 *
 */
object GenerateParentheses {
    fun generateParenthesis(n: Int): List<String> {
        val result = ArrayList<String>()
        val charArray = CharArray(2 * n)
        //遍历所有的组合
        dfsGetStr(0, n, result, charArray)
        //删掉不合规的
        val iterator = result.iterator()
        while (iterator.hasNext()) {
            val str = iterator.next()
            if (!checkValidate(str)) {
                iterator.remove()
            }
        }
        return result
    }


    /**
     * 深度遍历 获取树的所有路径 即所有case
     * 其实有的子树可以直接return 比如 )开头 或者 )数量比(数量多 这种一定不对
     */
    private fun dfsGetStr(index: Int, paris: Int, result: ArrayList<String>, charArray: CharArray) {
        if (index == paris * 2) {
            result.add(String(charArray))
            return
        }

        charArray[index] = '('
        dfsGetStr(index + 1, paris, result, charArray)

        charArray[index] = ')'
        dfsGetStr(index + 1, paris, result, charArray)
    }

    /**
     * 判断str是否合规
     */
    private fun checkValidate(str: String): Boolean {
        val stack = Stack<Char>()
        for (index in str.indices) {
            if (!stack.isEmpty() && str[index] == ')' && stack.peek() == '(') {
                stack.pop()
            } else {
                stack.push(str[index])
            }
        }
        return stack.isEmpty()
    }

    fun test() {
        generateParenthesis(3)
    }
}