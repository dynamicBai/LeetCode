package com.dynamic.leetcode.day15

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/17
 * 统计一个数字出现的次数  数组已经排好序
 */
object CountCount {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var right = nums.size - 1
        var mid: Int
        var count = 0
        var targetIndex = -1
        while (left <= right) {
            mid = (left + right) / 2
            if (target == nums[mid]) {
                //找到了 但是可能不止一个
                targetIndex = mid
                break
            } else if (target < nums[mid]) {
                right = mid - 1
            } else {
                left = mid + 1
            }
        }
        if (targetIndex >= 0) {
            count++
            //往左边找
            var leftTargetIndex = targetIndex - 1
            while (leftTargetIndex >= 0) {
                if (nums[leftTargetIndex] == target) {
                    count++
                } else {
                    break
                }
                leftTargetIndex--
            }
            //往右边找
            var rightTargetIndex = targetIndex + 1
            while (rightTargetIndex < nums.size) {
                if (nums[rightTargetIndex] == target) {
                    count++
                } else {
                    break
                }
                rightTargetIndex++
            }
        }
        return count
    }

    fun test() {
        search(intArrayOf(5,5, 7, 7, 8, 8, 10), 5)
    }
}