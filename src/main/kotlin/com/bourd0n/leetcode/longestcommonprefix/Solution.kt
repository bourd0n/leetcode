package com.bourd0n.leetcode.longestcommonprefix

import java.util.*

class Solution {
    //todo: optimization
    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty()) {
            return ""
        }
        val list = LinkedList<Char>()
        strs[0].chars().forEach { i -> list.add(i.toChar())}
        var commonSize = list.size
        for (i in 1 until strs.size) {
            val charArray = strs[i].toCharArray()
            var j = 0
            for (c in list) {
                if (j < charArray.size && c == charArray[j]) {
                    j++
                } else {
                    break
                }
            }
            if (j < commonSize) {
                commonSize = j
            }
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
}
