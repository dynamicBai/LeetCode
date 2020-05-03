package com.dynamic.leetcode.day25

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/3
 *
 */
object IsNumber {
    fun isNumber(s: String): Boolean {
        return try {
            s.toFloat()
            true
        } catch (e: Exception) {
            false
        }
    }

    fun test(){
        isNumber("959440.94f")
    }
}