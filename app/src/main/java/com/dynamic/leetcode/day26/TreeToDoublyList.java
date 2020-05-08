package com.dynamic.leetcode.day26;

import java.util.ArrayList;

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/8
 */
public class TreeToDoublyList {
    public Node treeToDoublyList(Node root) {
        ArrayList<Node> list = new ArrayList();
        buildList(list, root);
        if (list.size() == 0) {
            return null;
        }
        if (list.size() == 1) {
            list.get(0).left = list.get(0);
            list.get(0).right = list.get(0);
            return list.get(0);
        }
        for (int i = 0; i < list.size(); i++) {
            Node curNode = list.get(i);
            if (i == 0) {
                curNode.left = list.get(list.size() - 1);
                curNode.right = list.get(i + 1);
            } else if (i < list.size() - 1) {
                Node preNode = list.get(i - 1);
                preNode.right = curNode;
                curNode.left = preNode;
            } else {
                Node preNode = list.get(i - 1);
                Node firstNode = list.get(0);
                preNode.right = curNode;
                curNode.left = preNode;
                curNode.right = firstNode;
            }
        }
        return list.get(0);
    }


    private void buildList(ArrayList<Node> list, Node root) {
        if (root == null) {
            return;
        }
        buildList(list, root.left);
        list.add(root);
        buildList(list, root.right);
    }


    class Node {
        public int val;
        public Node left;
        public Node right;

        public Node() {
        }

        public Node(int _val) {
            val = _val;
        }

        public Node(int _val, Node _left, Node _right) {
            val = _val;
            left = _left;
            right = _right;
        }
    }
}
