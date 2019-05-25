package com.bourd0n.leetcode.validparentheses


import java.util.*

class Solution {
    fun isValid(s: String): Boolean {
        if (s.isEmpty()) return true
        val charArray = s.toCharArray()
        val queue = ArrayDeque<Char>()
        for (c in charArray) {
            when (c) {
                '(', '{', '[' -> queue.push(c)
                ')' -> if (queue.poll() != '(') return false
                '}' -> if (queue.poll() != '{') return false
                ']' -> if (queue.poll() != '[') return false
            }
        }
        return queue.isEmpty()
    }
}
