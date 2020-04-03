package io.github.abitgen.leetcode.challenge30.twenty20April._3_maximumSubarray

import kotlin.math.max

object MaxSubArray {
    /**
     * My solution leetcode runtime : 192ms
     */
    fun maxSubArray(nums: IntArray): Int {

        val computedArray = IntArray(nums.size)
        var totalSum = nums[0]
        computedArray[0] = nums[0]
        if (nums.isNotEmpty()) {
            for (i in 1 until nums.size) {
                computedArray[i] = max(nums[i], nums[i] + computedArray[i - 1])

                if ( computedArray[i] > totalSum) {
                    totalSum = computedArray[i]
                }
            }
        }

        return totalSum
    }
}

fun main() {
    println(MaxSubArray.maxSubArray(intArrayOf(-2, 1, -3, 4, -1, 2, 1, -5, 4)))
}