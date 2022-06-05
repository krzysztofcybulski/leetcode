package me.kcybulski.leetcode.array

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ProductOfArrayExceptSelfTest : FunSpec({

    val algorithm = ProductOfArrayExceptSelf()

    test("example 1") {
        // given
        val nums = intArrayOf(1, 2, 3, 4)

        // expect
        algorithm.productExceptSelf(nums) shouldBe intArrayOf(24, 12, 8, 6)
    }

    test("example 2") {
        // given
        val nums = intArrayOf(-1, 1, 0, -3, 3)

        // expect
        algorithm.productExceptSelf(nums) shouldBe intArrayOf(0, 0, 9, 0, 0)
    }

})
