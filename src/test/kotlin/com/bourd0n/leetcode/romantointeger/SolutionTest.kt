package com.bourd0n.leetcode.romantointeger

import org.junit.Assert.assertEquals
import org.junit.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        assertEquals(3, solution.romanToInt("III"))
    }

    @Test
    fun test2() {
        assertEquals(4, solution.romanToInt("IV"))
    }

    @Test
    fun test3() {
        assertEquals(6, solution.romanToInt("VI"))
    }

    @Test
    fun test4() {
        assertEquals(9, solution.romanToInt("IX"))
    }

    @Test
    fun test5() {
        assertEquals(58, solution.romanToInt("LVIII"))
    }

    @Test
    fun test6() {
        assertEquals(1994, solution.romanToInt("MCMXCIV"))
    }
}
