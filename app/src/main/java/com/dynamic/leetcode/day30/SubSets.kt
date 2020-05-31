package com.dynamic.leetcode.day30

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/31
 *幂集。编写一种方法，返回某集合的所有子集。集合中不包含重复的元素。

说明：解集不能包含重复的子集。

示例:

输入： nums = [1,2,3]
输出：
[
[3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
 */
object SubSets {
    fun subsets(nums: IntArray): List<List<Int>> {
        val result = ArrayList<ArrayList<Int>>()
        val list = ArrayList<Int>()
        dfs(0, list, result, nums)
        return result
    }

    fun dfs(index: Int, list: ArrayList<Int>, result: ArrayList<ArrayList<Int>>, nums: IntArray) {
        result.add(ArrayList(list))
        for (i in index until nums.size) {
            list.add(nums[i])
            dfs(i + 1, list, result, nums)
            list.removeAt(list.size - 1)
        }
    }

    fun test() {
        subsets(intArrayOf(1, 2, 3))
    }

}