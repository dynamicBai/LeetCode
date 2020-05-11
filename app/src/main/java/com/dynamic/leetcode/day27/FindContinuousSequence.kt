package com.dynamic.leetcode.day27

/**
 * @author: dynamic
 * email:  dynamicbai@gmail.com
 * date:   on 2020/5/11
 *输入一个正整数 target ，输出所有和为 target 的连续正整数序列（至少含有两个数）。

序列内的数字由小到大排列，不同序列按照首个数字从小到大排列。

来源：力扣（LeetCode）
链接：https://leetcode-cn.com/problems/he-wei-sde-lian-xu-zheng-shu-xu-lie-lcof
著作权归领扣网络所有。商业转载请联系官方授权，非商业转载请注明出处。
 */
object FindContinuousSequence {
    fun findContinuousSequence(target: Int): Array<IntArray> {
        var left = 1
        var right = 1
        val arrayList = ArrayList<IntArray>()
        while (right in left until target) {
            val curSum = sum(left, right)
            if (curSum == target) {
                val array = IntArray(right - left + 1) {
                    it + left
                }
                arrayList.add(array)
                right++
            } else if (curSum < target) {
                right++
            } else {
                left++
            }
        }
        val result = Array<IntArray>(arrayList.size){
            arrayList[it]
        }
        return result
    }

    private fun sum(left: Int, right: Int): Int {
        return (left + right) * (right - left + 1) / 2
    }

    fun test(){
        findContinuousSequence(9)
    }
}