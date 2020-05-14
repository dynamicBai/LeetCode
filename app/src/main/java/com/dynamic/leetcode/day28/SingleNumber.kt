package com.dynamic.leetcode.day28

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/14
 * 数组里面其他数字都出现三次 只有一个数字只出现一次 找出该数字
 */
object SingleNumber {
    fun singleNumber(nums: IntArray): Int {
        val hashMap = HashMap<Int, Int>()
        for (index in nums.indices) {
            val target = nums[index]
            if (hashMap.containsKey(target)) {
                var count = hashMap[target]!!
                if (count == 2) {
                    hashMap.remove(target)
                } else {
                    hashMap[target] = count + 1
                }
            } else {
                hashMap[target] = 1
            }
        }
        for (key in hashMap.keys) {
            return key
        }
        return -1
    }
}