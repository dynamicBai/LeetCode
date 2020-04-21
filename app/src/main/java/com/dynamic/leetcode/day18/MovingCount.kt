package com.dynamic.leetcode.day18

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/21
 * 地上有一个m行n列的方格，从坐标 [0,0] 到坐标 [m-1,n-1] 。一个机器人从坐标 [0, 0] 的格子开始移动，它每次可以向左、右、上、下移动一格（不能移动到方格外），也不能进入行坐标和列坐标的数位之和大于k的格子。例如，当k为18时，机器人能够进入方格 [35, 37] ，因为3+5+3+7=18。但它不能进入方格 [35, 38]，因为3+5+3+8=19。请问该机器人能够到达多少个格子？
 */
object MovingCount {
    fun movingCount(m: Int, n: Int, k: Int): Int {
        val visit = Array<IntArray>(m) {
            IntArray(n)
        }
        visit[0][0] = 1
        move(k, m, n, 0, 0, visit)
        var count = 0
        for (i in visit.indices) {
            for (j in visit[0].indices) {
                if (visit[i][j] == 1) {
                    count++
                }
            }
        }
        return count
    }

    private fun move(
        k: Int,
        m: Int,
        n: Int,
        i: Int,
        j: Int,
        visit: Array<IntArray>
    ) {
        if (i + 1 < m && visit[i + 1][j] == 0 && map2Sum(i + 1) + map2Sum(j) <= k) {
            visit[i + 1][j] = 1
            move(k, m, n, i + 1, j, visit)
        }

        if (i - 1 >= 0 && visit[i - 1][j] == 0 && map2Sum(i - 1) + map2Sum(j) <= k) {
            visit[i - 1][j] = 1
            move(k, m, n, i - 1, j, visit)
        }

        if (j + 1 < n && visit[i][j + 1] == 0 && map2Sum(i) + map2Sum(j + 1) <= k) {
            visit[i][j + 1] = 1
            move(k, m, n, i, j + 1, visit)
        }

        if (j - 1 >= 0 && visit[i][j - 1] == 0 && map2Sum(i) + map2Sum(j - 1) <= k) {
            visit[i][j - 1] = 1
            move(k, m, n, i, j - 1, visit)
        }
    }

    private fun map2Sum(num: Int): Int {
        var sum = 0
        var total = num
        while (total != 0) {
            sum += total % 10
            total /= 10
        }
        return sum
    }

    fun test() {
        movingCount(2, 3, 1)
    }
}