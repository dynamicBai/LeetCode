package com.dynamic.leetcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dynamic.leetcode.day23.PathSum
import com.dynamic.leetcode.day23.PrintNum
import com.dynamic.leetcode.day24.Num2String
import com.dynamic.leetcode.day24.SortMInNum
import com.dynamic.leetcode.day25.*
import com.dynamic.leetcode.day26.DiceSum
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
//            SwapNode.test()
//            TreeIsSymethetic.test(intArrayOf(1, 2, 2, -1, 3, -1, 3))
//            PrintNumbers.test()
//            ReversWords.test()
//            CountCount.test()
//            LeftRotateString.test()
//            FindMissingNumber.test()
//            MaxInSlideWindow.test()
//             ConstructArr.test()
//            IsStraight.test()
//            LastRemaining.test()
//            PermuteUnique.test()
//            PathInRect.test()
//            MovingCount.test()
//            CuttingRope.test()
//            MyPow.test()
//              ValidaStackSequence.test()
//            Permutation.test()
//            LongestSubString.test()
//            CheckBinaryTraversal.test()
//            PathSum.test()
//            PrintNum.test()
//            SortMInNum.test()
//            Num2String.test()
//            MaxValuePresent.test()
//            UglyNumber.test()
//            SingleNumbers.test()
//            IsNumber.test()
//            SumNums.test
            DiceSum.test()
        }
    }
}
