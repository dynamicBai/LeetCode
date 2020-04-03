package com.dynamic.leetcode.day1

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/1
 *这个最长子串只要保证index相同时char相同就是了
 */
object PrefixSolution {


    fun longestCommonPrefix(strs: Array<String>): String {
        val tagString = strs[0]
        for (index in tagString.indices) {
            val charactor = tagString[index]
            for (pos in 1 until strs.size) {
                if (!checkCharPosRight(index, charactor, strs[pos])) {
                    return tagString.substring(0, index)
                }
            }
        }

        return tagString
    }


    /**
     * 检查对应的index 的字符是否一致
     */
    fun checkCharPosRight(pos: Int, charactor: Char, str: String): Boolean {
        if (pos >= str.length) {
            return false
        }
        if (str[pos] == charactor) {
            return true
        }
        return false
    }

}