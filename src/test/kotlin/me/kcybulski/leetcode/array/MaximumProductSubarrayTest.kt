package me.kcybulski.leetcode.array

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MaximumProductSubarrayTest : FunSpec({

    val algorithm = MaximumProductSubarray()

    test("example 1") {
        // given
        val nums = intArrayOf(2,3,-2,4)

        // expect
        algorithm.maxProduct(nums) shouldBe 6
    }

    test("example 2") {
        // given
        val nums = intArrayOf(-2,0,-1)

        // expect
        algorithm.maxProduct(nums) shouldBe 0
    }
})
