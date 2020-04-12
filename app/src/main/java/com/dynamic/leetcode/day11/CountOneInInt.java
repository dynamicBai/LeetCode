package com.dynamic.leetcode.day11;

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/12
 * 在整数里面数1的个数
 * oj这题不支持kotlin
 */
public class CountOneInInt {
    public int hammingWeight(int n) {
        int count = 0;
        int flag = 1;
        while(flag != 0) {
            if((n & flag) != 0) {
                count++;
            }
            flag = flag << 1;
        }
        return count;
    }
}
