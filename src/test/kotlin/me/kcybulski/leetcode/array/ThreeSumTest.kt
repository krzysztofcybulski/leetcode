package me.kcybulski.leetcode.array

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe

class ThreeSumTest : FunSpec({

    val algorithm = ThreeSum()

    test("example 1") {
        // given
        val nums = intArrayOf(-1,0,1,2,-1,-4)

        // expect
        algorithm.threeSum(nums) shouldBeIgnoringOrder listOf(
            listOf(-1,-1,2),
            listOf(-1,0,1)
        )
    }

    test("example 2") {
        // given
        val nums = intArrayOf(0, 1, 1)

        // expect
        algorithm.threeSum(nums) shouldBe emptyList()
    }

    test("example 3") {
        // given
        val nums = intArrayOf(0, 0, 0)

        // expect
        algorithm.threeSum(nums) shouldBe listOf(listOf(0, 0, 0))
    }
})

private infix fun List<List<Int>>.shouldBeIgnoringOrder(expected: List<List<Int>>) {
    size shouldBe expected.size
    map { it.toSet() }.toSet() shouldBe expected.map { it.toSet() }.toSet()
}