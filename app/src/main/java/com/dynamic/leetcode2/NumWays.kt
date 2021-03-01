package com.dynamic.leetcode2

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2021/3/1
 *
 */
object NumWays {
    fun numWays(n: Int): Int {
        //f(0) = 1,f(1) =1 ,f(2)=2  f(n)=f(n-1)+f(n-2)
        var a = 1
        var b = 1
        var temp: Int
        for (i in 2..n) {
            temp = b
            b = (a + b) % 1000000007
            a = temp
        }
        return b
    }
}