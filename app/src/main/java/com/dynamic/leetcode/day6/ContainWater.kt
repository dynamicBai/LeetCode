package com.dynamic.leetcode.day6

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/7
 *
 */
object ContainWater {
    fun maxArea(height: IntArray): Int {
        var max = 0
        for (left in height.indices) {
            for (right in left until height.size) {
                val area = calculate(left, right, height)
                if (area > max) {
                    max = area
                }
            }
        }
        return max
    }

    private fun calculate(left: Int, right: Int, height: IntArray): Int {
        val realHeight = if (height[left] > height[right]) {
            height[right]
        } else {
            height[left]
        }

        return realHeight * (right - left)
    }
}