package com.dynamic.leetcode

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.dynamic.demo.Util
import com.dynamic.leetcode.day1.LongestSubStringSolution
import com.dynamic.leetcode.day1.ParentheseSolution
import com.dynamic.leetcode.day1.PrefixSolution
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        text.setOnClickListener {
//      LongestSubStringSolution.lengthOfLongestSubstring("abcabcbb")
//      PrefixSolution.longestCommonPrefix(arrayOf("c","c"))
//            ParentheseSolution.isValid("()[]{}")
            Util.put()
        }
    }
}
