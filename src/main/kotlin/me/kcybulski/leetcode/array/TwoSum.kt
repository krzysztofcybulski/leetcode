package me.kcybulski.leetcode.array

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val complements: MutableMap<Int, Int> = mutableMapOf()

        nums.forEachIndexed { index, num ->
            if(target - num in complements) {
                return intArrayOf(complements[target - num]!!, index)
            }
            complements[num] = index
        }

        error("No solution found")
    }

}
