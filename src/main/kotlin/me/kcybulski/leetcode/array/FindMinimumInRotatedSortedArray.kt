package me.kcybulski.leetcode.array

class FindMinimumInRotatedSortedArray {

    fun findMin(nums: IntArray): Int {
        val mid = nums[nums.size / 2]
        if(nums.size == 2) {
            return if(nums[0] <= nums[1]) nums[0] else nums[1]
        }
        return if(mid < nums[0]) {
            findMin(nums.sliceArray(0 ..nums.size / 2))
        } else if(mid > nums.last()) {
            findMin(nums.sliceArray(nums.size / 2 until nums.size))
        } else {
            nums.first()
        }
    }

}