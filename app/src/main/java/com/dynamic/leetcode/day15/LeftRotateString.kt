package com.dynamic.leetcode.day15

import java.lang.StringBuilder

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/17
 * 左旋转字符串
 * 输入: s = "abcdefg", k = 2
 * 输出: "cdefgab"
 */
object LeftRotateString {
    fun reverseLeftWords(s: String, n: Int): String {
        val sb = StringBuilder()
        sb.append(s.substring(n))
        sb.append(s.substring(0, n))
        return sb.toString()
    }

    fun test() {
        reverseLeftWords("abcdefg", 2)
    }
}