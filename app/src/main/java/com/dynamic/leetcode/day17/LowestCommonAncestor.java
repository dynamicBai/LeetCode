package com.dynamic.leetcode.day17;

import java.util.LinkedList;

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/20
 */
public class LowestCommonAncestor {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        TreeNode curNode = root;
        while (curNode != null) {
            if (checkIsCommonAncestor(curNode.left, p, q)) {
                curNode = curNode.left;
            } else if (checkIsCommonAncestor(curNode.right, p, q)) {
                curNode = curNode.right;
            } else {
                return curNode;
            }
        }
        return null;
    }

    private boolean checkIsCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        boolean containP = false;
        boolean containQ = false;
        LinkedList<TreeNode> queue = new LinkedList<>();
        queue.offer(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node == p) {
                containP = true;
            }
            if (node == q) {
                containQ = true;
            }
            if (containP && containQ) {
                break;
            }
            if (node.left != null) {
                queue.offer(node.left);
            }
            if (node.right != null) {
                queue.offer(node.right);
            }
        }

        return containP && containQ;
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
