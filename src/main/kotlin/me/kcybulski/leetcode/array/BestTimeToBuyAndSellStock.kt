package me.kcybulski.leetcode.array

import kotlin.math.max

class BestTimeToBuyAndSellStock {

    fun maxProfit(prices: IntArray): Int =
        prices
            .foldRight(listOf(0)) { price, maxPrices -> listOf(max(price, maxPrices.first())) + maxPrices }
            .dropLast(1)
            .zip(prices.toList()) { a, b -> a - b }
            .maxOrNull()!!
}
