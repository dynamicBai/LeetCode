package com.dynamic.leetcode.day16

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/18
 * 判断是否是顺子
 */
object IsStraight {
    fun isStraight(nums: IntArray): Boolean {
        val hashMap = HashMap<Int, Int>()
        var spCount = 0
        var max = -1
        var min = 15
        for (index in nums.indices) {
            if (nums[index] == 0) {
                spCount++
            } else if (hashMap.containsKey(nums[index])) {
                //非0的对子
                return false
            }
            hashMap[nums[index]] = index
            if (nums[index] > max) {
                max = nums[index]
            }
            if (nums[index] in 1 until min) {
                min = nums[index]
            }
        }
        return if (spCount == 0) {
            (max - min) == 4
        } else {
            (max - min) <= 4
        }
    }

    fun test() {
        isStraight(intArrayOf(1, 2, 4, 5, 0))
    }

}