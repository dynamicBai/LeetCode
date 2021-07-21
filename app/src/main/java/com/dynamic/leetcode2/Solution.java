//package com.dynamic.leetcode2;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.Collection;
//import java.util.Collections;
//import java.util.Deque;
//import java.util.HashMap;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.Stack;
//
///**
// * @author: dynamic
// * email:  dynamicbai@gmail.com
// * date:   on 2021/5/7
// */
//class CQueue {
//    Stack<Integer> mStackFront = new Stack<>();
//    Stack<Integer> mStackBack = new Stack<>();
//
//    public CQueue() {
//
//    }
//
//    public void appendTail(int value) {
//        mStackFront.push(value);
//    }
//
//    public int deleteHead() {
//        if (!mStackBack.isEmpty()) {
//            return mStackBack.pop();
//        } else {
//            while (!mStackFront.isEmpty()) {
//                int value = mStackFront.pop();
//                mStackBack.push(value);
//            }
//            if (!mStackBack.isEmpty()) {
//                return mStackBack.pop();
//            }else {
//                return -1;
//            }
//        }
//    }
//
//
//    public boolean exist(char[][] board, String word) {
//        char[] words = word.toCharArray();
//        for(int i=0;i<board.length;i++){
//            for(int j=0;j<board[0].length;j++){
//                if(dfs(board,words,i,j,0)) return true;
//            }
//        }
//        return false;
//    }
//
//    private boolean dfs(char[][]board,char[]words,int i,int j,int k){
//        if(i<0||i>=board.length||j<0||j>=board[0].length||board[i][j]!=words[k]){
//            return false;
//        }
//        if(k == words.length-1){
//            return true;
//        }
//        board[i][j] = '\0';
//
//        boolean result = dfs(board,words,i+1,j,k+1)||dfs(board,words,i-1,j,k+1)
//                ||dfs(board,words,i,j+1,k+1)||dfs(board,words,i,j-1,k+1);
//        board[i][j]= words[k];
//        return result;
//    }
//
//
//    public int[] maxSlidingWindow(int[] nums, int k) {
//         LinkedList<Integer> deque = new LinkedList();
//
//
//        for(int i=0;i<k;i++){
//            //队尾入队逻辑
//            while(!deque.isEmpty() && deque.peekLast()<nums[i]){
//                deque.pollLast();
//            }
//            deque.offerLast(nums[i]);
//        }
//        int[] res = new int[nums.length-k+1];
//        Math.pow(3,10);
//
//        for(int i=k;i<nums.size();i++){
//            //队头出队逻辑
//            if(!deque.isEmpty() &&nums[i-k] == deque.peekFirst()){
//                deque.pollFirst();
//            }
//            //队尾入队逻辑
//            while(!deque.isEmpty() && deque.peekLast()<value){
//                deque.pollLast();
//            }
//            deque.offerLast(value);
//            res[i-k] = deque.peekFirst();
//        }
//        return res;
//    }
//
//
//    public int[] levelOrder(TreeNode root) {
//        if(root == null){
//            return new int[]{};
//        }
//        List<Integer>list = new ArrayList<>();
//        Queue<Integer> queue = new LinkedList();
//        queue.offer(root.val);
//        while(!queue.isEmpty()){
//            TreeNode node = queue.poll();
//            res.add(node.val);
//            if(node.left!=null){
//                queue.offer(node.left);
//            }
//            if(node.right!=null){
//                queue.offer(node.right);
//            }
//        }
//
//        int key;
//        key = key<<1;
//        Deque<double>deque;
//        Collections.reverse(list);
//        return list.toArray(int[]);
//    }
//
//
//    public void a(){
//        int[][]vis = new int[3][2];
//        int a=1;int b=2;
//        if((a&b)!=0){
//
//            LinkedList<Integer>linkedList = new LinkedList<>();
//            linkedList.offerFirst();
//            HashMap hashMap;
//            hashMap.si
//
//        }
//        int[][]  tmp = new int[4][5];
//        int m=tmp.length;
//        int n = tmp[0].length;
//        Arrays.sort();
//
//        HashSet<Character>hashSet = new HashSet<>();
//    }
//
//}
