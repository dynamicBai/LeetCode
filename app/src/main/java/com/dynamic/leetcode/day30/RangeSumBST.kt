package com.dynamic.leetcode.day30

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/31
 *给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。

二叉搜索树保证具有唯一的值。

 

示例 1：

输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
输出：32
示例 2：

输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
输出：23
 */
object RangeSumBST {
    var sum = 0
    fun rangeSumBST(root: TreeNode?, L: Int, R: Int): Int {
        if (root == null) {
            return sum
        }
        if (root.`val` < L) {
            rangeSumBST(root.right, L, R)
        } else if (root.`val` > R) {
            rangeSumBST(root.left, L, R)
        } else if(root.`val` in L..R){
            sum += root.`val`
            rangeSumBST(root.left, L, R)
            rangeSumBST(root.right, L, R)
        }
        return sum
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}