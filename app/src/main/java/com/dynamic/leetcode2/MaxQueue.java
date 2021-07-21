package com.dynamic.leetcode2;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2021/5/7
 */
class MaxQueue {
    private Deque<Integer> mDeque = new LinkedList<>();
    private Queue<Integer> mQueue = new LinkedList<>();

    public MaxQueue() {

    }

    public int max_value() {
        return mDeque.isEmpty() ? -1 : mDeque.peekFirst();
    }

    public void push_back(int value) {
        mQueue.offer(value);
        while (!mDeque.isEmpty() && mDeque.peekLast() < value) {
            mDeque.pollLast();
        }
        mDeque.offer(value);
    }

    public int pop_front() {
        if (mQueue.isEmpty()) {
            return -1;
        }
        int value = mQueue.poll();
        if (!mDeque.isEmpty() && mDeque.peekFirst() == value) {
            mDeque.pollFirst();
        }
        return value;
    }




}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
