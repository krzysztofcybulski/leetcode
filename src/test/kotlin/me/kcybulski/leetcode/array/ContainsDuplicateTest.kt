package me.kcybulski.leetcode.array

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ContainsDuplicateTest : FunSpec({

    val algorithm = ContainsDuplicate()

    test("example 1") {
        // given
        val nums = intArrayOf(1, 2, 3, 1)

        // expect
        algorithm.containsDuplicate(nums) shouldBe true
    }

    test("example 2") {
        // given
        val nums = intArrayOf(1, 2, 3, 4 )

        // expect
        algorithm.containsDuplicate(nums) shouldBe false
    }

    test("example 3") {
        // given
        val nums = intArrayOf(1,1,1,3,3,4,3,2,4,2)

        // expect
        algorithm.containsDuplicate(nums) shouldBe true
    }
})
