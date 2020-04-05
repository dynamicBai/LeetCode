package com.dynamic.leetcode.day4

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/5
 * 二分插入 注意middle的位移 +1  -1
 */
object SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var left:Int = 0
        var right = nums.size - 1
        var middle = (left + right) / 2
        while (left <= right) {
            middle = (left + right) / 2
            when {
                nums[middle] < target -> {
                    left = middle+1
                }
                nums[middle] > target -> {
                    right = middle-1
                }
                nums[middle] == target -> {
                    return middle
                }
            }
        }
        return if(nums[middle]<target){
            middle+1
        }else{
            middle
        }
    }
}