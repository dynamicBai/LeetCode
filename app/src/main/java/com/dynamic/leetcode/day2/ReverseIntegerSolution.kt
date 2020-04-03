package com.dynamic.leetcode.day2

import java.math.BigDecimal

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/3
 * 翻转数字  注意溢出和负数就是了
 * 可以使用long来保存结果 最后和int.maxValue比较
 */
object ReverseIntegerSolution {

    fun reverse(x: Int): Int {
        var befu = x < 0
        var tempX = x
        if (befu) {
            tempX = -x
        }
        var total: Long = 0L

        while (tempX > 0) {
            total = total * 10 + tempX % 10
            tempX /= 10
        }

        if (total > Int.MAX_VALUE) {
            return 0
        }

        return (if (befu) {
            -total
        } else {
            total
        }).toInt()

    }

}