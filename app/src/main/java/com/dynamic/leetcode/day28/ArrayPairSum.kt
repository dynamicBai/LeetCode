package com.dynamic.leetcode.day28

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/14
 * 数组拆分求最大和
 */
object ArrayPairSum {
    fun arrayPairSum(nums: IntArray): Int {
        nums.sort()
        var sum = 0
        for (index in nums.indices step 2) {
            sum += nums[index]
        }
        return sum
    }
}