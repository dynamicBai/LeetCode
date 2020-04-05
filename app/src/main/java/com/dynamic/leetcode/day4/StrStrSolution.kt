package com.dynamic.leetcode.day4

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/5
 * 查找最先出现的子串
 */
object StrStrSolution {
    fun strStr(haystack: String, needle: String): Int {
        if (needle.isEmpty()) {
            return 0
        }
        if (needle.length > haystack.length) {
            return -1
        }

        for (hayStackIndex in 0..haystack.length - needle.length) {
            var suit = true
            for (needleIndex in needle.indices) {
                if (needle[needleIndex] != haystack[hayStackIndex + needleIndex]) {
                    suit = false
                    break
                }
            }
            if (suit) {
                return hayStackIndex
            }
        }
        return -1
    }
}