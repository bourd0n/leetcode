package com.bourd0n.leetcode.removeduplicatesfromsortedarray

import assertk.assertThat
import assertk.assertions.isEqualTo
import org.junit.Test

class SolutionTest {

    private val solution = Solution()

    private fun test(nums: IntArray): Int {
        return solution.removeDuplicates(nums)
    }

    @Test
    fun test1() {
        val nums = intArrayOf(1,1,2)
        assertThat(test(nums)).isEqualTo(2)
        assertThat(nums).isEqualTo(intArrayOf(1,2,2))
    }

    @Test
    fun test2() {
        val nums = intArrayOf(0,0,1,1,1,2,2,3,3,4)
        assertThat(test(nums)).isEqualTo(5)
        assertThat(nums).isEqualTo(intArrayOf(0,1,2,3,4,2,2,3,3,4))
    }
}
