package com.dynamic.leetcode.day18

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/21
 * 经典的回溯
 */
object PathInRect {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        val visit = Array(board.size) {
            IntArray(board[0].size)
        }

        return checkExist(board, visit, word, 0, 0, 0)
    }

    private fun checkExist(
        board: Array<CharArray>,
        visit: Array<IntArray>,
        word: String,
        index: Int,
        i: Int,
        j: Int
    ): Boolean {
        if (index == word.length) {
            return true
        }

        if (index == 0) {
            for (i1 in board.indices) {
                for (j1 in board[0].indices) {
                    if (board[i1][j1] == word[index] && visit[i1][j1] != 1) {
                        visit[i1][j1] = 1
                        val result = checkExist(board, visit, word, index + 1, i1, j1)
                        if (result) {
                            return true
                        } else {
                            visit[i1][j1] = 0
                        }
                    }
                }
            }
        } else {
            //上下左右四个方向都尝试
            if (i + 1 < board.size && visit[i + 1][j] != 1 && board[i + 1][j] == word[index]) {
                visit[i + 1][j] = 1
                val result = checkExist(board, visit, word, index + 1, i + 1, j)
                if (result) {
                    return true
                } else {
                    visit[i + 1][j] = 0
                }
            }
            if (i - 1 >= 0 && visit[i - 1][j] != 1 && board[i - 1][j] == word[index]) {
                visit[i - 1][j] = 1
                val result = checkExist(board, visit, word, index + 1, i - 1, j)
                if (result) {
                    return true
                } else {
                    visit[i - 1][j] = 0
                }
            }
            if (j + 1 < board[0].size && visit[i][j + 1] != 1 && board[i][j + 1] == word[index]) {
                visit[i][j + 1] = 1
                val result = checkExist(board, visit, word, index + 1, i, j + 1)
                if (result) {
                    return true
                } else {
                    visit[i][j + 1] = 0
                }
            }

            if (j - 1 >= 0 && visit[i][j - 1] != 1 && board[i][j - 1] == word[index]) {
                visit[i][j - 1] = 1
                val result = checkExist(board, visit, word, index + 1, i, j - 1)
                if (result) {
                    return true
                } else {
                    visit[i][j - 1] = 0
                }
            }
        }

        return false
    }

    fun test() {
//        val arr1 = charArrayOf('a', 'b', 'c', 'e')
//        val arr2 = charArrayOf('s', 'f', 'c', 's')
//        val arr3 = charArrayOf('a', 'd', 'e', 'e')
//        val arr = Array<CharArray>(3) {
//            charArrayOf()
//        }
//        arr[0] = arr1
//        arr[1] = arr2
//        arr[2] = arr3
//        exist(arr, "bfce")

//        var arr1 = charArrayOf('a', 'a')
//        val arr = Array<CharArray>(1) {
//            charArrayOf()
//        }
//        arr[0] = arr1
//        exist(arr, "aaa")

        val arr1 = charArrayOf('c', 'a', 'a')
        val arr2 = charArrayOf('a', 'a', 'a')
        val arr3 = charArrayOf('b', 'c', 'd')
        val arr = Array<CharArray>(3) {
            charArrayOf()
        }
        arr[0] = arr1
        arr[1] = arr2
        arr[2] = arr3
        exist(arr, "aab")
    }
}