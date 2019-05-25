package com.bourd0n.leetcode.validparentheses

import org.junit.Assert.assertFalse
import org.junit.Assert.assertTrue
import org.junit.Test

class SolutionTest {

    private val solution = Solution()

    private fun test(s: String) : Boolean {
        return solution.isValid(s);
    }

    @Test
    fun test1() {
        assertTrue(test("()"));
    }

    @Test
    fun test2() {
        assertTrue(test("()[]{}"));
    }

    @Test
    fun test3() {
        assertFalse(test("([)]"));
    }

    @Test
    fun test4() {
        assertFalse(test("(]"));
    }

    @Test
    fun test5() {
        assertTrue(test("{[]}"));
    }

    @Test
    fun test6() {
        assertTrue(test(""));
    }
}
