package me.kcybulski.leetcode.binary

class CountingBits {
    fun countBits(n: Int): IntArray {
        val array = IntArray(n + 1)
        array[0] = 0
        for (i in 1..n) {
            array[i] = array[i.shr(1)] + i.and(1)
        }
        return array
    }
}
