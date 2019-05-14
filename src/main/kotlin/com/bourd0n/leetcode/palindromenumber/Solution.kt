package com.bourd0n.leetcode.palindromenumber

class Solution {
    fun isPalindrome(input: Int): Boolean {
        if (input < 0) {
            return false
        }
        var x = input
        var rev = 0L
        while (x > 0) {
            rev = rev * 10 + x % 10
            x /= 10
            if (rev > Int.MAX_VALUE || rev < Int.MIN_VALUE) {
                return false
            }
        }
        return rev.toInt() == input;
    }
}
