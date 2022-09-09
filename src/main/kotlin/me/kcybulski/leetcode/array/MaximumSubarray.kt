package me.kcybulski.leetcode.array

import java.lang.Integer.max

class MaximumSubarray {

    fun maxSubArray(nums: IntArray): Int {
        var maxSoFar = nums[0]
        var maxEndingHere = nums[0]

        nums
            .drop(1)
            .forEach { num ->
                maxEndingHere = max(maxEndingHere + num, num)
                maxSoFar = max(maxSoFar, maxEndingHere)
            }

        return maxSoFar
    }

}
