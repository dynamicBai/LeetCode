package com.dynamic.leetcode.day29

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/17
 * 分饼干
 */
object FindContentChildren {
    fun findContentChildren(g: IntArray, s: IntArray): Int {
        g.sort()
        s.sort()
        var gIndex = 0
        var sIndex = 0
        var count = 0
        while (sIndex < s.size && gIndex<g.size) {
            if (s[sIndex] >= g[gIndex]) {
                count++
                gIndex++
            }
            sIndex++
        }
        return count
    }
}