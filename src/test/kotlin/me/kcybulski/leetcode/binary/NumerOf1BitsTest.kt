package me.kcybulski.leetcode.binary

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class NumerOf1BitsTest : FunSpec({

    val algorithm = NumberOf1Bits()

    test("example 1") {
        algorithm.hammingWeight(521) shouldBe 3
    }

    test("example 2") {
        algorithm.hammingWeight(2097152) shouldBe 1
    }

    test("example 3") {
        algorithm.hammingWeight(-3) shouldBe 31
    }
})
