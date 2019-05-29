package com.bourd0n.leetcode.mergetwosortedlists

/**
 * Example:
 * var li = ListNode(5)
 * var v = li.`val`
 * Definition for singly-linked list.
 * class ListNode(var `val`: Int) {
 *     var next: ListNode? = null
 * }
 */
class Solution {
    fun mergeTwoLists(l1: ListNode?, l2: ListNode?): ListNode? {
        if (l1 == null) return l2
        if (l2 == null) return l1
        var curL: ListNode? = l1
        var curR: ListNode? = l2
        var result : ListNode? = null
        var current : ListNode? = null
        while (curL != null || curR != null) {
            val vl = curL?.`val`
            val vr = curR?.`val`
            val nodeToAdd = when {
                vl == null && vr == null -> null
                vl == null -> {
                    curR = curR?.next
                    ListNode(vr!!)
                }
                vr == null -> {
                    curL = curL?.next
                    ListNode(vl)
                }
                vl <= vr -> {
                    curL = curL?.next
                    ListNode(vl)
                }
                else -> {
                    curR = curR?.next
                    ListNode(vr)
                }
            }
            if (result == null) {
                result = nodeToAdd
                current = nodeToAdd
            } else {
                current!!.next = nodeToAdd
                current = nodeToAdd
            }
        }
        return result
    }
}

data class ListNode(var `val`: Int) {
    var next: ListNode? = null
}
