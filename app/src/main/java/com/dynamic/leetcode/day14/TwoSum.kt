package com.dynamic.leetcode.day14

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/16
 * 两数和
 */
object TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()
        for (index in nums.indices) {
            if (hashMap.containsKey(target - nums[index])) {
                return intArrayOf(nums[index], target - nums[index])
            } else {
                hashMap[nums[index]] = index
            }
        }
        return intArrayOf(0,0)
    }
}