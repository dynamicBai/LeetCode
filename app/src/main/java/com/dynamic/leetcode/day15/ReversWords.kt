package com.dynamic.leetcode.day15

import java.lang.StringBuilder

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/17
 * 翻转单词顺序
 */
object ReversWords {
    fun reverseWords(s: String): String {
        val list = cusSplit(s)
        val sb = StringBuilder()
        for (index in list.size - 1 downTo 0) {
            if (index != list.size - 1) {
                sb.append(" ")
            }
            sb.append(list[index])
        }
        return sb.toString()
    }

    fun cusSplit(str: String): List<String> {
        val list = ArrayList<String>()
        var left = -1
        for (index in str.indices) {
            if (left < 0 && str[index] != ' ') {
                left = index
            }
            if (str[index] == ' ' && left >= 0) {
                //找到了右边不为0的位置，需要切割了
                val mStr = str.substring(left, index)
                list.add(mStr)
                left = -1
            }
        }
        //末尾
        if (left >= 0) {
            list.add(str.substring(left))
        }
        return list

    }

    fun test() {
//        reverseWords("the sky is blue")
//        reverseWords("  hello world!  ")
        reverseWords("a good   example")
    }
}