package com.dynamic.leetcode.day10

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/11
 * 青蛙跳台阶
 */
object FrogJump {
    fun numWays(n: Int): Int {
        if(n == 0){
            return 1
        }
        if (n == 1) {
            return 1
        }
        var a = 1
        var b = 1
        for (index in 2..n) {
            a += b
            b = a - b
            a %= 1000000007
        }
        return a
    }
}