package io.github.abitgen.leetcode.challenge30.twenty20April._13_contiguousArray

import io.github.abitgen.leetcode.challenge30.twenty20April._3_maximumSubarray.MaxSubArray
import kotlin.math.max

object ContiguousArray {
    fun findMaxLength(nums: IntArray): Int {
        return max(maxUniArrayLength(nums), maxUniArrayLength(nums.reversedArray()))
    }

    /**
     * More visual explanation here
     * - https://leetcode.com/problems/contiguous-array/discuss/99655/Python-O(n)-Solution-with-Visual-Explanation
     */
    private fun maxUniArrayLength(nums: IntArray): Int {
        val newArrayList = nums.map { if (it == 0) -1 else it }
        /**
         * Setting map with init value of 0 th sum set at -1 index, i.e coordinate (-1,0)
         * So that if the input is (0, 1) the plotted graph will be at coordinates(0,-1), (1,0),
         * so the max distance will be (-1,0) to (1,0) which will be 2.
         */
        val map = hashMapOf<Int, Int>(0 to -1)
        var sumOfArray = 0
        var maxLength = 0
        for (i in newArrayList.indices) {

            sumOfArray += newArrayList[i]
            /**
             * Keeping a map of total Sum Till Now with its respective index
             * If the sum repeats again, the if block is executed where max length is calculated by the
             * difference of the current index with the existing one stored in the map initially (in else block)
             */
            if (map[sumOfArray] != null) {
                /**
                 *   On each subsequent addition, m
                 */
                maxLength = max(maxLength, i - map.getOrDefault(sumOfArray, 0))
            } else {
                map[sumOfArray] = i
            }
        }
        return maxLength
    }
}

fun main() {
    println(ContiguousArray.findMaxLength(intArrayOf(0, 1))) // 1
    println(ContiguousArray.findMaxLength(intArrayOf(1, 0, 1, 1, 1, 0, 0, 1, 1, 0))) //6
    println(
        ContiguousArray.findMaxLength(
            intArrayOf(
                1,
                1,
                0,
                0,
                0,
                0,
                0,
                0,
                0,
                1,
                1,
                1,
                0,
                1,
                1,
                1,
                1,
                0,
                1,
                1,
                1,
                1,
                0,
                0,
                1,
                0,
                1,
                1,
                1,
                1,
                1,
                0,
                1,
                1,
                1,
                1
            )
        )
    )// Expected - 24
}