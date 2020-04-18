package com.dynamic.leetcode.day16

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/18
 * 构建乘积数组
 */
object ConstructArr {
    fun constructArr(a: IntArray): IntArray {
        val array = IntArray(a.size)
        var result = 1
        //从左到右遍历一遍，array[i]表示 a0*...ai-1
        for (index in a.indices) {
            array[index] = result
            result *= a[index]
        }
        //从右到左再遍历一遍，补上ai+1*...an-1
        result = 1
        for (index in a.size - 1 downTo 0) {
            array[index] *= result
            result *= a[index]
        }
        return array
    }


    fun test() {
        constructArr(intArrayOf(1, 2, 3, 4, 5))
    }

}