package com.dynamic.leetcode.day5

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/6
 * 最长子串回文
 */
object LongsetPalindromicSubstring {
    fun longestPalindrome(s: String): String {
        var maxSubString = ""
        if (s.isEmpty()) {
            return ""
        }

        //一时半会想不到优化方案 只好循环2次  好在ac了
        for (leftIndex in s.indices) {
            for (rightIndex in leftIndex until s.length) {
                var subStr = s.substring(leftIndex, rightIndex + 1)
                if (checkPalindrome(subStr)) {
                    if (subStr.length > maxSubString.length) {
                        maxSubString = subStr
                    }
                }
            }
        }
        return maxSubString
    }

    private fun checkPalindrome(s: String): Boolean {
        if (s.isEmpty()) {
            return true
        }
        var leftIndex = 0
        var rightIndex = s.length - 1
        while (leftIndex < rightIndex) {
            if (s[leftIndex] != s[rightIndex]) {
                return false
            }
            leftIndex++
            rightIndex--
        }
        return true
    }
}