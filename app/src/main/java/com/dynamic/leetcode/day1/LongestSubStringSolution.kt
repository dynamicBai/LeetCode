package com.dynamic.leetcode.day1

import android.util.Log

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/1
 * 这个简单一点就是双指针从0开始，直到right跑完  记下中间最长的个数
 */
object LongestSubStringSolution {
    fun lengthOfLongestSubstring(s: String): Int {
        val length = s.length
        if (length == 0) {
            return 0
        }
        if (length == 1) {
            return 1
        }
        var max = 1
        var left = 0
        var right = 0
        while (right + 1 < length && left <= right) {
            val target = checkRepeateIndex(s, left, right, s[right + 1])
            if (target < 0) {
                //新进去的字符不重复
//                max++
            } else {
                //计算当前的长度
                val l = right - left + 1
                if (l > max) {
                    max = l
                }
                //有重复 left移到重复点后一位
                left = target + 1
            }
            right++
        }
        val resultL = right - left + 1
        if (resultL > max) {
            max = resultL
        }
        return max
    }

    /**
     * 判断是否有重复的字符
     * 如果没有返回-1
     * 如果有返回index
     */
    private fun checkRepeateIndex(
        s: String,
        left: Int,
        right: Int,
        pendingChar: Char
    ): Int {
//        val pendingChar = s[right]
        for (index in left..right) {
            if (s[index] == pendingChar) {
                return index
            }
        }
        return -1
    }
}