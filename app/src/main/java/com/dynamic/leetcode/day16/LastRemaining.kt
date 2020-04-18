package com.dynamic.leetcode.day16

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/18
 * 0..n-1 每次删除第m个 求最后剩下的数字
 * java能accept 但是kotlin不行  卧槽....
 */
object LastRemaining {
    fun lastRemaining(n: Int, m: Int): Int {
        val list = ArrayList<Int>()
        for (index in 0 until n) {
            list.add(index)
        }
        var remain = n
        var removeIndex = 0
        while (remain > 1) {
            removeIndex = (removeIndex + m - 1) % remain
            list.remove(list[removeIndex])
            remain--
        }
        return list[0]
    }

    fun test() {
        lastRemaining(5, 3)
    }

}