package me.kcybulski.leetcode.array

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class BestTimeToBuyAndSellStockTest : FunSpec({

    val algorithm = BestTimeToBuyAndSellStock()

    test("example 1") {
        // given
        val prices = intArrayOf(7, 1, 5, 3, 6, 4)

        // expect
        algorithm.maxProfit(prices) shouldBe 5
    }

    test("example 2") {
        // given
        val prices = intArrayOf(7, 6, 4, 3, 1)

        // expect
        algorithm.maxProfit(prices) shouldBe 0
    }
})
