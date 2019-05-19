package com.bourd0n.leetcode.longestcommonprefix

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    private val solution = Solution()

    @Test
    fun test1() {
        Assert.assertEquals("fl", solution.longestCommonPrefix(arrayOf("flower", "flow", "flight")))
    }

    @Test
    fun test2() {
        Assert.assertEquals("", solution.longestCommonPrefix(arrayOf("ower", "flow", "flight")))
    }

    @Test
    fun test3() {
        Assert.assertEquals("f", solution.longestCommonPrefix(arrayOf("fower", "flow", "flight")))
    }

    @Test
    fun test4() {
        Assert.assertEquals("", solution.longestCommonPrefix(arrayOf("", "")))
    }

    @Test
    fun test5() {
        Assert.assertEquals("", solution.longestCommonPrefix(arrayOf("")))
    }

    @Test
    fun test6() {
        Assert.assertEquals("let", solution.longestCommonPrefix(arrayOf("let", "let", "let")))
    }

    @Test
    fun test7() {
        Assert.assertEquals("aa", solution.longestCommonPrefix(arrayOf("aaa", "aa", "aaa")))
    }
}
