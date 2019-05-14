package com.bourd0n.leetcode.palindromenumber

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun testNumber1() {
        assertTrue(solution.isPalindrome(121))
    }

    @Test
    fun testNumber2() {
        assertTrue(solution.isPalindrome(100001))
    }

    @Test
    fun testNumber3() {
        assertFalse(solution.isPalindrome(-121))
    }

    @Test
    fun testNumber4() {
        assertFalse(solution.isPalindrome(10))
    }

    @Test
    fun testNumber5() {
        assertFalse(solution.isPalindrome(1234567899))
    }
}
