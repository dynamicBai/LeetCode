package com.dynamic.leetcode.day16

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/17
 * 在二叉搜索树里找到第k大的节点
 */
object FindKNodeInTree {
    fun kthLargest(root: TreeNode?, k: Int): Int {
        val list = ArrayList<TreeNode>()
        searchTree(root, list)
        if (k > 0 && k - 1 < list.size) {
            return list[k - 1].`val`
        }
        return -1
    }

    private fun searchTree(node: TreeNode?, list: ArrayList<TreeNode>) {
        if (node == null) {
            return
        }
        if (node.right != null) {
            searchTree(node.right, list)
        }
        list.add(node)
        if (node.left != null) {
            searchTree(node.left, list)
        }
    }

    fun test() {

    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}