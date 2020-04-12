package com.dynamic.leetcode.day11

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/12
 * 顺时针打印矩阵
 * 参考了别人的一种解法 消除法 很精妙
 *
 */
object PrintMatrixClockWise {
    fun spiralOrder(matrix: Array<IntArray>): IntArray {
        val m: Int = matrix.size
        if (m == 0) return IntArray(0)
        val n: Int = matrix[0].size
        if (n == 0 && m == 0) return IntArray(0)

        val arr = IntArray(m * n)
        var count = 0
        var top = 0
        var left = 0
        var right = n - 1
        var bottom = m - 1
        while (true) {
            for (i in left..right) arr[count++] = matrix[top][i]
            if (++top > bottom) return arr
            for (i in top..bottom) arr[count++] = matrix[i][right]
            if (--right < left) return arr
            for (i in right downTo left) arr[count++] = matrix[bottom][i]
            if (--bottom < top) return arr
            for (i in bottom downTo top) arr[count++] = matrix[i][left]
            if (++left > right) return arr
        }
    }
}