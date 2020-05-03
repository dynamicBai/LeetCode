package com.dynamic.leetcode.day25

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/3
 *
 */
object SumNums {
    fun sumNums(n: Int): Int {
        if (n == 1) {
            return 1
        }
        return sumNums(n - 1) + n
    }
    fun test(){
        sumNums(9)
    }
}
