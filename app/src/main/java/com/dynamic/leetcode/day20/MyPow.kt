package com.dynamic.leetcode.day20

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/23
 * 数值的整数次方
 * 不能使用库函数
 * 存在时间限制
 */
object MyPow {
    fun myPow(x: Double, n: Int): Double {
        if (x == 1.0) {
            return 1.0
        }
        if (n == 0) {
            return 1.0
        }
        var vN: Long = n.toLong()
        val fuShu = vN < 0
        if (fuShu) {
            vN = -vN
        }
        var sum = 1.0
        var xN = x
        //转成二进制  101100....这种  底数每位移一次会自身倍数  当遇到1时表示需要累积到乘积里面
        while (vN > 0) {
            if (vN % 2 == 1L) {
                sum *= xN
            }
            xN *= xN
            vN /= 2
        }
        return if (fuShu) {
            1 / sum
        } else {
            sum
        }
    }

    fun test() {
        myPow(2.0, 10)
    }
}