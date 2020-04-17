package com.dynamic.leetcode.day14

import java.util.*

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/16
 *  二叉树的最大深度
 */
object BinaryTreeMaxDepth {
    fun maxDepth(root: TreeNode?): Int {
        if (root == null) {
            return 0
        }
        val queue = LinkedList<TreeNode>()
        queue.offer(root)
        var floor = 0
        while (!queue.isEmpty()) {
            val length = queue.size
            for (index in 0 until length) {
                val node = queue.poll()
                if (node.left != null) {
                    queue.offer(node.left)
                }
                if (node.right != null) {
                    queue.offer(node.right)
                }
            }
            floor++
        }
        return floor
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}