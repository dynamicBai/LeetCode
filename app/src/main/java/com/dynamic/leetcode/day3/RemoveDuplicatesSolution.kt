package com.dynamic.leetcode.day3

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/4
 * 删除数组中重复的元素  数组已排好序
 * 不能新建数组 只能在原来的数组上操作
 * 只需要保证length前的值是对的就行，所以用单指针记录替换就好
 */
object RemoveDuplicatesSolution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var flagIndex: Int = 0
        for (index in nums.indices) {
            if (nums[index] != nums[flagIndex]) {
                flagIndex++
                nums[flagIndex] = nums[index]
            }
        }
        return flagIndex + 1
    }
}