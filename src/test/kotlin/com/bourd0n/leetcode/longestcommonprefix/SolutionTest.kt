package com.bourd0n.leetcode.longestcommonprefix

import org.junit.Assert.*
import org.junit.Test

class SolutionTest {

    private val solution = Solution()

    private fun test(strs: Array<String>): String {
        return solution.longestCommonPrefixBinary(strs)
    }

    @Test
    fun test1() {
        assertEquals("fl", test(arrayOf("flower", "flow", "flight")))
    }

    @Test
    fun test2() {
        assertEquals("", test(arrayOf("ower", "flow", "flight")))
    }

    @Test
    fun test3() {
        assertEquals("f", test(arrayOf("fower", "flow", "flight")))
    }

    @Test
    fun test4() {
        assertEquals("", test(arrayOf("", "")))
    }

    @Test
    fun test5() {
        assertEquals("", test(arrayOf("")))
    }

    @Test
    fun test6() {
        assertEquals("let", test(arrayOf("let", "let", "let")))
    }

    @Test
    fun test7() {
        assertEquals("aa", test(arrayOf("aaa", "aa", "aaa")))
    }

    @Test
    fun test8() {
        assertEquals("a", test(arrayOf("a")))
    }
}
