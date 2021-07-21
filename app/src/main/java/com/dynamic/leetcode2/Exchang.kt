package com.dynamic.leetcode2

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2021/3/6
 *
 */
class Exchang {
    fun exchange(nums: IntArray): IntArray {
        var left = 0
        var right = nums.size-1
        while(left<right){
            while(nums[left]%2==1){
                left++
            }
            while(nums[right]%2==0){
                right--
            }
            if(left<right){
                val temp = nums[left]
                nums[left] = nums[right]
                nums[right] = temp
            }

        }
        return nums
    }
}