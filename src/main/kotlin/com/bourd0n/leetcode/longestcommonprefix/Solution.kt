package com.bourd0n.leetcode.longestcommonprefix

import kotlin.collections.ArrayList

class Solution {
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        val list = ArrayList<Char>()
        strs[0].chars().forEach { i -> list.add(i.toChar()) }
        var commonSize = list.size
        for (i in 1 until strs.size) {
            val charArray = strs[i].toCharArray()
            var j = 0
            for (c in 0 until commonSize) {
                if (j < charArray.size && list[c] == charArray[j]) {
                    j++
                } else {
                    break
                }
            }
            commonSize = j
        }
        var s = ""
        for (c in list) {
            if (commonSize == 0) {
                break
            }
            s += c
            commonSize--;
        }
        return s;
    }

    //Approach 1: Horizontal scanning
    fun longestCommonPrefix2(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        var prefix = strs[0]
        for (i in 1 until strs.size)
            while (strs[i].indexOf(prefix) != 0) {
                prefix = prefix.substring(0, prefix.length - 1)
                if (prefix.isEmpty()) return ""
            }
        return prefix
    }

    //Approach 2: Vertical scanning
    fun longestCommonPrefix3(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        for (i in 0 until strs[0].length) {
            val c = strs[0][i]
            for (j in 1 until strs.size) {
                if ((strs[j].length == i) || (strs[j][i] != c)) {
                    return strs[0].substring(0, i);
                }
            }
        }
        return strs[0]
    }

    //Approach 3: Divide and conquer
    fun longestCommonPrefix4(strs: Array<String>): String {
        if (strs.isEmpty()) return ""
        return longestCommonPrefixDivide(strs, 0, strs.size - 1);
    }

    private fun longestCommonPrefixDivide(strs: Array<String>, l: Int, r: Int): String {
        if (l == r) {
            return strs[l]
        }
        val mid = (l + r) / 2;
        val lcpLeft = longestCommonPrefixDivide(strs, l, mid);
        val lcpRight = longestCommonPrefixDivide(strs, mid + 1, r);
        return commonPrefixTwoString(lcpLeft, lcpRight);
    }

    private fun commonPrefixTwoString(lcpLeft: String, lcpRight: String): String {
        val min = Math.min(lcpLeft.length, lcpRight.length)
        for (i in 0 until min) {
            if (lcpLeft[i] != lcpRight[i]) {
                return lcpLeft.substring(0, i);
            }
        }
        return lcpLeft.substring(0, min)
    }

    //Binary search
    fun longestCommonPrefixBinary(strs: Array<String>) : String {
        if (strs.isEmpty()) return ""
        var m = strs[0].length / 2 + 1
        var longestCommonPrefix = ""
        while (m > 0 && m <= strs[0].length) {
            val curPrefix = strs[0].substring(0, m)
            var commonPrefix = true
            for (i in 1 until strs.size) {
                if (strs[i].indexOf(curPrefix) != 0) {
                    commonPrefix = false
                    break
                }
            }
            when {
                commonPrefix -> {
                    longestCommonPrefix = curPrefix
                    m += 1
                }
                longestCommonPrefix.isNotEmpty() -> return longestCommonPrefix
                else -> m -= 1
            }
        }
        return longestCommonPrefix
    }
}

