package com.bourd0n.leetcode.palindromenumber

class Solution {
    fun isPalindrome(input: Int): Boolean {
        if (input < 0 || (input % 10 == 0 && input != 0)) {
            return false
        }
        var x = input
        var rev = 0
        while (x > rev) {
            rev = rev * 10 + x % 10
            x /= 10
        }
        return x == rev || x == rev / 10 ;
    }

    fun isPalindrome2(input: Int): Boolean {
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
