package com.bourd0n.leetcode.twosum

import java.util.HashMap



class TwoPassHashTableSolution : Solution {
    override fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            map[nums[i]] = i
        }

        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement) && map[complement] != i) {
                return intArrayOf(i, map[complement]!!)
            }
        }

        throw IllegalArgumentException("No two sum solution")
    }
}
