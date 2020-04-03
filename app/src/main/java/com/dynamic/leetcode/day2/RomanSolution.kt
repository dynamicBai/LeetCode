package com.dynamic.leetcode.day2

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/2
 * 主要是处理映射关系吧  并且罗马数字负的情况之只会从大到小排列 比如IV   不会有IVV
 * Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */
object RomanSolution {
    fun romanToInt(s: String): Int {
        val hashMap = hashMapOf(
            'I' to 1, 'V' to 5,
            'X' to 10, 'L' to 50, 'C' to 100, 'D' to 500, 'M' to 1000
        )
        var lastInt = Int.MAX_VALUE
        var total = 0
        for (index in s.indices) {
            val curInt = hashMap[s[index]]!!
            if (curInt > lastInt) {
                total += curInt
                total -= 2 * lastInt
                lastInt = Int.MAX_VALUE
            } else {
                total += curInt
                lastInt = curInt
            }
        }
        return total
    }
}