package com.dynamic.leetcode.day30

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/31
 *给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。

示例:
给定有序数组: [-10,-3,0,5,9],

一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：

0
/ \
-3   9
/   /
-10  5
 */
object SortedArrayToBST {
    fun sortedArrayToBST(nums: IntArray): TreeNode? {
        if (nums.isEmpty()) {
            return null
        }
        val mid = nums.size / 2
        val root = TreeNode(nums[mid])
        root.left = sortedArrayToBST(nums.copyOfRange(0,mid))
        root.right = sortedArrayToBST(nums.copyOfRange(mid+1,nums.size))
        return root
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }
}