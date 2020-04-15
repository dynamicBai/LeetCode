package com.dynamic.leetcode.day13

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/15
 * 找到数组最小K个数
 * 可以用快排和堆来解决
 */
object FinkMInK {
    fun getLeastNumbers(arr: IntArray, k: Int): IntArray {
        val list = ArrayList<Int>()
        for (i in arr.size - 1 downTo arr.size - k) {
            for (j in 1 until arr.size) {
                if (arr[j] > arr[j - 1]) {
                    val temp = arr[j]
                    arr[j] = arr[j - 1]
                    arr[j - 1] = temp
                }
            }
            list.add(arr[i])
        }
        return list.toIntArray()
    }
}