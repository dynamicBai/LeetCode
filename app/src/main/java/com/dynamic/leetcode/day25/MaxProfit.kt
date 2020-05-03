package com.dynamic.leetcode.day25

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/3
 * 股票买入卖出最大值
 */
object MaxProfit {
    fun maxProfit(prices: IntArray): Int {
        if(prices.isEmpty()){
            return 0
        }
        var minBuy = prices[0]
        var maxProfit = 0
        for (index in prices.indices) {
            maxProfit = Math.max(prices[index] - minBuy, maxProfit)
            minBuy = Math.min(minBuy, prices[index])
        }
        return maxProfit
    }
}