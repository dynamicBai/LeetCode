package com.dynamic.leetcode2

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2021/3/1
 *
 */
object SpiralOrder {
    fun spiralOrder(matrix: Array<IntArray>): IntArray {
        if (matrix.isEmpty()) {
            return intArrayOf()
        }
        var l = 0
        var r = matrix[0].size - 1
        var t = 0
        var b = matrix.size - 1
        val size = (r + 1) * (b + 1)
        val array = IntArray(size)
        var index = 0
        while (true) {
            for (i in l..r) array[index++] = matrix[t][i]
            if (++t > b) break
            for (i in t..b) array[index++] = matrix[i][r]
            if (l > --r) break
            for (i in r downTo l) array[index++] = matrix[b][i]
            if (--b < t) break
            for (i in b downTo t) array[index++] = matrix[i][l]
            if (++l > r) break
        }
        return array
    }
}