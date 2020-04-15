package com.dynamic.leetcode.day13

import java.util.*
import kotlin.collections.ArrayList

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/15
 * 从上到下 打印每一层二叉树的节点
 */
object VisitBinaryTree {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val listArray = ArrayList<ArrayList<Int>>()
        if (root == null) {
            return listArray
        }
        val queue = LinkedList<TreeNode>()
        queue.offer(root)
        while (!queue.isEmpty()) {
            val length = queue.size
            val list = ArrayList<Int>()
            for (index in 0 until length) {
                val node = queue.poll()
                list.add(node.`val`)
                if (node.left != null) {
                    queue.offer(node.left)
                }
                if (node.right != null) {
                    queue.offer(node.right)
                }
            }
            listArray.add(list)
        }
        return listArray
    }

    fun test(){

    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}