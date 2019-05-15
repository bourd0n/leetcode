package com.bourd0n.leetcode.romantointeger

class Solution {
    fun romanToInt(s: String): Int {
        val romans = hashMapOf<Char, Int>(
            'I' to 1,
            'V' to 5,
            'X' to 10,
            'L' to 50,
            'C' to 100,
            'D' to 500,
            'M' to 1000)
        var lastNumber: Int = 0
        var result: Int = 0
        for (c in s.toCharArray().reversed()) {
            val curNumber = romans[c]!!
            if (lastNumber > curNumber) {
                result -= curNumber
            } else {
                result += curNumber
            }
            lastNumber = curNumber
        }
        return result
    }
}
