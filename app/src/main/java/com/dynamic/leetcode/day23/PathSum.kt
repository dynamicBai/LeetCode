package com.dynamic.leetcode.day23

import android.util.Log
import com.dynamic.leetcode.day19.BuildTree

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/27
 * 输入一棵二叉树和一个整数，打印出二叉树中节点值的和为输入整数的所有路径。从树的根节点开始往下一直到叶节点所经过的节点形成一条路径。
 */
object PathSum {
    fun pathSum(root: TreeNode?, sum: Int): List<List<Int>> {
        val list = ArrayList<Int>()
        val resultList = ArrayList<ArrayList<Int>>()
        path(root, 0, sum, list, resultList)
        return resultList
    }

    private fun path(
        root: TreeNode?,
        curSum: Int,
        target: Int,
        list: ArrayList<Int>,
        resultList: ArrayList<ArrayList<Int>>
    ) {
        if (root == null) {
            return
        }
        val value = root.`val`
        list.add(value)
        if (curSum + value == target && root.left == null && root.right == null) {
            resultList.add(ArrayList(list))
        }
        path(root.left, curSum + value, target, list, resultList)
        path(root.right, curSum + value, target, list, resultList)
        list.removeAt(list.size - 1)
    }


    class TreeNode(var `val`: Int) {
        var left: TreeNode? = null
        var right: TreeNode? = null
    }

    fun test() {
//        val root = BuildTree.buildTree(
//            intArrayOf(5, 4, 11, 7, 2, 8, 13, 4, 5, 1),
//            intArrayOf(7, 11, 2, 4, 5, 13, 8, 5, 4, 1)
//        )
//        pathSum(root, 22)
//    val list = ArrayList<Int>()
//    traserval(root, list)
    }
}