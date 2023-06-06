package me.kcybulski.leetcode.array

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ContainerWithMostWaterTest : FunSpec({

    val algorithm = ContainerWithMostWater()

    test("example 1") {
        // given
        val nums = intArrayOf(1,8,6,2,5,4,8,3,7)

        // expect
        algorithm.maxArea(nums) shouldBe 49
    }

    test("example 2") {
        // given
        val nums = intArrayOf(1, 1)

        // expect
        algorithm.maxArea(nums) shouldBe 1
    }
})
