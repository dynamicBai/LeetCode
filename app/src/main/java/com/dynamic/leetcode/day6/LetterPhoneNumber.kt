package com.dynamic.leetcode.day6

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/7
 * 采用深度优先遍历
 */
object LetterPhoneNumber {
    fun letterCombinations(digits: String): List<String> {
        val result = ArrayList<String>()
        if(digits.isEmpty()){
            return result
        }
        val map = Array(10) { "" }
        map[0] = ""
        map[1] = ""
        map[2] = "abc"
        map[3] = "def"
        map[4] = "ghi"
        map[5] = "jkl"
        map[6] = "mno"
        map[7] = "pqrs"
        map[8] = "tuv"
        map[9] = "wxyz"
        val array = CharArray(digits.length)
        dfsStr(digits, 0, array, result, map)
        return result
    }


    private fun dfsStr(
        digits: String,
        index: Int,
        tempCharArray: CharArray,
        result: ArrayList<String>,
        map: Array<String>
    ) {
        if (index == digits.length) {
            //到了最后一层 返回这次遍历
            result.add(String(tempCharArray))
            return
        }

        val mapStr = map[digits[index] - '0']
        for (i in mapStr.indices) {
            //把这一层的字符塞进去 然后继续往下面遍历
            tempCharArray[index] = mapStr[i]
            dfsStr(digits, index + 1, tempCharArray, result, map)
        }
    }

}