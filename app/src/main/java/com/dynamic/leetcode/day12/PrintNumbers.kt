package com.dynamic.leetcode.day12

import kotlin.math.pow

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/14
 *
 */
object PrintNumbers {
    fun printNumbers(n: Int): IntArray {
        return IntArray(Math.pow(10.toDouble(), n.toDouble()).toInt()-1) {
            it + 1
        }
    }

    fun test() {
        printNumbers(2)
    }
}