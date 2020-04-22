package com.dynamic.leetcode.day19

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/23
 * 剪绳子2
 * 答案需要取模
 */
object CuttingRope2 {
    //由上题看其他人的解法得知尽量切成3是最大的  所以换种思路
    fun cuttingRope(n: Int): Int {
        if (n == 1) {
            return 1
        }
        if (n == 2) {
            return 1
        }
        if (n == 3) {
            return 2
        }
        if (n == 4) {
            return 4
        }
        var result: Long = 1
        var counter = n
        while (counter > 4) {
            result = result * 3 % 1000000007
            counter -= 3
        }
        return (result * counter % 1000000007).toInt()
    }
}