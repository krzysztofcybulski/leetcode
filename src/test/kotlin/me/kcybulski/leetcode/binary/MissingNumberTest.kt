package me.kcybulski.leetcode.binary

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class MissingNumberTest : FunSpec({

    val algorithm = MissingNumber()

    test("example 1") {
        val nums = intArrayOf(3,0,1)
        algorithm.missingNumber(nums) shouldBe 2
    }

    test("example 2") {
        val nums = intArrayOf(0,1)
        algorithm.missingNumber(nums) shouldBe 2
    }

    test("example 3") {
        val nums = intArrayOf(9,6,4,2,3,5,7,0,1)
        algorithm.missingNumber(nums) shouldBe 8
    }
})
