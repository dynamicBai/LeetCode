package com.dynamic.leetcode.day22

import java.util.*
import kotlin.collections.ArrayList

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/27
 *请实现一个函数按照之字形顺序打印二叉树，即第一行按照从左到右的顺序打印，第二层按照从右到左的顺序打印，第三行再按照从左到右的顺序打印，其他行以此类推。
 */
object levelOrder2 {
    fun levelOrder(root: TreeNode?): List<List<Int>> {
        val resultList = ArrayList<ArrayList<Int>>()
        if (root == null) {
            return resultList
        }
        val linkedList = LinkedList<TreeNode>()
        linkedList.add(root)
        var level = 0
        while (!linkedList.isEmpty()) {
            level++
            val length = linkedList.size
            val curList = ArrayList<Int>()
            for (index in 0 until length) {
                val node = linkedList.poll()
                if (node.left != null) {
                    linkedList.add(node.left!!)
                }
                if (node.right != null) {
                    linkedList.add(node.right!!)
                }
                curList.add(node.`val`)
            }
            if (level % 2 == 0) {
                //需要倒序
                curList.reverse()
            }
            resultList.add(curList)
        }
        return resultList
    }

    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}