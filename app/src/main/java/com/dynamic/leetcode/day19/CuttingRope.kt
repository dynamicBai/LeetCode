package com.dynamic.leetcode.day19

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/22
 * 剪绳子
 * 模拟一维规划求最值
 * f(n) = f(N-1) + sdsdl  f(1) =1
 * f(m,n)= f(m-1,n)+ f(m,n-1)   f(0,0)  f(1,0)
 * 经典的一维动态规划
 */
object CuttingRope {
    fun cuttingRope(n: Int): Int {
        //dp记录长度为i时 最长的切割方案
        val dp = IntArray(n + 1)
        dp[1] = 1
        for (i in 2..n) {
            var max = 0
            for (j in 1 until i) {
                //判断i的切割最优值  全部因数分解
                if (dp[j] * dp[i - j] > max) {
                    max = dp[j] * dp[i - j]
                }
                //一半因数分解
                if (dp[j] * (i - j) > max) {
                    max = dp[j] * (i - j)
                }
                //另一半因数分解
                if (j * dp[i - j] > max) {
                    max = j * dp[i - j]
                }
                //这里比较直接分成2半的大小 不用因数分解
                if (j * (i - j) > max) {
                    max = j * (i - j)
                }
            }
            dp[i] = max
        }
        return dp[n]
    }

    fun test() {
        cuttingRope(8)
    }
}