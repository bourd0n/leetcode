package com.bourd0n.leetcode.twosum

class BruteForceSolution : Solution {
    override fun twoSum(nums: IntArray, target: Int): IntArray {
        for (i in nums.indices) {
            for (j in i + 1 until nums.size) {
                if (nums[j] + nums[i] == target) {
                    return intArrayOf(i, j)
                }
            }
        }
        throw IllegalArgumentException("No two sum solution")
    }
}
