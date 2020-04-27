package com.dynamic.leetcode.day22

import java.util.*

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/27
 *
 *输入一个整数数组，判断该数组是不是某二叉搜索树的后序遍历结果。如果是则返回 true，否则返回 false。假设输入的数组的任意两个数字都互不相同。
 * 输入: [1,3,2,6,5]
输出: true
输入: [1,6,3,2,5]
输出: false
 */
object CheckBinaryTraversal {
    fun verifyPostorder(postorder: IntArray): Boolean {
        return check(postorder)
    }

    private fun check(postorder: IntArray): Boolean {
        if (postorder.size <= 2) {
            return true
        }
        val root = postorder[postorder.size - 1]
        //最后一个左子树的index
        var lastLeft = -1
        for (index in 0 until postorder.size - 1) {
            if (postorder[index] < root) {
                if (lastLeft != -1) {
                    //已经找到右子树的起点了，还小于root就有问题
                    return false
                }
            }
            if (postorder[index] > root) {
                if (lastLeft == -1) {
                    lastLeft = index
                }
            }
        }
        if (lastLeft == -1) {
            //说明没有左子树
            return check(postorder.copyOfRange(0, postorder.size - 1))
        } else {
            return check(postorder.copyOfRange(0, lastLeft)) && check(
                postorder.copyOfRange(lastLeft, postorder.size - 1)
            )
        }
    }

    fun test() {
        verifyPostorder(intArrayOf(1, 2, 3, 4, 5))
    }
}