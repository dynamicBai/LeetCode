package com.dynamic.leetcode.day10

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/11
 * 替换字符串
 */
object ReplaceTrim {
    fun replaceSpace(s: String): String {
        val result = s.split(" ")
        val sb = StringBuffer()
        for (index in result.indices) {
            if (index != 0) {
                sb.append("%20")
            }
            sb.append(result[index])
        }
        return sb.toString()
    }
}