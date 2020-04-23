package com.dynamic.leetcode.day20

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/23
 * 判断是否是树的子结构
 */
object IsSubStructure {
    fun isSubStructure(A: TreeNode?, B: TreeNode?): Boolean {
        if (A == null || B == null) {
            return false
        }
        if (A.`val` == B.`val` && checkNode(A, B)) {
            return true
        } else {
            return isSubStructure(A.left, B) || isSubStructure(A.right, B)
        }
    }

    private fun checkNode(A: TreeNode?, B: TreeNode?): Boolean {
        if (A != null && B == null) {
            return true
        } else if (A == null && B == null) {
            return true
        } else if (A != null && B != null) {
            if (A.`val` == B.`val`) {
                return checkNode(A.left, B.left) && checkNode(A.right, B.right)
            } else {
                return false
            }
        } else {
            return false
        }
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}