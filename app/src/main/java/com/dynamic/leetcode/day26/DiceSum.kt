package com.dynamic.leetcode.day26

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/8
 *
 */
object DiceSum {
    //dp[n][s] = dp[n-1][s-1]+ dp[n-1][s-2]+ dp[n-1][s-3]+ dp[n-1][s-4]+ dp[n-1][s-5]+ dp[n-1][s-6]
    fun twoSum(n: Int): DoubleArray? {
        val dp = Array<IntArray>(n + 1) {
            IntArray(6 * n + 1)
        }
        //1个骰子和的概率是固定的
        for (index in 1..6) {
            dp[1][index] = 1
        }

        for (i in 2..n) {
            for (j in i..6 * i) {
                //模拟上面的公式
                for (k in 1..6) {
                    if (j - k > 0) {
                        dp[i][j] += dp[i - 1][j - k]
                    }
                }
            }
        }

        val resultArray = dp[n]
        var totalCount: Double = 0.0
        for (index in resultArray.indices) {
            totalCount += resultArray[index]
        }
        val list = ArrayList<Double>()
        for (index in resultArray.indices) {
            if (resultArray[index] != 0) {
                list.add(resultArray[index] / totalCount)
            }
        }
//        list.sort()
        return list.toDoubleArray()
    }

    fun test() {
        twoSum(2)
    }

}