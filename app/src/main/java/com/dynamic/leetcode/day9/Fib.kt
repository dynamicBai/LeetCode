package com.dynamic.leetcode.day9

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/10
 * 斐波拉契数列  不能用递归
 */
object Fib {
    fun fib(n: Int): Int {
        if (n == 0) {
            return 0
        }
        if (n == 1) {
            return 1
        }

        var a = 0
        var b = 1
        for (index in 1 until n) {
            a += b
            b = a - b
            a %= 1000000007
        }
        return a
    }
}