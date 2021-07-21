package com.dynamic.leetcode.day31;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/7/1
 */
public class ReverseList2 {
    public static Node reversNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node newHead = reversNode(head.next);
        head.next.next = head;
        head.next = null;
        return newHead;
    }

    public static void test() {
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        Node node4 = new Node(4);
        Node node5 = new Node(5);
        node1.next = node2;
        node2.next= node3;
        node3.next = node4;
        node4.next = node5;
        reversNode(node1);
    }


   static class Node {
        public Node(int value) {
            this.value = value;
        }

        Node next;
        int value;

        LinkedList<Character>c;
        char a1 ;
        char[] chars;
        String str = new String(chars);

        ArrayList<String>list = new ArrayList<>();

    }
}
