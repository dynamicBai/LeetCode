package com.dynamic.leetcode.day10

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/11
 * 找到旋转数据组最小值
 */
object MinInRotateArray {
    fun minArray(numbers: IntArray): Int {
        var left = 0
        var right = numbers.size - 1

        while (left < right) {
            var mid = (left + right) / 2
            if (numbers[right]>numbers[mid]) {
                //右边递曾  有可能mid最小 要保留下来
                right = mid
            } else if (numbers[right]<numbers[mid]) {
                //左边递曾  最小的旋转到了右边
                left = mid + 1
            } else {
                //去重
                right -= 1
            }
        }
        return numbers[left]
    }
}