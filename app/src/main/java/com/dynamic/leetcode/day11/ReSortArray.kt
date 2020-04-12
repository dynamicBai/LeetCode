package com.dynamic.leetcode.day11

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/12
 * 调整数组顺序 使得所有奇数在前面，所有偶数在后面
 */
object ReSortArray {
    fun exchange(nums: IntArray): IntArray {
        //这个一看就快排的方式了....
        if (nums.isEmpty()) {
            return nums
        }
        var left = 0
        var right = nums.size - 1
        while (left < right) {
            while (left < nums.size && nums[left] % 2 == 1) {
                left++
            }
            while (right >= 0 && nums[right] % 2 == 0) {
                right--
            }
            if (left < right) {
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
                left++
                right--
            }
        }
        return nums
    }
}