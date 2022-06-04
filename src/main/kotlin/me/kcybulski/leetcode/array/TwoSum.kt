package me.kcybulski.leetcode.array

class TwoSum {

    fun twoSum(nums: IntArray, target: Int): IntArray {
        val positionsToSum = nums
            .mapIndexed { index, num -> num to index }
            .groupBy { it.first }
            .mapValues { it.value.map { v -> v.second } }

        val firstThatCanSum = nums
            .filter { num -> target - num in positionsToSum }
            .first { num -> target - num != num || positionsToSum[num]!!.size > 1 }

        return intArrayOf(
            positionsToSum[firstThatCanSum]!!.first(),
            positionsToSum[target - firstThatCanSum]!!.last()
        )
    }

}
