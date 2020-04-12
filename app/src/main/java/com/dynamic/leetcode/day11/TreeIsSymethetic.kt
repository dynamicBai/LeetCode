package com.dynamic.leetcode.day11

import java.util.*

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/12
 * 判断二叉树 是否对称  即为镜像后是否一致
 */
object TreeIsSymethetic {
    fun isSymmetric(root: TreeNode?): Boolean {
        if (root == null) {
            return true
        }
        var newRoot: TreeNode? = cloneTree(root)
        newRoot = mirrorTree(newRoot)
        return visitTree(root, newRoot)
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

    private fun visitTree(root: TreeNode?, mirrorRoot: TreeNode?): Boolean {
        if (root == null && mirrorRoot == null) {
            return true
        }
        val normalStack = Stack<TreeNode?>()
        normalStack.push(root)
        val mirrorStack = Stack<TreeNode?>()
        mirrorStack.push(mirrorRoot)
        while (!normalStack.isEmpty() && !mirrorStack.isEmpty()) {
            val normalNode = normalStack.pop()
            val mirrorNode = mirrorStack.pop()
            if (normalNode?.`val` != mirrorNode?.`val`) {
                return false
            }
            if (normalNode != null) {
                normalStack.push(normalNode.left)
                normalStack.push(normalNode.right)
            }
            if (mirrorNode != null) {
                mirrorStack.push(mirrorNode.left)
                mirrorStack.push(mirrorNode.right)
            }
        }
        if (!normalStack.isEmpty() || !mirrorStack.isEmpty()) {
            return false
        }
        return true
    }

    private fun cloneTree(root: TreeNode?): TreeNode? {
        if (root == null) {
            return null
        }
        var varRoot = TreeNode(root.`val`)
        varRoot.left = cloneTree(root.left)
        varRoot.right = cloneTree(root.right)

        return varRoot

    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun test(intArray: IntArray): Boolean {
        val root = TreeNode(intArray[0])
        var node = root
        var index = 1
        val queue = LinkedList<TreeNode>()
        queue.offer(node)
        while (index < intArray.size) {
            val curNode = queue.poll() ?: continue
            if (intArray[index] >= 0) {
                curNode.left = TreeNode(intArray[index])
                queue.offer(curNode.left)
            } else {
                curNode.left = null
            }

            if (index + 1 < intArray.size && intArray[index + 1] >= 0) {
                curNode.right = TreeNode(intArray[index + 1])
                queue.offer(curNode.right)
            } else {
                curNode.right = null
            }
            index += 2
        }
        return isSymmetric(root)

    }

}