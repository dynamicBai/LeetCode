package com.dynamic.leetcode.day31;

import java.util.LinkedList;

/**
 * 树：从一个节点到另一个节点的最大路径和
 * 可以不经过根节点
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/7/1
 */
public class MaxPathSum {
    int max = Integer.MIN_VALUE;

    public int maxPathSKum(TreeNode root) {
        maxGain(root);
        return max;
    }

    /**
     * 从root往下的最大和路劲
     *
     * @param root
     * @return
     */
    public int maxGain(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftMaxGain = Math.max(maxGain(root.left), 0);
        int rightMaxGain = Math.max(maxGain(root.right), 0);
        int curSum = root.val + leftMaxGain + rightMaxGain;
        max = Math.max(curSum, max);
        return root.val + Math.max(leftMaxGain, rightMaxGain);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode(int x) {
            val = x;
        }
    }
}
