package com.bourd0n.leetcode.twosum

import java.util.HashMap

class OnePassHashTableSolution : Solution {

//my implementation
    fun twoSumMy(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(nums[i]) && nums[i] * 2 == target) {
                return intArrayOf(map[nums[i]]!!, i)
            }
            map[nums[i]] = i
            if (map.containsKey(complement) && map[complement] != i) {
                val j = map[complement]
                return if (i < j!!) {
                    intArrayOf(i, j)
                } else {
                    intArrayOf(j, i)
                }
            }
        }
        throw IllegalArgumentException("No two sum solution")
    }

    override fun twoSum(nums: IntArray, target: Int): IntArray {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            map[complement]?.let {
                return intArrayOf(it, i)
            }
            map[nums[i]] = i
        }
        throw IllegalArgumentException("No two sum solution")
    }
}
