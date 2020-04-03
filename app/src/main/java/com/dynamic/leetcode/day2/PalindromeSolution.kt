package com.dynamic.leetcode.day2

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/3
 * 典型数字回文  需要主要负数和int.MaxValue 还有01这种
 */
object PalindromeSolution {
    fun isPalindrome(x: Int): Boolean {
        if (x < 0) {
            return false
        }
//        if (x % 10 == 0) {
//            return false
//        }
        //转成字符串 防止越界
        val str = x.toString()

        //个位数字
        if (str.length == 1) {
            return true
        }

        //采用双指针 结束条件是指针相遇或者相邻

        var left = 0
        var right = str.length - 1
        while (left <= right) {
            if (str[left] != str[right]) {
                return false
            }
            left++
            right--
        }

        return true
    }
}