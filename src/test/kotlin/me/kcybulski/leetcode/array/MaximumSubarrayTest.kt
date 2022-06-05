package me.kcybulski.leetcode.array

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MaximumSubarrayTest : FunSpec({

    val algorithm = MaximumSubarray()

    test("example 1") {
        // given
        val nums = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)

        // expect
        algorithm.maxSubArray(nums) shouldBe 6
    }

    test("example 2") {
        // given
        val nums = intArrayOf(1)

        // expect
        algorithm.maxSubArray(nums) shouldBe 1
    }

    test("example 3") {
        // given
        val nums = intArrayOf(5,4,-1,7,8)

        // expect
        algorithm.maxSubArray(nums) shouldBe 23
    }

})
