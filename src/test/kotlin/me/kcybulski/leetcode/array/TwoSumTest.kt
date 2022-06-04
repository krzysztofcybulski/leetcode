package me.kcybulski.leetcode.array

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class TwoSumTest : FunSpec({

    val algorithm = TwoSum()

    test("example 1") {
        // given
        val nums = intArrayOf(2,7,11,15)
        val target = 9

        // expect
        algorithm.twoSum(nums, target) shouldBe intArrayOf(0, 1)
    }

    test("example 2") {
        // given
        val nums = intArrayOf(3, 2, 4)
        val target = 6

        // expect
        algorithm.twoSum(nums, target) shouldBe intArrayOf(1, 2)
    }

    test("example 3") {
        // given
        val nums = intArrayOf(3, 3)
        val target = 6

        // expect
        algorithm.twoSum(nums, target) shouldBe intArrayOf(0, 1)
    }
})
