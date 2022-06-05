package me.kcybulski.leetcode.array

class ContainsDuplicate {

    fun containsDuplicate(nums: IntArray): Boolean {
        val savedNums: MutableSet<Int> = mutableSetOf()
        nums.forEach { n ->
            if(n in savedNums) return true
            savedNums += n
        }
        return false
    }

}
