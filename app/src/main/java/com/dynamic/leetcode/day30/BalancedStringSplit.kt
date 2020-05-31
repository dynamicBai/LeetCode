package com.dynamic.leetcode.day30

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/31
 * 在一个「平衡字符串」中，'L' 和 'R' 字符的数量是相同的。

给出一个平衡字符串 s，请你将它分割成尽可能多的平衡字符串。

返回可以通过分割得到的平衡字符串的最大数量。

 

示例 1：

输入：s = "RLRRLLRLRL"
输出：4
解释：s 可以分割为 "RL", "RRLL", "RL", "RL", 每个子字符串中都包含相同数量的 'L' 和 'R'。
 */
object BalancedStringSplit {
    fun balancedStringSplit(s: String): Int {
        if (s.isEmpty()) {
            return 0
        }
        var lCount = 0
        var rCount = 0
        var totalSplitCount = 0
        for (index in s.indices) {
            if (s[index] == 'L') {
                lCount++
            } else {
                rCount++
            }
            if (lCount == rCount) {
                lCount = 0
                rCount = 0
                totalSplitCount++
            }
        }
        return totalSplitCount
    }
}