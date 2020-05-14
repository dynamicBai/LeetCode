package com.dynamic.leetcode.day28

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/14
 * 排列硬币 1-2-3-4...k
 */
object RangeCoin {
    fun arrangeCoins(n: Int): Int {
        var rest = n
        var k = 0
        while (rest > k) {
            k++
            rest -= k
        }
        return k
    }

    fun test() {
        arrangeCoins(8)
    }
}