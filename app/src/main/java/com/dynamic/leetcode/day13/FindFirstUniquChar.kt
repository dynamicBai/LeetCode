package com.dynamic.leetcode.day13

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/15
 * 找到第一个不重复的字符
 */
object FindFirstUniquChar {
    fun firstUniqChar(s: String): Char {
        val hashMap = HashMap<Char, Int>()
        for (index in s.indices) {
            if (hashMap.containsKey(s[index])) {
                hashMap[s[index]] = 2
            } else {
                hashMap[s[index]] = 1
            }
        }
        for (index in s.indices) {
            if (hashMap[s[index]] == 1) {
                return s[index]
            }
        }
        return ' '
    }
}