//package com.dynamic.leetcode2;
//
///**
// * @author: dynamic
// * email:  dynamicbai@gmail.com
// * date:   on 2021/5/19
// */
//public class LRUCache {
//     
//
//    static class LinkedNode{
//        LinkedNode pre;
//        LinkedNode next;
//        int val;
//        int key;
//        public LinkedNode(){}
//        public LinkedNode(int key,int val){
//            this.key = key;
//            this.val = val;
//        }
//    }
//    int mCapacity;
//    LinkedNode tmpHead = new LinkedNode();
//    LinkedNode tmpTail = new LinkedNode();
//    int size =0;
//
//    public LRUCache(int capacity) {
//        this.mCapacity = capacity;
//        tmpHead.next = tmpTail;
//        tmpTail.pre = tmpHead;
//    }
//
//    public int get(int key) {
//        LinkedNode node = findNodeByKey(key);
//        removeNode(node);
//        addToTail(node);
//        if(node!=null){
//            return node.val;
//        }else{
//            return -1;
//        }
//    }
//
//    private LinkedNode findNodeByKey(int key){
//        LinkedNode node = tmpHead.next;
//        while(node!=null){
//            if(node.key == key){
//                break;
//            }
//            node = node.next;
//        }
//        return node;
//    }
//
//    private void addToTail(LinkedNode node){
//        LinkedNode pre = tmpTail.pre;
//        pre.next = node;
//        node.pre = pre;
//        node.next = tmpTail;
//        tmpTail.pre = node;
//    }
//
//    private void removeNode(LinkedNode node){
//        LinkedNode pre = node.pre;
//        LinkedNode next = node.next;
//        pre.next = next;
//        next.pre = pre;
//    }
//
//    private void addToHead(LinkedNode node){
//        LinkedNode next = tmpHead.next;
//        next.pre = node;
//        node.next =next;
//        node.pre = tmpHead;
//        tmpHead.next = node;
//    }
//
//    public void put(int key, int value) {
//        LinkedNode node = findNodeByKey(key);
//        if(node!=null){
//            node.val = value;
//            removeNode(node);
//            addToTail(node);
//            return;
//        }
//        if(size == mCapacity){
//            removeNode(tmpHead.next);
//            size--;
//        }
//        LinkedNode node1 = new LinkedNode(key, value);
//        addToTail(node1);
//        size++;
//    }
//}
//
///**
// * Your LRUCache object will be instantiated and called as such:
// * LRUCache obj = new LRUCache(capacity);
// * int param_1 = obj.get(key);
// * obj.put(key,value);
// */