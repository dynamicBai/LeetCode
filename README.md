# LeetCode
leetcode dayly fun

koltin解leetcode 

可能时间空间复杂度不是最优的，但是能AC

android开发刷题练练手 先easy后medium 最后才考虑hard

主要是锻炼开拓思维和灵活运用各种数据结构吧


##Day3

###1.两个有序的链表合并成一个有序链表 -ease
分析:主要掌握链表的head、cur 以及return node   一般head是一个temp,返回值是head.next

###2.有序的数组去重  （要求只能在原来的数组操作，只需要保证0 until length的值）
分析:额外用一个指针记录flagIndex=0，当满足要求时更新flagIndex++以及对应的值即可。

因为只要数组不为空，至少有一个元素。当满足条件++,所以结果长度为flaginde+1

###3.无序数组删除指定元素
分析:和上一题很类似。也是额外用flageIndex指针记录并且修改值。需要注意区别是flagIndex都是从0开始，但是这道题可能全部都是重的，可能为0。

满足条件++，所以返回值应该是flagIndex
