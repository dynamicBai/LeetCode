package com.dynamic.leetcode.day10

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/11
 * 找到二维数组中是否存在这样的路径
 */
object PathInMatrix {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        if (board.isEmpty()) {
            return false
        }
        if (word.isEmpty()) {
            return false
        }
        val firstLocation = findFirstChar(word[0], board)
        var lastR = firstLocation[0]
        var lastC = firstLocation[1]
        if (lastR < 0) {
            return false
        }
        board[lastR][lastC] = '0'
        for (index in 1 until word.length) {
            val char = word[index]
            if (lastR - 1 >= 0 && board[lastR - 1][lastC] == char) {
                lastR -= 1
                continue
            }
            if (lastR + 1 < board.size && board[lastR + 1][lastC] == char) {
                lastR += 1
                continue
            }

            if (lastC - 1 >= 0 && board[lastR][lastC - 1] == char) {
                lastC -= 1
                continue
            }

            if (lastC + 1 < board[0].size && board[lastR][lastC+1] == char) {
                lastC += 1
                continue
            }
            return false
        }
        return true
    }

    private fun findFirstChar(char: Char, board: Array<CharArray>): IntArray {
//        if (board.isEmpty()) {
//            return intArrayOf(-1, -1)
//        }
        for (i in board.indices) {
            val charArray = board[i]
            for (j in charArray.indices) {
                if (charArray[j] == char) {
                    return intArrayOf(i, j)
                }
            }
        }
        return intArrayOf(-1, -1)
    }


}