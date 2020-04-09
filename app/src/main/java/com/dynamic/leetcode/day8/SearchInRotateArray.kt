package com.dynamic.leetcode.day8

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/9
 * 排好序的数组 不过旋转了
 * 要求o(log n)
 */
object SearchInRotateArray {
    fun search(nums: IntArray, target: Int): Int {
        if (nums.isEmpty()) {
            return -1
        }
        var left = 0
        var right = nums.size - 1
        var middle: Int

        while (left <= right) {
            middle = (left + right) / 2
            if (nums[middle] == target) {
                return middle
            }
            if (nums[middle] < nums[right]) {
                //说明右边是升序的
                if (target > nums[middle] && target <= nums[right]) {
                    //target在右边
                    left = middle + 1
                } else {
                    //target在左边
                    right = middle - 1
                }
            } else {
                //说明左边是升序的
                if (target < nums[middle] && target >= nums[left]) {
                    //target在左边
                    right = middle - 1
                } else {
                    //target在右边
                    left = middle + 1
                }
            }
        }
        return -1
    }
}