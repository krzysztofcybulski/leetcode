package me.kcybulski.leetcode.array

import kotlin.math.max

class BestTimeToBuyAndSellStock {

    fun maxProfit(prices: IntArray): Int {
        val maxes = IntArray(prices.size + 1)
        maxes[prices.size] = 0
        prices
            .indices
            .reversed()
            .forEach { i ->
                maxes[i] = max(prices[i], maxes[i + 1])
            }
        return maxes
            .zip(prices.toList()) { a, b -> a - b }
            .maxOrNull()!!
    }
}
