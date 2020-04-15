package com.dynamic.leetcode.day13

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/15
 * 数组中总有一个相同的数字 数量超过一半
 * 摩尔投票
 */
object MajorityElement {
    fun majorityElement(nums: IntArray): Int {
        var condidate = nums[0]
        var count = 1
        for (index in 1 until nums.size) {
            if (count == 0) {
                condidate = nums[index]
                count++
            } else {
                if (nums[index] == condidate) {
                    count++
                } else {
                    count--
                }
            }
        }
        return condidate
    }
}