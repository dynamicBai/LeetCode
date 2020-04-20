package com.dynamic.leetcode.day17

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/20
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 * 树递归+回溯
 */
object PermuteUnique {
    fun permuteUnique(nums: IntArray): List<List<Int>> {
        val result = HashSet<List<Int>>()
        val array = IntArray(nums.size)
        val indexList = ArrayList<Int>()
        findUnique(0, nums, array, result, indexList)
        return result.toList()
    }

    private fun findUnique(
        index: Int,
        nums: IntArray,
        array: IntArray,
        result: HashSet<List<Int>>,
        indexList: ArrayList<Int>
    ) {
        if (index == nums.size) {
            result.add(array.toList())
            return
        }
        for (i in nums.indices) {
            if (indexList.contains(i)) {
                continue
            }
            array[index] = nums[i]
            indexList.add(i)
            findUnique(index + 1, nums, array, result, indexList)
            //回退indexList array数组可以覆盖不用回退
            indexList.remove(indexList[indexList.size - 1])
        }
    }

    fun test() {
        permuteUnique(intArrayOf(1, 1, 2))
    }


}