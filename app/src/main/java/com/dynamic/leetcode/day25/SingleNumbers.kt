package com.dynamic.leetcode.day25

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/3
 * 数组中数字出现的次数
 * 一个整型数组 nums 里除两个数字之外，其他数字都出现了两次。请写程序找出这两个只出现一次的数字。要求时间复杂度是O(n)，空间复杂度是O(1)。
 */
object SingleNumbers {
    fun singleNumbers(nums: IntArray): IntArray {
        val hashMap = HashMap<Int, Int>()
        for (index in nums.indices) {
            if (hashMap.containsKey(nums[index])) {
                hashMap.remove(nums[index])
            } else {
                hashMap[nums[index]] = index
            }
        }
        return hashMap.keys.toIntArray()
    }

    fun test(){
        singleNumbers(intArrayOf(1,2,10,4,1,4,3,3))
    }

}