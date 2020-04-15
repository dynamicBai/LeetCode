package com.dynamic.leetcode.day13

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/15
 * 子串和最大
 */
object MaxSumSubString {
    fun maxSubArray(nums: IntArray): Int {
        val maxSumArray = IntArray(nums.size)
        maxSumArray[0] = nums[0]
        var max = maxSumArray[0]
        for (index in 1 until nums.size) {
            val target = nums[index]
            if (maxSumArray[index - 1] > 0) {
                maxSumArray[index] = maxSumArray[index - 1] + target
            } else {
                maxSumArray[index] = target
            }
            if (maxSumArray[index] > max) {
                max = maxSumArray[index]
            }
        }
        return max
    }
}