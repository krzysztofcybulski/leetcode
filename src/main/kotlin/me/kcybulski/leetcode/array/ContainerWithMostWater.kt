package me.kcybulski.leetcode.array

import kotlin.math.min

class ContainerWithMostWater {

    fun maxArea(height: IntArray): Int {
        var max = 0
        var left = 0
        var right = height.size - 1
        while(left < right) {
            val current = (right - left) * min(height[right], height[left])
            if(current > max) {
                max = current
            }
            if(height[right] < height[left]) {
                right--
            } else {
                left++
            }
        }
        return max
    }

}