package com.bourd0n.leetcode.reverseinteger

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    @Test
    fun test1() {
        Assert.assertEquals(-1, Solution().reverse(-10).toLong())
    }

    @Test
    fun test2() {
        Assert.assertEquals(0, Solution().reverse(0).toLong())
    }

    @Test
    fun test3() {
        Assert.assertEquals(21, Solution().reverse(120).toLong())
    }

    @Test
    fun test4() {
        Assert.assertEquals(321, Solution().reverse(123).toLong())
    }

    @Test
    fun test5() {
        Assert.assertEquals(-1, Solution().reverse(-100).toLong())
    }

    @Test
    fun test6() {
        Assert.assertEquals(0, Solution().reverse(1534236469).toLong())
    }
}
