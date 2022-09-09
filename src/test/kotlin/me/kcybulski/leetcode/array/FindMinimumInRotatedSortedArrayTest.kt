package me.kcybulski.leetcode.array

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class FindMinimumInRotatedSortedArrayTest : FunSpec({

    val algorithm = FindMinimumInRotatedSortedArray()

    test("example 1") {
        // given
        val nums = intArrayOf(3,4,5,1,2)

        // expect
        algorithm.findMin(nums) shouldBe 1
    }

    test("example 2") {
        // given
        val nums = intArrayOf(4,5,6,7,0,1,2)

        // expect
        algorithm.findMin(nums) shouldBe 0
    }

    test("example 3") {
        // given
        val nums = intArrayOf(11,13,15,17)

        // expect
        algorithm.findMin(nums) shouldBe 11
    }

})
