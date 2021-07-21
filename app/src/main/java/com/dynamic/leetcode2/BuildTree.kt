package com.dynamic.leetcode2

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2021/3/2
 *
 */
class BuildTree {
    private lateinit var mPreorder: IntArray
    var mInOrderHashMap: HashMap<Int, Int> = HashMap()
    fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
        mPreorder = preorder
        for (i in inorder.indices) {
            mInOrderHashMap[inorder[i]] = i
        }
        return rec(0, 0, inorder.size - 1)
    }

    fun rec(root: Int, left: Int, right: Int): TreeNode? {
        if (left > right) return null
        val node = TreeNode(mPreorder[root])
        val rootInorderIndex: Int = mInOrderHashMap[mPreorder[root]]!!
        node.left = rec(root + 1, left, rootInorderIndex - 1)
        node.right = rec(root + rootInorderIndex - left + 1, rootInorderIndex + 1, right)
        return node
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}