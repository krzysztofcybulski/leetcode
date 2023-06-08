package me.kcybulski.leetcode.binary

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class CountingBitsTest : FunSpec({

    val algorithm = CountingBits()

    test("example 1") {
        algorithm.countBits(2) shouldBe intArrayOf(0, 1, 1)
    }

    test("example 2") {
        algorithm.countBits(5) shouldBe intArrayOf(0, 1, 1, 2, 1, 2)
    }
})
