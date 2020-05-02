package com.dynamic.leetcode.day24

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/3
 *
 */
object Num2String {
    fun translateNum(num: Int): Int {
        val str = num.toString()
        val dp = IntArray(str.length+1)
        dp[0] = 1
        dp[1] = 1
        for (index in 2 until dp.size) {
            if (str[index - 2] == '1' || (str[index - 2] == '2' && str[index - 1] <= '5')) {
                //新加的末尾 直接单字母 或者和之前的末尾组
                dp[index] = dp[index - 1] + dp[index - 2]
            } else {
                //新加的只能单字母
                dp[index] = dp[index - 1]
            }
        }
        return dp[dp.size - 1]
    }

    fun test(){
        translateNum(25)
    }

}