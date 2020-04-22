package com.dynamic.leetcode.day19

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/22
 * 输入某二叉树的前序遍历和中序遍历的结果，请重建该二叉树。假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

 

例如，给出

前序遍历 preorder = [3,9,20,15,7]
中序遍历 inorder = [9,3,15,20,7]
返回如下的二叉树：

3
/ \
9  20
/  \
15   7
 */
object BuildTree {
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        if (preorder.isEmpty() || inorder.isEmpty()) {
            return null
        }
        var rootIndexInOrder = 0
        for (index in inorder.indices) {
            if (inorder[index] == preorder[0]) {
                rootIndexInOrder = index
                break
            }
        }
        val node = TreeNode(preorder[0])
        node.left = buildTree(
            preorder.copyOfRange(1, 1 + rootIndexInOrder),
            inorder.copyOfRange(0, rootIndexInOrder)
        )
        node.right = buildTree(
            preorder.copyOfRange(1 + rootIndexInOrder, preorder.size),
            inorder.copyOfRange(rootIndexInOrder + 1, inorder.size)
        )
        return node
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}