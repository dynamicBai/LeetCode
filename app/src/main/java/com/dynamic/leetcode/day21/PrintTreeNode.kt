package com.dynamic.leetcode.day21

import java.util.*
import kotlin.collections.ArrayList

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/24
 * 从上到下，从左到右打印节点
 */
object PrintTreeNode {
    fun levelOrder(root: TreeNode?): IntArray {
        if (root == null) {
            return IntArray(0)
        }
        val linkedList = LinkedList<TreeNode>()
        val list = ArrayList<Int>()
        linkedList.add(root)
        while (!linkedList.isEmpty()) {
            val node = linkedList.poll()
            list.add(node.`val`)
            if (node.left != null) {
                linkedList.add(node.left!!)
            }
            if (node.right != null) {
                linkedList.add(node.right!!)
            }
        }
        return list.toIntArray()
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}