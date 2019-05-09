package com.bourd0n.leetcode.reverseinteger

internal class Solution {

/*
    fun reverse(x: Int): Int {
        val str = Integer.toString(x)
        val chars = str.toCharArray()
        if (chars.size == 1) {
            return x
        }
        val result = ArrayList<Char>()
        val j = 0
        if (chars[0] == '-') {
            result.add('-')
        }
        var zeroEnd = false
        for (i in chars.indices.reversed()) {
            if (i == 0 && chars[0] == '-') {
                continue
            }
            if (!zeroEnd) {
                if (chars[i] == '0') {
                    continue
                } else {
                    zeroEnd = true
                }
            }
            result.add(chars[i])
        }
        val res = CharArray(result.size)
        for (i in result.indices) {
            res[i] = result[i]
        }
        try {
            return String(res).toInt()
        } catch (e: NumberFormatException) {
            return 0
        }

    }
*/

    fun reverse(x: Int): Int {
        var workX = x
        var rev: Long = 0
        while (workX != 0) {
            rev = rev * 10 + workX % 10
            workX /= 10
            if (rev > Integer.MAX_VALUE || rev < Integer.MIN_VALUE) {
                return 0
            }
        }
        return rev.toInt()
    }
}
