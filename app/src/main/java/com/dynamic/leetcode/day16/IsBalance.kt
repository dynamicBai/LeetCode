package com.dynamic.leetcode.day16

import org.w3c.dom.Node

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/18
 * 判断二叉树 是否是平衡二叉树
 */
object IsBalance {
    fun isBalanced(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }
        if (!isBalanced(root.left)) {
            return false
        }
        if (!isBalanced(root.right)) {
            return false
        }
        if (!checkNode(root)) {
            return false
        }
        return true
    }

    private fun checkNode(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }
        val leftDepth = getDepth(root.left)
        val rightDepth = getDepth(root.right)
        if (Math.abs(leftDepth - rightDepth) > 1) {
            return false
        }
        return true
    }


    private fun getDepth(node: TreeNode?): Int {
        if (node == null) {
            return 0
        }
        val leftDepth = 1 + getDepth(node.left)

        val rightDepth = 1 + getDepth(node.right)

        return if (leftDepth > rightDepth) {
            leftDepth
        } else {
            rightDepth
        }
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}