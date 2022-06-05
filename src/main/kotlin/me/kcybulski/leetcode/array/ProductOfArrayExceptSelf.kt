package me.kcybulski.leetcode.array

class ProductOfArrayExceptSelf {

    fun productExceptSelf(nums: IntArray): IntArray {
        return when (nums.count { it == 0 }) {
            0 -> withoutZeros(nums)
            1 -> oneZero(nums)
            else -> IntArray(nums.size) { 0 }
        }
    }

    private fun withoutZeros(nums: IntArray): IntArray {
        val product = nums.reduce(Int::times)
        return nums.map { product / it }.toIntArray()
    }

    private fun oneZero(nums: IntArray): IntArray {
        val product = nums
            .filterNot { it == 0 }
            .reduce(Int::times)
        val zeros = IntArray(nums.size) { 0 }
        zeros[nums.indexOf(0)] = product
        return zeros
    }

}
