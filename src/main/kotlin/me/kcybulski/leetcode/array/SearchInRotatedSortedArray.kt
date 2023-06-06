package me.kcybulski.leetcode.array

class SearchInRotatedSortedArray {

    fun search(nums: IntArray, target: Int): Int {
        var mid = 0
        var left = 0
        var right = nums.size - 1
        while(left <= right) {
            mid = left + ((right - left) / 2)
            if(nums[mid] == target) {
                return mid
            }
            if(nums[left] <= nums[mid]) {
                if(target >= nums[left] && target < nums[mid]) {
                    right = mid - 1
                } else {
                    left = mid + 1
                }
            } else {
                if(target > nums[mid] && target <= nums[right]) {
                    left = mid + 1
                } else {
                    right = mid - 1
                }
            }
        }
        return if(nums[mid] == target) mid else -1
    }
}

//[4,5,6,7, 8 , 9,10,0,1,2]

//[1,3] 3