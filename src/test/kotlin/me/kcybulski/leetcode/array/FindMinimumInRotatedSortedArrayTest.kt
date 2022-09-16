package me.kcybulski.leetcode.array

import io.kotest.core.spec.style.FunSpec
import io.kotest.matchers.shouldBe
import io.kotest.property.Arb
import io.kotest.property.arbitrary.int
import io.kotest.property.arbitrary.intArray
import io.kotest.property.forAll
import java.util.Collections

class FindMinimumInRotatedSortedArrayTest : FunSpec({

    val algorithm = FindMinimumInRotatedSortedArray()

    test("example 1") {
        // given
        val nums = intArrayOf(3,4,5,1,2)

        // expect
        algorithm.findMin(nums) shouldBe 1
    }

    test("example 2") {
        // given
        val nums = intArrayOf(4,5,6,7,0,1,2)

        // expect
        algorithm.findMin(nums) shouldBe 0
    }

    test("example 3") {
        // given
        val nums = intArrayOf(11,13,15,17)

        // expect
        algorithm.findMin(nums) shouldBe 11
    }

    test("random") {
        forAll(Arb.intArray(Arb.int(1, 1000), Arb.int()), Arb.int(1000)) { list, rotation ->
            // given
            val sortedList = list.sorted()
            Collections.rotate(sortedList, rotation)

            // expect
            algorithm.findMin(sortedList.toIntArray()) == list.minOrNull()
        }
    }
})
