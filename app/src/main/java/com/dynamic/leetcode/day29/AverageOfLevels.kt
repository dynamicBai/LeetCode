package com.dynamic.leetcode.day29

import java.util.*
import kotlin.collections.ArrayList

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/17
 * 二叉树的层平均值
 */
object AverageOfLevels {
    fun averageOfLevels(root: TreeNode?): DoubleArray {
        val queue = LinkedList<TreeNode>()
        val list = ArrayList<Double>()
        queue.offer(root)
        while (!queue.isEmpty()) {
            val length = queue.size
            //int相加可能越界 需要用long
            var curLevelTotal = 0L
            for (index in 0 until length) {
                val node = queue.poll()
                curLevelTotal += node.`val`
                if (node.left != null) {
                    queue.offer(node.left)
                }
                if (node.right != null) {
                    queue.offer(node.right)
                }
            }
            list.add(curLevelTotal/length.toDouble())
        }
        return list.toDoubleArray()
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}