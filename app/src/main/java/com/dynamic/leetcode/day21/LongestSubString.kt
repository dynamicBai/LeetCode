package com.dynamic.leetcode.day21

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/24
 * 最长不重复子串
 */
object LongestSubString {
    fun lengthOfLongestSubstring(s: String): Int {
        if(s.isEmpty()){
            return 0
        }
        val dp = IntArray(s.length)
        dp[0] = 1
        var max = 1
        for (index in 1 until s.length) {
            var left = index - dp[index - 1]
            var right = index - 1
            val curChar = s[index]
            var hasSame = false
            for (i in left..right) {
                if (s[i] == curChar) {
                    hasSame = true
                    left = i
                    break;
                }
            }
            if (!hasSame) {
                right += 1
            }
            val newLength = right - left + 1
            if (newLength == 0) {
                dp[index] = 1
            } else {
                dp[index] = newLength
            }
            if (dp[index] > max) {
                max = dp[index]
            }
        }
        return max;
    }

    fun test() {
        lengthOfLongestSubstring("abcabcbb")
    }

}