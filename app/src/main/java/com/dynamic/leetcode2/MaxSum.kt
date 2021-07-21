package com.dynamic.leetcode2

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2021/3/5
 *
 */
object MaxSum {
    fun maxSubArray(nums: IntArray): Int {
        var max = nums[0]
        val dp = IntArray(nums.size)
        dp[0] = nums[0]
        for (index in 1 until nums.size) {
            if (dp[index - 1] > 0) {
                dp[index] = dp[index] + nums[index]
            } else {
                dp[index] = nums[index]
            }
            if (dp[index] > max) {
                max = dp[index]
            }
        }
        return max
    }
}