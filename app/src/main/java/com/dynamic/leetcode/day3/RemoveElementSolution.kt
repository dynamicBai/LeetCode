package com.dynamic.leetcode.day3

import java.awt.font.NumericShaper

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/4
 * 和上一题感觉一样的
 * 拿个flag指针从0往后跑就好了，因为循环遍历的指针肯定比这个flag指针跑得快，
 * 所以也不会有循环的问题
 */
object RemoveElementSolution {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) {
            return 0
        }
        var flagIndex = 0
        for (index in nums.indices) {
            if (nums[index] != `val`) {
                nums[flagIndex] = nums[index]
                flagIndex++
            }
        }
        return flagIndex
    }
}