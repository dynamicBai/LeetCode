package com.dynamic.leetcode.day25

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/3
 * m*n格子 每个格子代表礼物价值，从左上角走到右下角。每次只能右或者左，求最大价值和
 */
object MaxValuePresent {
    fun maxValue(grid: Array<IntArray>): Int {
        val m = grid.size
        val n = grid[0].size
        val dp = Array<IntArray>(m) {
            IntArray(n)
        }
        for (i in 0 until m) {
            for (j in 0 until n) {
                if (i == 0 && j == 0) {
                    dp[i][j] = grid[i][j]
                } else if (i == 0) {
                    dp[i][j] = dp[i][j - 1] + grid[i][j]
                } else if (j == 0) {
                    dp[i][j] = dp[i - 1][j] + grid[i][j]
                } else {
                    dp[i][j] = Math.max((dp[i][j - 1]), dp[i - 1][j]) + grid[i][j]
                }
            }
        }
        return dp[m - 1][n - 1]
    }

    fun test() {
        val a1 = intArrayOf(1, 3, 1)
        val a2 = intArrayOf(1, 5, 1)
        val a3 = intArrayOf(4, 2, 1)
        val array = Array<IntArray>(3) {
            IntArray(3)
        }
        array[0] = a1
        array[1] = a2
        array[2] = a3
        maxValue(array)
    }
}