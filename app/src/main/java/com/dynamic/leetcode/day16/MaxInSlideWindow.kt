package com.dynamic.leetcode.day16

import java.util.*
import kotlin.collections.ArrayDeque
import kotlin.collections.ArrayList
import kotlin.math.sign

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/18
 * 滑动窗口最大值
 * 采用双向队列
 */
object MaxInSlideWindow {
    fun maxSlidingWindow(nums: IntArray, k: Int): IntArray {
        if (nums.isEmpty()) {
            return IntArray(0)
        }
        var begin: Int
        val deQueue = LinkedList<Int>()
        val list = ArrayList<Int>()
        for (index in nums.indices) {
            begin = index - k + 1
            if (deQueue.isEmpty()) {
                deQueue.add(index)
            } else {
                if (begin > deQueue.peekFirst()) {
                    //说明队列最大值 已经超出滑动窗口范围 需要移掉了
                    deQueue.pollFirst()
                }
            }
            //维护双向队列 保证是从大到小
            while (!deQueue.isEmpty() && nums[deQueue.peekLast()] <= nums[index]) {
                deQueue.pollLast()
            }
            deQueue.add(index)
            //如果此时滑动窗口从0开始了 就可以把有效窗口的最大值记录下来
            if (begin >= 0) {
                list.add(nums[deQueue.peekFirst()])
            }
        }
        return list.toIntArray()
    }

    fun test() {
        maxSlidingWindow(intArrayOf(1, 3, -1, -3, 5, 3, 6, 7), 3)
    }


}