package com.dynamic.leetcode.day5

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/6
 * 三数和  在两数和的基础上 注意去重
 */
object ThreeSum {
    fun threeSum(nums: IntArray): List<List<Int>> {
        val list = ArrayList<List<Int>>()
        if (nums.size < 3) {
            return list
        }
        nums.sort()
        for (index in nums.indices) {
            if (index - 1 >= 0 && nums[index] == nums[index - 1]) {
                continue
            }
            twoSum(nums, -nums[index], index, list)
        }
        return list.toList()
    }

    private fun twoSum(
        nums: IntArray,
        targetSum: Int,
        startIndex: Int,
        collection: ArrayList<List<Int>>
    ) {
        val hashMap = HashMap<Int, Int>()
        for (index in startIndex + 1 until nums.size) {
            if (hashMap.containsKey(targetSum - nums[index])) {
                val array = intArrayOf(-targetSum, targetSum - nums[index], nums[index])
                if (!checkHasExit(collection, array.toList())) {
                    collection.add(array.toList())
                }
                hashMap[nums[index]] = index
            } else {
                hashMap[nums[index]] = index
            }
        }
    }

    private fun checkHasExit(collection: ArrayList<List<Int>>, list: List<Int>): Boolean {
        fun check(list1: List<Int>, list2: List<Int>): Boolean {
            if (list1.size != list2.size) {
                return false
            }
            for (index in list1.indices) {
                if (list1[index] != list2[index]) {
                    return false
                }
            }
            return true
        }

        for (index in 0 until collection.size) {
            if (check(collection[index], list)) {
                return true
            }
        }

        return false
    }

}