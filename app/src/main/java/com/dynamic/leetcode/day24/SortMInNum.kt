package com.dynamic.leetcode.day24

import android.os.Build
import androidx.annotation.RequiresApi

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/2
 *
 */
object SortMInNum {
    @RequiresApi(Build.VERSION_CODES.O)
    fun minNumber(nums: IntArray): String? {
        val list: MutableList<String> = ArrayList()
        for (num in nums) {
            list.add(num.toString())
        }
        list.sortWith(java.util.Comparator { o1: String, o2: String ->
            (o1 + o2).compareTo(
                o2 + o1
            )
        })
        return java.lang.String.join("", list)
    }

    @RequiresApi(Build.VERSION_CODES.O)
    fun test(){
        minNumber(intArrayOf(5,9,3,30,34))
    }
}