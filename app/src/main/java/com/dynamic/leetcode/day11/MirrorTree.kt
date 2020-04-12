package com.dynamic.leetcode.day11

import java.util.*
import kotlin.collections.ArrayList

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/12
 * 镜像二叉树
 */
object MirrorTree {

    //镜像二叉树  感觉就是广度优先，只是从右往左遍历？
    fun mirrorTree1(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        val queue = LinkedList<TreeNode?>()
        queue.offer(root)
        val list = ArrayList<TreeNode?>()

        //从右到左遍历完二叉树 得到list
        while (!queue.isEmpty()) {
            val treeNode = queue.poll()
            if (treeNode != null) {
                list.add(treeNode)
            } else {
                list.add(null)
                continue
            }
            if (treeNode.right != null) {
                queue.offer(treeNode.right)
            } else {
                queue.offer(null)
            }
            if (treeNode.left != null) {
                queue.offer(treeNode.left)
            } else {
                queue.offer(null)
            }
        }

        queue.clear()
        val newRoot = list[0]
        queue.offer(newRoot)
        //通过list构造从左往右的二叉树
        var index = 1
        while (index < list.size) {
            val node = queue.poll() ?: continue
            node.left = list[index]
            queue.offer(node.left)
            if (index + 1 < list.size) {
                node.right = list[index + 1]
                queue.offer(node.right)
            }
            index += 2
        }
        return newRoot
    }

    //使用递归
    fun mirrorTree(root: TreeNode?): TreeNode? {
        swap(root)
        return root
    }

    private fun swap(root: TreeNode?) {
        if (root == null) {
            return
        }
        val leftNode = root.left
        val rightNode = root.right
        root.left = rightNode
        root.right = leftNode
        swap(leftNode)
        swap(rightNode)
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}