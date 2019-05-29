package com.bourd0n.leetcode.mergetwosortedlists

import org.junit.Assert
import org.junit.Test

class SolutionTest {

    private val solution = Solution()
    private fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        return solution.mergeTwoLists(l1, l2)
    }

    @Test
    fun test() {
        val l1 = ListNode(4)
        val l2 = ListNode(2)
        val l3 = ListNode(1)
        l2.next = l1
        l3.next = l2

        val l4 = ListNode(4)
        val l5 = ListNode(3)
        val l6 = ListNode(1)
        l6.next = l5
        l5.next = l4

        val r1 = ListNode(1)
        val r2 = ListNode(1)
        val r3 = ListNode(2)
        val r4 = ListNode(3)
        val r5 = ListNode(4)
        val r6 = ListNode(4)
        r1.next = r2
        r2.next = r3
        r3.next = r4
        r4.next = r5
        r5.next = r6

        Assert.assertEquals(r1, mergeTwoLists(l3, l6))

    }
}
