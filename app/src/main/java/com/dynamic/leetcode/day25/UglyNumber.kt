package com.dynamic.leetcode.day25

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/3
 *我们把只包含因子 2、3 和 5 的数称作丑数（Ugly Number）。求按从小到大的顺序的第 n 个丑数。
 */
object UglyNumber {
    fun nthUglyNumber(n: Int): Int {
        val dp = IntArray(n)
        var dp2 = 0
        var dp3 = 0
        var dp5 = 0
        dp[0] = 1
        for (index in 1 until n) {
            dp[index] = Math.min(Math.min(2 * dp[dp2], 3 * dp[dp3]), 5 * dp[dp5])
            if (dp[index] == 2 * dp[dp2]) {
                dp2++
            }
            if (dp[index] == 3 * dp[dp3]) {
                dp3++
            }
            if (dp[index] == 5 * dp[dp5]) {
                dp5++
            }
        }
        return dp[n - 1]
    }

    fun test(){
        nthUglyNumber(10)
    }
}