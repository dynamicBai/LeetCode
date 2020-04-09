package com.dynamic.leetcode.day8

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/9
 * 9x9数独 判断行、列 3x3
 */
object ValidSudoku {
    fun isValidSudoku(board: Array<CharArray>): Boolean {
        if (!checkRow(board)) {
            return false
        }
        if (!checkColumn(board)) {
            return false
        }

        if (!check3(board)) {
            return false
        }

        return true
    }


    //判断行
    private fun checkRow(board: Array<CharArray>): Boolean {
        for (index in board.indices) {
            val charArray = board[index]
            val hashMap = HashMap<Char, Int>()
            for (i in charArray.indices) {
                val result = hashMap.put(charArray[i], i)
                if (charArray[i] != '.' && result != null) {
                    return false
                }
            }
        }
        return true
    }


    //判断列
    private fun checkColumn(board: Array<CharArray>): Boolean {
        for (i in board.indices) {
            val hashMap = HashMap<Char, Int>()
            for (j in board.indices) {
                val result = hashMap.put(board[j][i], j)
                if (board[j][i] != '.' && result != null) {
                    return false
                }
            }
        }
        return true
    }

    //判断3x3
    private fun check3(board: Array<CharArray>): Boolean {
        for (i in 0..board.size - 3 step 3) {
            //行的起点0~6
            for (j in 0..board.size - 3 step 3) {
                //列的起点0~6

                val hashMap = HashMap<Char, Int>()
//                val charArray1 = board[i]
//                val charArray2 = board[i + 1]
//                val charArray3 = board[i + 2]
                for (m in i..i + 2) {
                    for (k in j..j + 2) {
                        val charArray = board[m]
                        val result = hashMap.put(charArray[k], k)
                        if (charArray[k] != '.' && result != null) {
                            return false
                        }
                    }
                }
            }
        }
        return true
    }
}