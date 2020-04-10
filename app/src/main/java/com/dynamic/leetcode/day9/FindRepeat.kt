package com.dynamic.leetcode.day9

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/10
 * 找数组中随便一个重复的数字
 */
object FindRepeat {
    fun findRepeatNumber(nums: IntArray): Int {
        val hashMap = HashMap<Int, Int>()
        for (index in nums.indices) {
            if (hashMap.put(nums[index], index) != null) {
                return nums[index]
            }
        }
        return -1
    }
}