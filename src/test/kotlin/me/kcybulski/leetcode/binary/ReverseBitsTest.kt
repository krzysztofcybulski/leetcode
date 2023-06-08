package me.kcybulski.leetcode.binary

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ReverseBitsTest : FunSpec({

    val algorithm = ReverseBits()

    test("example 1") {
        algorithm.reverseBits(1210061376) shouldBe 964176192
    }

    test("example 2") {
        algorithm.reverseBits(-3) shouldBe 3221225471
    }
})
