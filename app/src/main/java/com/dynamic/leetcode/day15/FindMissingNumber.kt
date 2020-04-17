package com.dynamic.leetcode.day15

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/17
 *一个长度为n-1的递增排序数组中的所有数字都是唯一的，并且每个数字都在范围0～n-1之内。在范围0～n-1内的n个数字中有且只有一个数字不在该数组中，请找出这数字。
 * 输入: [0,1,2,3,4,5,6,7,9]
输出: 8
 */
object FindMissingNumber {
    fun missingNumber(nums: IntArray): Int {
        var left = 0
        var right = nums.size - 1
        var mid: Int
        while (left <= right) {
            mid = (left + right) / 2
            if (nums[mid] == mid) {
                //说明漏的在右边
                left = mid + 1
            } else {
                //说明漏的在左边
                right = mid - 1
            }
        }
        return left
    }

    fun test(){
        missingNumber(intArrayOf(0,1,2,3,4,5,6,7,9))
    }
}