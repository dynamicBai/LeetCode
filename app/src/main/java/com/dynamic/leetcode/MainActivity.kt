package com.dynamic.leetcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dynamic.leetcode.day1.LongestSubStringSolution
import com.dynamic.leetcode.day1.ParentheseSolution
import com.dynamic.leetcode.day1.PrefixSolution
import com.dynamic.leetcode.day3.MergeTwoSortedLinkedListSolution
import com.dynamic.leetcode.day3.RemoveElementSolution
import com.dynamic.leetcode.day4.StrStrSolution
import com.dynamic.leetcode.day6.LetterPhoneNumber
import com.dynamic.leetcode.day7.GenerateParentheses
import com.dynamic.leetcode.day7.RemoveNthEndNode
import com.dynamic.leetcode.day7.SwapNode
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.setOnClickListener {
//      LongestSubStringSolution.lengthOfLongestSubstring("abcabcbb")
//      PrefixSolution.longestCommonPrefix(arrayOf("c","c"))
//            ParentheseSolution.isValid("()[]{}")
//            MergeTwoSortedLinkedListSolution.mergeTwoLists(
//                MergeTwoSortedLinkedListSolution.buildListNode(
//                    intArrayOf(1, 2, 4)
//                ), MergeTwoSortedLinkedListSolution.buildListNode(intArrayOf(1, 3, 4))）
//            RemoveElementSolution.removeElement(intArrayOf(3,2,2,3),3)
//            StrStrSolution.strStr("hello",
//                "ll")
//            LetterPhoneNumber.letterCombinations("237")
//            RemoveNthEndNode.removeNthFromEnd(
//                RemoveNthEndNode.buildListNode(
//                    intArrayOf(1, 2, 3, 4, 5)
//                ), 2
//            )
//            GenerateParentheses.test()
            SwapNode.test()
        }
    }
}
