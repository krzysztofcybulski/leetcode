package me.kcybulski.leetcode.array

class ThreeSum {

    fun threeSum(nums: IntArray): List<List<Int>> {
        val triplets = mutableSetOf<List<Int>>()
        nums.sort()
        nums
            .dropLast(2)
            .forEachIndexed { index, current ->
                var left = index + 1
                var right = nums.size - 1
                while(left < right) {
                    val sum = nums[left] + nums[right] + current
                    when {
                        sum == 0 -> triplets += listOf(nums[left++], nums[right--], current)
                        sum > 0 -> right--
                        sum < 0 -> left++
                    }
                }
            }
        return triplets.toList()
    }

}
