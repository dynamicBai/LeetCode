package com.dynamic.leetcode.day4

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/5
 * 两数和  hashMap
 */
object TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val hashMap = HashMap<Int, Int>()
        for (index in nums.indices) {
            if (hashMap.containsKey(target - nums[index])) {
                return intArrayOf(index, hashMap[target - nums[index]]!!)
            } else {
                hashMap[nums[index]] = index
            }
        }
        return nums
    }
}