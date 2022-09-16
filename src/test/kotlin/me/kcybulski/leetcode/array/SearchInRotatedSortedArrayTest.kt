package me.kcybulski.leetcode.array

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SearchInRotatedSortedArrayTest : FunSpec({

    val algorithm = SearchInRotatedSortedArray()

    test("example 1") {
        // given
        val nums = intArrayOf(4,5,6,7,0,1,2)

        // expect
        algorithm.search(nums, 0) shouldBe 4
    }

    test("example 2") {
        // given
        val nums = intArrayOf(4,5,6,7,0,1,2)

        // expect
        algorithm.search(nums, 3) shouldBe -1
    }

    test("example 3") {
        // given
        val nums = intArrayOf(1)

        // expect
        algorithm.search(nums, 0) shouldBe -1
    }
})
