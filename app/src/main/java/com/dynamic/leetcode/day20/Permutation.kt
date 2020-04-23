package com.dynamic.leetcode.day20

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/4/23
 * 字符串全排列？貌似做过
 */
object Permutation {
    fun permutation(s: String): Array<String> {
        val hashSet = HashSet<String>()
        val array = CharArray(s.length)
        val indexList = ArrayList<Int>()
        dfs(0, array, hashSet, s, indexList)
        val resultArray = Array<String>(hashSet.size) {
            ""
        }
        for ((i, str) in hashSet.withIndex()) {
            resultArray[i] = str
        }
        return resultArray
    }

    fun dfs(
        index: Int,
        array: CharArray,
        hashSet: HashSet<String>,
        s: String,
        indexList: ArrayList<Int>
    ) {
        if (index == s.length) {
            hashSet.add(String(array))
        }
        for (i in s.indices) {
            if (indexList.contains(i)) {
                continue
            }
            array[index] = s[i]
            indexList.add(i)
            dfs(index + 1, array, hashSet, s, indexList)
            indexList.remove(i)
        }
    }

    fun test(){
        permutation("aabc")
    }
}