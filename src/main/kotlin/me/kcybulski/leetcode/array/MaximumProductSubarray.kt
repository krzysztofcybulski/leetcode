package me.kcybulski.leetcode.array

class MaximumProductSubarray {

    fun maxProduct(nums: IntArray): Int {
        var maxSoFar = nums[0]
        var maxEndingHere = nums[0]

        nums
            .drop(1)
            .forEach { num ->
                maxEndingHere = Integer.max(maxEndingHere * num, num)
                maxSoFar = Integer.max(maxSoFar, maxEndingHere)
            }

        return maxSoFar
    }
}