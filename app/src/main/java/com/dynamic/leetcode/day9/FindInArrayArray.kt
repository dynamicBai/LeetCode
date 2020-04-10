package com.dynamic.leetcode.day9

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/10
 * 在有序的二维数组中找某个数字
 * 感觉穷举有点问题 浪费了排序  感觉可以以左下角或者右上角做起点然后一行一列的推进
 */
object FindInArrayArray {
    fun findNumberIn2DArray(matrix: Array<IntArray>, target: Int): Boolean {
        var rowIndex = 0
        var columnIndex = 0
        val maxRows = matrix.size - 1
        if (maxRows < 0) {
            return false
        }
        val maxColumns = matrix[0].size - 1
        if (maxColumns < 0) {
            return false
        }
        if (matrix[0][0] > target) {
            return false
        }
        while (rowIndex <= maxRows && columnIndex <= maxColumns) {
            if (matrix[rowIndex][columnIndex] == target) {
                return true
            }
            if (columnIndex < maxColumns) {
                columnIndex++
            } else {
                columnIndex = 0
                rowIndex++
            }
        }
        return false
    }
}