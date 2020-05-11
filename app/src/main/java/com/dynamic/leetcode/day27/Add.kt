package com.dynamic.leetcode.day27

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/11
 * a^b 相当于求和
 * a&b <<1  相当于进位
 */
object Add {
    fun add(a: Int, b: Int): Int {
        return if (b == 0) {
            a
        } else {
            add(a.xor(b), (a.and(b)).shl(1))
        }
    }
}