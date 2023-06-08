package me.kcybulski.leetcode.binary

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class SumOfTwoIntegersTest : FunSpec({

    val algorithm = SumOfTwoIntegers()

    test("example 1") {
        algorithm.getSum(1, 2) shouldBe  3
    }

    test("example 2") {
        algorithm.getSum(2, 3) shouldBe  5
    }
})
