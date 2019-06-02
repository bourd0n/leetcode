package com.bourd0n.leetcode.removeduplicatesfromsortedarray

class Solution {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty() || nums.size == 1) {
            return nums.size
        }
        var curEndArrayIndex = 0
        for (i in 0 until nums.size) {
            if (nums[i] != nums[curEndArrayIndex]) {
                curEndArrayIndex++
                nums[curEndArrayIndex] = nums[i]
            }
        }

        return curEndArrayIndex + 1
    }
}
